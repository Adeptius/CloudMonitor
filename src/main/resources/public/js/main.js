

var token;
$(document).ready(function () {
    token = localStorage.getItem('token');
    if (token === null || token === '') {
        window.location.href = '../login';
    }else {
        $.post('/authorization/checkToken',
            {token: token}, function (result) {
                if (result != 'true'){
                    window.location.href = '../login';
                }
            });
    }
    $('.logoutButton').on('click',function () {
        localStorage.setItem('token', '');
        window.location.href = '../login';
    });
    start();
});



function start() {
   showUserNameInHeader();
   addListenersToButtons();
   showSites();
}


function showUserNameInHeader() {
    $.ajax({
        url: '/user/getUser',
        type: 'post',
        headers: {
            Authorization: token
        },
        success: function (data) {
            var user = JSON.parse(data);
            var userName = user['login'];
            $('#userName').text(userName);
        }
    });
}

function addListenersToButtons() {
    $('#sitesButton').on('click', function () {
        showSites()
    });

    $('#settingsButton').on('click', function () {
        settingsButtonPressed();
    });
}



function settingsButtonPressed() {

}

function showSites() {
    var data = null;

    $.ajax({
        url: '/sites/getSites',
        type: 'post',
        headers: {
            Authorization: token
        },
        async: false,
        success: function (receivedData) {
            data = receivedData;
        }
    });


    $('.content').empty();
    for (var i = 0; i < data.length; i++) {
        var obj = data[i];
        obj.numerId = i+1;
        var htmlTemplate = $('#template').html();
        var content = tmpl(htmlTemplate, obj);
        $('.content').append(content);
        $('#number'+(i+1)).text(i+1);
    }
}