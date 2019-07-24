<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>EduMS教务系统-登录页面</title>

    <!-- CSS -->
    <link rel="stylesheet" href="http://fonts.googleapis.com/css?family=Roboto:400,100,300,500">
    <link rel="stylesheet" href="assets/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="assets/font-awesome/css/font-awesome.min.css">
    <link rel="stylesheet" href="assets/css/form-elements.css">
    <link rel="stylesheet" href="assets/css/style.css">

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
    <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

    <!-- Favicon and touch icons -->
    <link rel="shortcut icon" href="assets/ico/favicon.png">
    <link rel="apple-touch-icon-precomposed" sizes="144x144" href="assets/ico/apple-touch-icon-144-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="114x114" href="assets/ico/apple-touch-icon-114-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="72x72" href="assets/ico/apple-touch-icon-72-precomposed.png">
    <link rel="apple-touch-icon-precomposed" href="assets/ico/apple-touch-icon-57-precomposed.png">

    <!--layui-->
    <link rel="stylesheet" href="layui/css/layui.css" media="all">

</head>

<body>

<!-- Top content -->
<div class="top-content">

    <div class="inner-bg">
        <div class="container">
            <div class="row">
                <div class="col-sm-8 col-sm-offset-2 text">
                    <h1>欢迎使用<strong>EduMS教务后台管理系统</strong></h1>
                    <div class="description">
                        <p>请登录微信小程序<strong>扫描二维码</strong>进行登录！或者您可以选择<strong>其他方式登录!</strong>
                        </p>
                    </div>
                </div>
            </div>
            <div class="row">
                <div class="col-sm-6 col-sm-offset-3 form-box">

                    <div class="form-bottom" style="width: 400px;">

                        <!--二维码区域 -->
                        <img id="erweima" src="/userctlr/ErWeiMa.do">

                    </div>
                </div>
            </div>
            <div class="row">
                <div class="col-sm-6 col-sm-offset-3 social-login">
                    <h3>...或者您可以选择一下方式登录:</h3>
                    <div class="social-login-buttons">
                        <a class="btn btn-link-2" href="login.jsp">
                            <i class="fa fa-facebook"></i> 账号密码登录
                        </a>
                        <a class="btn btn-link-2" href="loginByFace.jsp">
                            <i class="fa fa-twitter"></i> 人脸识别登录
                        </a>
                        <a class="btn btn-link-2" href="loginByPhone.jsp">
                            <i class="fa fa-google-plus"></i> 手机验证码快速登录
                        </a>
                    </div>
                </div>
            </div>
        </div>
    </div>

</div>



<!-- Javascript -->
<script src="js/jquery-3.3.1.min.js"></script>
<script src="assets/bootstrap/js/bootstrap.min.js"></script>
<script src="assets/js/jquery.backstretch.min.js"></script>
<script src="assets/js/scripts.js"></script>

<!--[if lt IE 10]>
<script src="assets/js/placeholder.js"></script>
<![endif]-->
<script src="layui/layui.js" charset="utf-8"></script>

<script>
    layui.use(['form', 'layedit', 'laydate'], function () {
        var form = layui.form
            , layer = layui.layer
            , layedit = layui.layedit
            , laydate = layui.laydate;



    });



    $(document).ready(function () {


        var times=window.setInterval(check,1000);

        function check() {
            $.ajax({
                type:"post",
                url:"/userctlr/CheckWeiXinStatus.do",
                xhrFields: {
                    withCredentials: true
                },
                crossDomain: true,
                success:function (data) {
                    // alert(data)
                    if(data=='true'){

                        window.location.href="index.jsp"
                        window.clearInterval(times)
                    }
                },
                error:function () {

                }

            })
        }

    });



</script>


</body>
</html>