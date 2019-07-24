<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">

<head>
    <meta charset="utf-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    <title>EduMS教务管理系</title>
    <!-- Bootstrap Styles-->
    <link href="css/bootstrap.css" rel="stylesheet"/>
    <!-- FontAwesome Styles-->
    <link href="css/font-awesome.css" rel="stylesheet"/>
    <!-- Morris Chart Styles-->
    <link href="js/morris/morris-0.4.3.min.css" rel="stylesheet"/>
    <!-- Custom Styles-->
    <link href="css/custom-styles.css" rel="stylesheet"/>
    <!-- Google Fonts-->
    <link href='https://fonts.googleapis.com/css?family=Open+Sans' rel='stylesheet' type='text/css'/>

    <!--layui-->
    <link rel="stylesheet" href="layui/css/layui.css" media="all">

</head>

<body>




<div id="wrapper">
    <nav class="navbar navbar-default top-navbar" role="navigation">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".sidebar-collapse">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="index.jsp"><i class="fa fa-gear"></i> <strong>EDUMS</strong></a>
        </div>

        <ul class="nav navbar-top-links navbar-right">
            <li class="dropdown" style="margin-left: -300px">
                <a class="dropdown-toggle" data-toggle="dropdown" href="#" aria-expanded="false">
                    <i class="fa fa-user fa-fw fa-lg"></i>
                    <i class="fa fa-caret-down fa-lg"></i>
                </a>
                <ul class="dropdown-menu dropdown-user" style="margin-right: -147px">
                    <li><a href="userCenter.jsp" target="iFrame"><i class="fa fa-user fa-fw fa-lg"></i>个人中心</a>
                    </li>

                    <li class="divider"></li>
                    <li><a href="/userctlr/logOff.do"><i class="fa fa-sign-out fa-fw fa-lg"></i>   注   销   登   录</a>
                    </li>
                </ul>
                <!-- /.dropdown-user -->
            </li>
            <!-- /.dropdown -->
        </ul>
    </nav>
    <!--/. NAV TOP  -->
    <nav class="navbar-default navbar-side" role="navigation">
        <!--<div id="sideNav" href=""><i class="fa fa-caret-right"></i></div>-->
        <div class="sidebar-collapse">
            <ul class="nav" id="main-menu" style="font-size: 16px">
                <li class="active-menu">
                    <a href="#"><i class="fa fa-dashboard"></i>院系信息管理<span class="fa arrow"></span></a>
                    <ul class="nav nav-second-level">
                        <li>
                            <a href="first.jsp"  target="iFrame">first</a>
                        </li>
                        <li>
                            <a href="#">Second Level Link</a>
                        </li>
                    </ul>
                </li>
                <li>
                    <a href="#"><i class="fa fa-desktop"></i>班级信息管理<span class="fa arrow"></span></a>
                    <ul class="nav nav-second-level">
                        <li>
                            <a  href="classInfoBase.jsp" target="iFrame">基本功能</a>
                        </li>
                        <li>
                            <a  href="classComBine.jsp" target="iFrame">合并班级</a>
                        </li>
                        <li>
                            <a  href="classInfoUploadDown.jsp" target="iFrame">批量上传</a>
                        </li>
                        <li>
                            <a  href="classInfoEcharts.jsp" target="iFrame">图表分析</a>
                        </li>
                    </ul>
                </li>
                <li>
                    <a href="#"><i class="fa fa-bar-chart-o"></i>教师信息管理<span class="fa arrow"></span></a>
                    <ul class="nav nav-second-level">
                        <li>
                            <a href="chart.jsp" target="iFrame">chart</a>
                        </li>
                        <li>
                            <a href="#">Second Level Link</a>
                        </li>
                    </ul>
                </li>
                <li>
                    <a  href="#"><i class="fa fa-qrcode"></i>学生信息管理<span class="fa arrow"></span></a>
                    <ul class="nav nav-second-level">
                        <li>
                            <a href="tab-panel.jsp" target="iFrame">tab panel</a>
                        </li>
                        <li>
                            <a href="#">Second Level Link</a>
                        </li>
                    </ul>
                </li>
                <li>
                    <a href="#"><i class="fa fa-table"></i>课程信息管理<span class="fa arrow"></span></a>
                    <ul class="nav nav-second-level">
                        <li>
                            <a  href="table.jsp" target="iFrame">table</a>
                        </li>
                        <li>
                            <a href="#">Second Level Link</a>
                        </li>
                    </ul>
                </li>
                <li>
                    <a href="#"><i class="fa fa-edit"></i>成绩信息管理<span class="fa arrow"></span></a>
                    <ul class="nav nav-second-level">
                        <li>
                            <a  href="form.jsp" target="iFrame">form</a>
                        </li>
                        <li>
                            <a href="#">Second Level Link</a>
                        </li>
                    </ul>
                </li>
                <li>
                    <a href="#" target="iFrame"><i class="fa fa-sitemap"></i>教学资源管理中心<span class="fa arrow"></span></a>
                    <ul class="nav nav-second-level">
                        <li>
                            <a href="empty.jsp" target="iFrame">empty</a>
                        </li>
                        <li>
                            <a href="#">Second Level Link</a>
                        </li>
                    </ul>
                </li>
                <li>
                    <a href="managementAdm.jsp" target="iFrame"><i class="fa fa-sitemap"></i>管理员管理</a>
                </li>
                <!--<li>-->
                    <!--<a href="empty.html" target="iFrame"><i class="fa fa-fw fa-file"></i> Empty Page</a>-->
                <!--</li>-->
            </ul>

        </div>

    </nav>
    <!-- /. NAV SIDE  -->
    <div id="page-wrapper" style="background-color: #E6E6E6;">

        <iframe name="iFrame" id="iFrame" width=100% src="first.jsp" scrolling="no" frameborder="0"
                onload="SetCwinHeight()" style="background-color: #E6E6E6"></iframe>
        <!-- /. PAGE INNER  -->
    </div>
    <!-- /. PAGE WRAPPER  -->
