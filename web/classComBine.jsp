<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta charset="utf-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    <title></title>
    <!-- Bootstrap Styles-->
    <link href="css/bootstrap.css" rel="stylesheet"/>
    <!-- FontAwesome Styles-->
    <link href="css/font-awesome.css" rel="stylesheet"/>
    <!-- Custom Styles-->
    <link href="css/custom-styles.css" rel="stylesheet"/>
    <!-- Google Fonts-->
    <link href='https://fonts.googleapis.com/css?family=Open+Sans' rel='stylesheet' type='text/css'/>
    <!--layui-->
    <link rel="stylesheet" href="layui/css/layui.css" media="all">
</head>
<body>

<div id="page-inner" style="background-color: #E6E6E6;margin-top: 0">
    <div class="row">
        <div class="col-md-12">
            <h1 class="page-header">
                欢迎使用
                <small>班级信息管理模块-合并班级</small>

            </h1>
        </div>
    </div>
    <!-- /. ROW  -->


    <div class="row">
        <div class="col-md-10">
            <div class="panel panel-default">
                <div class="panel-heading">
                    一。请您选择被合并的院系、专业及班级
                </div>

                <div class="panel-body">


                    <div class="layui-form">
                        <div class="layui-form-item" id="area-picker">
                            <div class="layui-form-label">请选择</div>
                            <div class="layui-input-inline" style="width: 200px;">
                                <select id="Depa" name="province" class="province-selector" data-value="广东省"
                                        lay-filter="province-1">
                                    <option value="">请选择院系</option>
                                </select>
                            </div>
                            <div class="layui-input-inline" style="width: 200px;">
                                <select id="Major" name="city" class="city-selector" data-value="深圳市"
                                        lay-filter="city-1">
                                    <option value="">请选择专业</option>
                                </select>
                            </div>
                            <div class="layui-input-inline" style="width: 200px;">
                                <select id="ChooseClass" name="county" class="county-selector" data-value="龙岗区"
                                        lay-filter="county-1">
                                    <option value="">请选择班级</option>
                                </select>
                            </div>
                        </div>
                    </div>


                </div>
            </div>
        </div>
    </div>

    <div class="row">
        <div class="col-md-10">
            <div class="panel panel-default">
                <div class="panel-heading">
                    二。请您选择合并的目标班级的院系、专业及班级
                </div>

                <div class="panel-body">


                    <div class="layui-form">
                        <div class="layui-form-item">
                            <div class="layui-form-label">请选择</div>
                            <div class="layui-input-inline" style="width: 200px;">
                                <select id="Depa2" name="province" class="province-selector" data-value="广东省"
                                        lay-filter="province-2">
                                    <option value="">请选择院系</option>
                                </select>
                            </div>
                            <div class="layui-input-inline" style="width: 200px;">
                                <select id="Major2" name="city" class="city-selector" data-value="深圳市"
                                        lay-filter="city-2">
                                    <option value="">请选择专业</option>
                                </select>
                            </div>
                            <div class="layui-input-inline" style="width: 200px;">
                                <select id="ChooseClass2" name="county" class="county-selector" data-value="龙岗区"
                                        lay-filter="county-2">
                                    <option value="">请选择班级</option>
                                </select>
                            </div>
                        </div>
                    </div>


                </div>
            </div>
        </div>
    </div>

    <div class="row">
        <div class="col-md-4">
            <div class="panel panel-default">
                <div class="panel-heading">
                    点击合并
                </div>

                <div class="panel-body">


                    <button id="classComBine" class="layui-btn">确认合并</button>


                </div>
            </div>
        </div>
    </div>


</div>


<!--layui-->
<script src="layui/layui.js"></script>

