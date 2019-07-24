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
                        <p>请开启摄像头<strong>人脸识别</strong>进行登录！或者您可以选择<strong>其他方式登录!</strong>
                        </p>
                    </div>
                </div>
            </div>
            <div class="row">
                <div class="col-sm-6 col-sm-offset-3 form-box">
                    <div class="form-top" style="z-index: 999;overflow:visible">
                        <div class="form-top-left">

                            <%--<button type="button" class="layui-btn" onclick="getMedia()">开启摄像头</button>--%>
                            <%--<button class="layui-btn layui-btn-normal" id="snap" onclick="takePhoto()">点击登录</button>--%>
                            <%--<button class="layui-btn layui-btn-danger" onclick="closeMedia()">关闭摄像头</button>--%>

                            <div class="layui-form" style="z-index: 999;overflow:visible">
                                <div class="layui-form-item" style="z-index: 999;overflow:visible">
                                    <div class="layui-input-inline" style="width: 200px;z-index: 999;overflow:visible">
                                        <select id="AllAdmin" name="province" class="province-selector"
                                                style="z-index: 999;overflow:visible"
                                                lay-filter="AllAdmin">
                                            <option value="">请选择登录账户</option>
                                        </select>

                                    </div>
                                </div>
                            </div>

                        </div>
                        <div class="form-top-right">
                            <i class="fa fa-lock"></i>
                        </div>

                    </div>
                    <div class="form-bottom">

                        <!--摄像头区域 -->
                        <%--<input type="button" title="开启摄像头" value="开启摄像头" onclick="getMedia()" />--%>
                        <video id="video" width="500px" height="500px" autoplay="autoplay"></video>
                        <canvas id="canvas" width="500px" height="500px" style="display: none"></canvas>
                        <%--<button id="snap" onclick="takePhoto()">拍照</button>--%>
                        <%--<button onclick="closeMedia()">关闭摄像头</button>--%>


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
            , laydate = layui.laydate
            , form = layui.form;




        form.on('select(AllAdmin)', function (data) {

            var times = window.setInterval(check, 3000);

            function check() {

                let mediaStreamTrack = null; // 视频对象(全局)

                let video = document.getElementById("video");
                let canvas = document.getElementById("canvas");
                let ctx = canvas.getContext('2d');
                ctx.drawImage(video, 0, 0, 500, 500);
                var imgData = canvas.toDataURL();
                var imageDateB64 = imgData.substring(22);


                $.ajax({
                    type: "post",
                    url: "/userctlr/loginByFace.do",
                    data: {
                        "imgData": imageDateB64,
                        "admID": data.value,
                    },
                    //设置超时
                    // timeout:100000,
                    success: function (data) {
                        if (data == "true") {
                            window.location.href = "index.jsp";
                        } else {
                            layer.msg("不是本人")
                        }

                    },
                    error: function (data) {
                        layer.msg("不是本人")
                    },
                    //调用执行后调用的函数
                    // complete: function (XMLHttpRequest, textStatus) {
                    //     if(textStatus == 'timeout'){
                    //         uploadAjax.abort(); //取消请求
                    //         //超时提示：请求超时，请重试
                    //         layer.msg("请求超时，请重试")
                    //         //请求超时返回首页
                    //     }
                    // }
                });
            }


        });

    });


</script>

<script>
    $(document).ready(function () {
        getMedia()
    })



    //开启摄像头
    function getMedia() {
        let constraints = {
            video: {width: 500, height: 500},
            audio: true
        };
        //获得video摄像头区域
        let video = document.getElementById("video");
        //这里介绍新的方法，返回一个 Promise对象
        // 这个Promise对象返回成功后的回调函数带一个 MediaStream 对象作为其参数
        // then()是Promise对象里的方法
        // then()方法是异步执行，当then()前的方法执行完后再执行then()内部的程序
        // 避免数据没有获取到
        let promise = navigator.mediaDevices.getUserMedia(constraints);
        promise.then(function (MediaStream) {
            mediaStreamTrack = typeof MediaStream.stop === 'function' ? MediaStream : MediaStream.getTracks()[1];
            video.srcObject = MediaStream;
            video.play();
        });
    }

    //拍照
    function takePhoto() {
        //获得Canvas对象
        let video = document.getElementById("video");
        let canvas = document.getElementById("canvas");
        let ctx = canvas.getContext('2d');
        ctx.drawImage(video, 0, 0, 500, 500);
        var imgData = canvas.toDataURL();
        var imageDateB64 = imgData.substring(22);
        // alert(imageDateB64)

        var uploadAjax = $.ajax({
            type: "post",
            url: "/userctlr/loginByFace.do",
            data: {
                "imgData": imageDateB64,
            },
            //设置超时
            // timeout:100000,
            success: function (data) {
                if (data == "true") {
                    window.location.href = "index.jsp";
                } else {
                    layer.msg("不是本人")
                }

            },
            error: function (data) {
                layer.msg("不是本人")
            },
            //调用执行后调用的函数
            // complete: function (XMLHttpRequest, textStatus) {
            //     if(textStatus == 'timeout'){
            //         uploadAjax.abort(); //取消请求
            //         //超时提示：请求超时，请重试
            //         layer.msg("请求超时，请重试")
            //         //请求超时返回首页
            //     }
            // }
        });

    }

    // 关闭摄像头
    function closeMedia() {
        mediaStreamTrack.stop();
    }

</script>

<script type="text/javascript">

    window.onload = function ajaxSend() {

        $.ajax({
            type: "post", // 指定是post还是get
            url: "/userctlr/allAdmin.do", //发送请求的地址
            dataType: "json",
            error: function () { //如果确定能正确运行,可不写
                layer.msg("发生错误,请重试");
            },
            success: function (data) {
                for (var i = 0; i < data.allAdmin.length; i++) {
                    var info = '<option value = "' + data.allAdmin[i] + '">' + data.allAdmin[i] + '</option>'
                    $("#AllAdmin").append(info);
                }

                layui.form.render("select");
            }

        });
    }

</script>

</body>
</html>