</div>


<!--layui-->
<script src="layui/layui.js"></script>
<!-- /. WRAPPER  -->
<!-- JS Scripts-->
<!-- jQuery Js -->
<!--<script src="assets/js/jquery-1.10.2.js"></script>-->
<script src="js/jquery-3.3.1.min.js"></script>

<!-- Bootstrap Js -->
<script src="js/bootstrap.min.js"></script>

<!-- Metis Menu Js -->
<script src="js/jquery.metisMenu.js"></script>
<!-- Morris Chart Js -->
<script src="js/morris/raphael-2.1.0.min.js"></script>
<script src="js/morris/morris.js"></script>


<script src="js/easypiechart.js"></script>
<script src="js/easypiechart-data.js"></script>

<script src="js/Lightweight-Chart/jquery.chart.js"></script>

<!-- Custom Js -->
<script src="js/custom-scripts.js"></script>
<script>

    function SetCwinHeight() {
        var iframeid = document.getElementById("iFrame"); //iframe id
        if (document.getElementById) {
            if (iframeid && !window.opera) {
                if (iframeid.contentDocument && iframeid.contentDocument.body.offsetHeight) {
                    iframeid.height = iframeid.contentDocument.body.offsetHeight;
                } else if (iframeid.Document && iframeid.Document.body.scrollHeight) {
                    iframeid.height = iframeid.Document.body.scrollHeight;
                }
            }
        }
    }

    window.onresize = function () {
        SetCwinHeight(document.getElementById('iFrame'));
    };

    $(document).ready(function () {
        $("#main-menu>li").click(function () {
            $(this).addClass("active-menu").siblings().removeClass("active-menu");
        });
    });

    $(document).ready(function () {
        $("#main-menu>li>ul>li").click(function () {
            $(this).addClass("active_li").siblings().removeClass("active_li");
            $(this).children("a").css({"color":"#32cee4","font-weight":"bolder"});
            $(this).siblings().children("a").css({"color":"white","font-weight":"200"});
        });
    });
</script>


</body>
<style>
    .active_li{
        background-color: #e6e6e6;
        font-weight: bold;
    }
</style>
</html>