<script>
    layui.config({
        version: '1560414887155' //为了更新 js 缓存，可忽略
    });

    layui.use(['laydate', 'laypage', 'layer', 'table', 'carousel', 'upload', 'element', 'slider'], function () {
        var laydate = layui.laydate //日期
            , laypage = layui.laypage //分页
            , layer = layui.layer //弹层
            , table = layui.table //表格
            , carousel = layui.carousel //轮播
            , upload = layui.upload //上传
            , element = layui.element //元素操作
            , slider = layui.slider //滑块

        //向世界问个好
        // layer.msg('Hello World');


        //将日期直接嵌套在指定容器中
        var dateIns = laydate.render({
            elem: '#laydateDemo'
            , position: 'static'
            , calendar: true //是否开启公历重要节日
            , mark: { //标记重要日子
                '0-10-14': '生日'
                , '2018-08-28': '新版'
                , '2018-10-08': '神秘'
            }
            , done: function (value, date, endDate) {
                if (date.year == 2017 && date.month == 11 && date.date == 30) {
                    dateIns.hint('一不小心就月底了呢');
                }
            }
            , change: function (value, date, endDate) {
                layer.msg(value)
            }
        });

        //分页
        laypage.render({
            elem: 'pageDemo' //分页容器的id
            , count: 100 //总页数
            , skin: '#1E9FFF' //自定义选中色值
            //,skip: true //开启跳页
            , jump: function (obj, first) {
                if (!first) {
                    layer.msg('第' + obj.curr + '页', {offset: 'b'});
                }
            }
        });

        //上传
        upload.render({
            elem: '#uploadDemo'
            , url: '' //上传接口
            , done: function (res) {
                console.log(res)
            }
        });

        slider.render({
            elem: '#sliderDemo'
            , input: true //输入框
        });

        //底部信息
        var footerTpl = lay('#footer')[0].innerHTML;
        lay('#footer').html(layui.laytpl(footerTpl).render({}))
            .removeClass('layui-hide');
    });
</script>
<script type="text/javascript">

    window.onload = function ajaxSend() {

        $.ajax({
            type: "post", // 指定是post还是get
            url: "/userctlr/allDepa.do", //发送请求的地址
            dataType: "json",
            error: function () { //如果确定能正确运行,可不写
                layer.msg("发生错误,请重试");
            },
            success: function (data) {
                for (var i = 0; i < data.allDepa.length; i++) {
                    var info = '<option value = "' + data.allDepa[i] + '">' + data.allDepa[i] + '</option>'
                    $("#Depa").append(info);
                    $("#Depa2").append(info);

                }

                layui.form.render("select");
            }

        });


    }

</script>

