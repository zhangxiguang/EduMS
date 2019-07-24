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
                        <p>请输入您的<strong>手机号及短信验证码</strong>进行登录！或者您可以选择<strong>其他方式登录!</strong>
                        </p>
                    </div>
                </div>
            </div>
            <div class="row">
                <div class="col-sm-6 col-sm-offset-3 form-box">
                    <div class="form-top">
                        <div class="form-top-left">
                            <h3>登录</h3>
                            <p>请输入短信验证码:</p>
                        </div>
                        <div class="form-top-right">
                            <i class="fa fa-lock"></i>
                        </div>
                    </div>
                    <div class="form-bottom">
                        <form role="form" action="/userctlr/loginByPhone.do" method="post" class="login-form">
                            <div class="form-group">
                                <label class="sr-only" for="newTelNum">账户</label>
                                <input type="number" name="phone" placeholder="输入绑定手机号"
                                       class="form-username form-control" id="newTelNum">
                            </div>

                            <div class="form-group">
                                <button type="button" class="layui-btn layui-btn-normal" id="captchaBtn" onclick="getNoteCode(this)">
                                    点击获取验证码
                                </button>
                            </div>

                            <div class="form-group">
                                <label class="sr-only" for="duanxinNum">密码</label>
                                <input type="number" name="duanxinNum" placeholder="请输入手机短信验证码"
                                       class="form-password form-control" id="duanxinNum">
                            </div>
                            <div class="form-group">
                                <button type="button" class="layui-btn" id="TelNumCheck">立即验证</button>
                            </div>
                            <button id="loginBtn" type="submit" class="btn" disabled>点击登录</button>
                        </form>
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
                        <a class="btn btn-link-2" href="loginByWeiXin.jsp">
                            <i class="fa fa-twitter"></i> 手机扫码登录
                        </a>
                        <a class="btn btn-link-2" href="loginByFace.jsp">
                            <i class="fa fa-google-plus"></i> 人脸识别登录
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
</script>


<script type="text/javascript">

    //获取短信验证码
    var countDown = 60;


    function getNoteCode(val) {

        var newPhone = $("#newTelNum").val();
        <%--var oldPhone =${sessionScope.nowadmin.admphone}--%>

        if (newPhone == "" || newPhone == null) {

           layer.msg("请输入正确的手机号")

        } else if (newPhone.length==11) {
            $.ajax({
                type: "post",
                url: "/userctlr/sendTelNum.do",
                data: {
                    "newPhone": newPhone,
                },
                success: function (data) {

                    var json = JSON.parse(data)

                    if (json.return_code == 00000) {
                        var newCode = setInterval(function () {
                            /* $(val).attr("class", "layui-btn layui-btn-fluid layui-btn-disabled"); */
                            $("#captchaBtn").removeClass("layui-btn-normal")
                            $("#captchaBtn").addClass("layui-btn-disabled")
                            //val.setAttribute("disabled", true);
                            $("#captchaBtn").text("重新发送(" + countDown + ")");
                            countDown--;
                            if (countDown == 0) {
                                window.clearInterval(newCode);
                                $("#captchaBtn").addClass("layui-btn-normal")
                                $("#captchaBtn").removeClass("layui-btn-disabled")
                                /* $("#captchaBtn").attr("class", "layui-btn layui-btn-fluid"); */
                                $("#captchaBtn").text("点击获取验证码");
                                countDown = 60;
                            }
                        }, 1000);
                    } else {

                        layer.msg("发生错误,请重试")
                    }
                }
            });
        } else {
            layer.msg("请输入正确的手机号")
        }
    };

    $("#TelNumCheck").click(function () {
        var duanxin = $("#duanxinNum").val()
        var phone = $("#newTelNum").val()

        $.ajax({
            type: "post",
            url: "/userctlr/checkDuanXinNum.do",
            data: {
                "phone": phone,
                "duanxinNum": duanxin,
            },
            success: function (data) {
                var json = JSON.parse(data)
                if (json.duanxinResult == 1) {
                    layer.msg('验证通过，您可以进行登录')
                    $("#loginBtn").removeAttr('disabled');
                } else {
                    layer.msg('很遗憾，您未通过验证')
                }

            },
            error: function () {
                layer.msg('发生错误，请重试')
            }


        });

    })




</script>


</body>
</html>