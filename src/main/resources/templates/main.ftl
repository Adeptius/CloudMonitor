<!DOCTYPE html>
<html lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title>Main</title>

    <script src="/js/jquery-3.2.1.min.js"></script>
    <link href="/css/bootstrap.min.css" rel="stylesheet"/>
    <script src="/js/bootstrap.min.js"></script>

    <script src="/js/templator.js"></script>
    <script src="/js/dao.js"></script>
    <script src="/js/main.js"></script>
    <link href="/css/general.css" rel="stylesheet"/>
    <link href="/css/main.css" rel="stylesheet"/>
</head>
<body>
<div class="header">
    <div>
        <h1 class="h1header">Cloud Monitor</h1>
    </div>

    <div style="float: right">
        <img src="images/icons/user_icon.png" style="height: 32px; width: 32px"/>
        <span id="userName" style="margin-right: 10px;font-size: large"></span>
        <a href='#' class='logoutButton'>Выйти</a>
    </div>
</div>
<div class="notHeader">
    <div class="sidebar">
        <div class="rounded">
            <ul style="margin-bottom: 0">
                <li>
                    <button id="sitesButton">
                        <div>
                            <span><img src="images/icons/sites.png"/></span>
                            <span>Мои сайты</span>
                        </div>
                    </button>
                </li>
                <li>
                    <button id="settingsButton">
                        <div>
                            <span><img src="images/icons/settings.png"/></span>
                            <span>Настройки</span>
                        </div>
                    </button>
                </li>
            </ul>
        </div>
    </div>
    <div class="content"></div>
</div>

<!--<div class="footer">FOOTER</div>-->

<script type="text/template" id="template">
    <div class="itemSite">
        <div class="rounded">
            <div class="row">
                <div class="col-md-3"><span class="word">Ссылка: </span></div>
                <div class="col-md-6"><input type="text" class="form-control" value="<%= url %>"/></div>
                <div class="col-md-3"></div>
            </div>
            <div class="row">
                <div class="col-md-3"><span class="word">Искать фразу: </span></div>
                <div class="col-md-6"><input type="text" class="form-control" value="<%= lookingWord %>"></div>
                <div class="col-md-3"></div>
            </div>
            <div class="row">
                <div class="col-md-3"><span class="word">Интервал проверки: </span></div>
                <div class="col-md-6"><input type="text" class="form-control" value="<%= checkDelay %>"></div>
                <div class="col-md-3"></div>
            </div>
            <div class="row">
                <div class="col-md-3"><span class="word">Ошибок до отправки письма: </span></div>
                <div class="col-md-6"><input type="text" class="form-control" value="<%= triesToEmail %>"></div>
                <div class="col-md-3"></div>
            </div>
            <div class="row">
                <div id="number<%= numerId %>" style="float: right; margin-right: 15px">Последняя проверка: </div>
            </div>
        </div>
    </div>
</script>
</body>
</html>