<script>
    var depaname = null;
    layui.use(['layer', 'jquery', 'form'], function () {
        var layer = layui.layer,
            $ = layui.jquery,
            form = layui.form,
            table = layui.table;


        form.on('select(province-1)', function (data) {
            depaname = data.value
            form.render('select');


            $.ajax({
                type: "get",
                url: "/userctlr/allMajor.do",
                data: {
                    "depaName": depaname,
                },
                dataType: "json",
                error: function () {
                    layer.msg("发生错误，请重试")

                    var citySelect = document.getElementById("Major");
                    // 获取其所有子元素
                    var optionEleList = citySelect.getElementsByTagName("option");
                    // 循环遍历每个option元素，然后在citySelect中移除
                    while (optionEleList.length > 1) { //子元素的个数如果大于1就循环，等于1就不循环了！
                        citySelect.removeChild(optionEleList[1]); //总是删除1下标，因为1删除了，2就变成1了！
                    }

                    var citySelect2 = document.getElementById("ChooseClass");
                    // 获取其所有子元素
                    var optionEleList2 = citySelect2.getElementsByTagName("option");
                    // 循环遍历每个option元素，然后在citySelect中移除
                    while (optionEleList2.length > 1) { //子元素的个数如果大于1就循环，等于1就不循环了！
                        citySelect2.removeChild(optionEleList2[1]); //总是删除1下标，因为1删除了，2就变成1了！
                    }

                    form.render('select');
                },
                success: function (data) {

                    var citySelect = document.getElementById("Major");
                    // 获取其所有子元素
                    var optionEleList = citySelect.getElementsByTagName("option");
                    // 循环遍历每个option元素，然后在citySelect中移除
                    while (optionEleList.length > 1) { //子元素的个数如果大于1就循环，等于1就不循环了！
                        citySelect.removeChild(optionEleList[1]); //总是删除1下标，因为1删除了，2就变成1了！
                    }

                    var citySelect2 = document.getElementById("ChooseClass");
                    // 获取其所有子元素
                    var optionEleList2 = citySelect2.getElementsByTagName("option");
                    // 循环遍历每个option元素，然后在citySelect中移除
                    while (optionEleList2.length > 1) { //子元素的个数如果大于1就循环，等于1就不循环了！
                        citySelect2.removeChild(optionEleList2[1]); //总是删除1下标，因为1删除了，2就变成1了！
                    }

                    for (var i = 0; i < data.allMajor.length; i++) {
                        var info = '<option value = "' + data.allMajor[i] + '">' + data.allMajor[i] + '</option>'
                        $("#Major").append(info);

                    }
                    form.render("select");


                }
            })

        });

        form.on('select(city-1)', function (data) {
            majorName = data.value
            form.render('select');


            $.ajax({
                type: "get",
                url: "/userctlr/allClass.do",
                data: {
                    "majorName": majorName,
                },
                dataType: "json",
                error: function () {
                    layer.msg("发生错误，请重试")

                    var citySelect = document.getElementById("ChooseClass");
                    // 获取其所有子元素
                    var optionEleList = citySelect.getElementsByTagName("option");
                    // 循环遍历每个option元素，然后在citySelect中移除
                    while (optionEleList.length > 1) { //子元素的个数如果大于1就循环，等于1就不循环了！
                        citySelect.removeChild(optionEleList[1]); //总是删除1下标，因为1删除了，2就变成1了！
                    }

                    form.render("select");
                },
                success: function (data) {

                    var citySelect = document.getElementById("ChooseClass");
                    // 获取其所有子元素
                    var optionEleList = citySelect.getElementsByTagName("option");
                    // 循环遍历每个option元素，然后在citySelect中移除
                    while (optionEleList.length > 1) { //子元素的个数如果大于1就循环，等于1就不循环了！
                        citySelect.removeChild(optionEleList[1]); //总是删除1下标，因为1删除了，2就变成1了！
                    }

                    for (var i = 0; i < data.allClass.length; i++) {
                        var info = '<option value = "' + data.allClass[i] + '">' + data.allClass[i] + '</option>'
                        $("#ChooseClass").append(info);

                    }
                    form.render("select");

                }
            })

        });


        form.on('select(province-2)', function (data) {
            depaname = data.value
            form.render('select');


            $.ajax({
                type: "get",
                url: "/userctlr/allMajor.do",
                data: {
                    "depaName": depaname,
                },
                dataType: "json",
                error: function () {
                    layer.msg("发生错误，请重试")

                    var citySelect = document.getElementById("Major2");
                    // 获取其所有子元素
                    var optionEleList = citySelect.getElementsByTagName("option");
                    // 循环遍历每个option元素，然后在citySelect中移除
                    while (optionEleList.length > 1) { //子元素的个数如果大于1就循环，等于1就不循环了！
                        citySelect.removeChild(optionEleList[1]); //总是删除1下标，因为1删除了，2就变成1了！
                    }

                    var citySelect2 = document.getElementById("ChooseClass2");
                    // 获取其所有子元素
                    var optionEleList2 = citySelect2.getElementsByTagName("option");
                    // 循环遍历每个option元素，然后在citySelect中移除
                    while (optionEleList2.length > 1) { //子元素的个数如果大于1就循环，等于1就不循环了！
                        citySelect2.removeChild(optionEleList2[1]); //总是删除1下标，因为1删除了，2就变成1了！
                    }

                    form.render('select');
                },
                success: function (data) {

                    var citySelect = document.getElementById("Major2");
                    // 获取其所有子元素
                    var optionEleList = citySelect.getElementsByTagName("option");
                    // 循环遍历每个option元素，然后在citySelect中移除
                    while (optionEleList.length > 1) { //子元素的个数如果大于1就循环，等于1就不循环了！
                        citySelect.removeChild(optionEleList[1]); //总是删除1下标，因为1删除了，2就变成1了！
                    }

                    var citySelect2 = document.getElementById("ChooseClass2");
                    // 获取其所有子元素
                    var optionEleList2 = citySelect2.getElementsByTagName("option");
                    // 循环遍历每个option元素，然后在citySelect中移除
                    while (optionEleList2.length > 1) { //子元素的个数如果大于1就循环，等于1就不循环了！
                        citySelect2.removeChild(optionEleList2[1]); //总是删除1下标，因为1删除了，2就变成1了！
                    }

                    for (var i = 0; i < data.allMajor.length; i++) {
                        var info = '<option value = "' + data.allMajor[i] + '">' + data.allMajor[i] + '</option>'

                        $("#Major2").append(info);
                    }
                    form.render("select");


                }
            })

        });

        form.on('select(city-2)', function (data) {
            majorName = data.value
            form.render('select');


            $.ajax({
                type: "get",
                url: "/userctlr/allClass.do",
                data: {
                    "majorName": majorName,
                },
                dataType: "json",
                error: function () {
                    layer.msg("发生错误，请重试")

                    var citySelect = document.getElementById("ChooseClass2");
                    // 获取其所有子元素
                    var optionEleList = citySelect.getElementsByTagName("option");
                    // 循环遍历每个option元素，然后在citySelect中移除
                    while (optionEleList.length > 1) { //子元素的个数如果大于1就循环，等于1就不循环了！
                        citySelect.removeChild(optionEleList[1]); //总是删除1下标，因为1删除了，2就变成1了！
                    }

                    form.render("select");
                },
                success: function (data) {

                    var citySelect = document.getElementById("ChooseClass2");
                    // 获取其所有子元素
                    var optionEleList = citySelect.getElementsByTagName("option");
                    // 循环遍历每个option元素，然后在citySelect中移除
                    while (optionEleList.length > 1) { //子元素的个数如果大于1就循环，等于1就不循环了！
                        citySelect.removeChild(optionEleList[1]); //总是删除1下标，因为1删除了，2就变成1了！
                    }

                    for (var i = 0; i < data.allClass.length; i++) {
                        var info = '<option value = "' + data.allClass[i] + '">' + data.allClass[i] + '</option>'

                        $("#ChooseClass2").append(info);
                    }
                    form.render("select");

                }
            })

        });


    });
