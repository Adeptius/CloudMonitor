<!DOCTYPE html>
<html lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>Registration</title>

    <script src="js/jquery-3.2.1.min.js"></script>
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <script src="js/bootstrap.min.js"></script>

    <script src="js/login.js"></script>
    <link href="css/general.css" rel="stylesheet">
    <link href="css/login.css" rel="stylesheet">

</head>

<body>
<div class="login-container">
    <h1 class="h1reg"><b>Вход</b></h1>
    <!--Логин-->
    <div id="inputLoginDiv" class="form-group has-success">
        <label class="control-label">Логин</label>
        <input type="text" class="form-control" id="loginField" aria-describedby="helpBlock2">
        <span class="help-block"></span>
    </div>

    <!--Пароль-->
    <div id="inputPasswordDiv" class="form-group has-success">
        <label class="control-label">Пароль</label>
        <input type="password" class="form-control" id="passwordField" aria-describedby="helpBlock2">
        <span class="help-block"></span>
    </div>


    <a href="registration.html" style="float: right; margin-bottom: 20px; font-size: larger">Еще нет аккаунта?</a>

    <button id="loginButton" type="button" class="center-block btn btn-success" style="clear: both;">Войти</button>

</div>

</body>
</html>