</script>

<script>
    layui.use(['laydate', 'laypage', 'layer', 'table', 'carousel', 'upload', 'element', 'slider'], function () {
        var laydate = layui.laydate //日期
            , laypage = layui.laypage //分页
            , layer = layui.layer //弹层
            , table = layui.table //表格
            , carousel = layui.carousel //轮播
            , upload = layui.upload //上传
            , element = layui.element //元素操作
            , slider = layui.slider //滑块
            , form = layui.form


        $("#classComBine").click(function () {
            var class1 = $("#ChooseClass").val()
            var class2 = $("#ChooseClass2").val()


            if(class1.length==0||class2.length==0){
                layer.msg("请全部选择后再点击合并")
            }else{
                layer.confirm('确认将'+class1+'合并到'+class2+'吗?', function () {


                    $.ajax({
                        type: "get",
                        url: "/userctlr/classComBine.do",
                        data: {
                            "className1": class1,
                            "className2": class2,
                        },
                        dataType: "json",
                        error: function (data) {
                            layer.msg("出现错误，请重试");
                        },
                        success: function (data) {
                            layer.msg(data.classComBineResult);


                            table.reload();


                        }
                    });


                });
            }



        });




    });
</script>


<!-- /. PAGE INNER  -->

<!-- /. PAGE WRAPPER  -->

<!-- /. WRAPPER  -->
<!-- JS Scripts-->
<!-- jQuery Js -->
<script src="js/jquery-1.10.2.js"></script>
<!-- Bootstrap Js -->
<script src="js/bootstrap.min.js"></script>
<!-- Metis Menu Js -->
<script src="js/jquery.metisMenu.js"></script>
<!-- Custom Js -->
<script src="js/custom-scripts.js"></script>

</body>
</html>
