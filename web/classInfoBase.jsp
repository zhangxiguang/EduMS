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
                <small>班级信息管理模块-基本功能</small>

            </h1>
        </div>
    </div>
    <!-- /. ROW  -->


    <div class="row">
        <div class="col-md-8">
            <div class="panel panel-default">
                <div class="panel-heading">
                    一。请您选择要查询的院系、专业及班级
                </div>

                <div class="panel-body">


                    <div class="layui-form">
                        <div class="layui-form-item" id="area-picker">
                            <div class="layui-form-label">请选择</div>
                            <div class="layui-input-inline" style="width: 200px;">
                                <select id="Depa" name="province" class="province-selector" data-value="广东省"
                                        lay-filter="province-1" lay-search>
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
                            <button id="searchBtn" class="layui-btn">搜索</button>

                        </div>
                    </div>


                </div>
            </div>
        </div>
    </div>

    <div class="row">
        <div class="col-md-6">
            <div class="panel panel-default">
                <div class="panel-heading">
                    二。高级查询（任选一项即可）
                </div>

                <div class="panel-body">


                    <div class="layui-form">
                        <div class="layui-form-item" id="booseChoose">
                            <div class="layui-form-label">请选择</div>
                            <div class="layui-input-inline" style="width: 200px;">
                                <select id="Boss" name="province" class="province-selector" data-value="广东省"
                                        lay-filter="Boss-1">
                                    <option value="">请选择班主任</option>
                                </select>


                            </div>
                            <button id="clearAllSearch" class="layui-btn">清除所有高级查询搜索</button>

                        </div>
                    </div>


                </div>
            </div>
        </div>
    </div>

    <div class="row">
        <div class="col-md-8">

            <div class="panel panel-default">
                <div class="panel-heading">
                    查询结果如下:
                </div>
                <div class="panel-body">

                    <table class="layui-hide" id="classInfoTable" lay-filter="test"></table>

                </div>
            </div>
        </div>

    </div>

</div>

<!--新增班级Modal start-->
<div id="addClassInfo" class="modal fade" tabindex="-1" role="dialog" aria-labelledby="myLargeModalLabel">
    <div class="modal-dialog modal-lg" role="document" style="width: 650px;">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span>
                </button>
                <h4 class="modal-title">新增班级</h4>
            </div>
            <!--新增班级 start-->
            <form style="padding-top: 20px" class="form-horizontal">
                <div class="form-group">
                    <label for="addCLassName" class="col-sm-2 control-label">班级名称</label>
                    <div class="col-sm-10">
                        <input style="width: 200px;" type="text" class="form-control" id="addCLassName"
                               placeholder="班级名称">
                    </div>
                </div>
                <div class="form-group">
                    <label for="Boss2" class="col-sm-2 control-label">选择班主任</label>
                    <div class="col-sm-10">
                        <div class="layui-form">
                            <div class="layui-form-item">
                                <div class="layui-input-inline" style="width: 200px;">
                                    <select id="Boss2" name="province" class="province-selector" data-value="广东省"
                                            lay-filter="Boss-1">
                                        <option value="">请选择班主任</option>
                                    </select>
                                </div>

                            </div>
                        </div>
                    </div>
                </div>
                <div class="form-group">
                    <label for="Depa2" class="col-sm-2 control-label">请选择院系</label>
                    <div class="col-sm-10">
                        <div class="layui-form">
                            <div class="layui-form-item" id="area-picker2">
                                <div class="layui-input-inline" style="width: 200px;">
                                    <select id="Depa2" name="province" class="province-selector" data-value="广东省"
                                            lay-filter="depa-1" lay-search>
                                        <option value="">请选择院系</option>
                                    </select>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="form-group">
                    <label for="Major2" class="col-sm-2 control-label">请选择院系</label>
                    <div class="col-sm-10">
                        <div class="layui-form">
                            <div class="layui-input-inline" style="width: 200px;">
                                <select id="Major2" name="city" class="city-selector" data-value="深圳市"
                                        lay-filter="major-1">
                                    <option value="">请选择专业</option>
                                </select>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-default" data-dismiss="modal">取消添加</button>
                    <button id="addClassBtn" type="button" class="btn btn-primary" data-dismiss="modal">确认添加</button>
                </div>

            </form>
            <!--新增班级 end-->

        </div>
    </div>
</div>
<!--新增班级Modal end-->

<!--编辑班级Modal start-->
<div id="editClassInfo" class="modal fade" tabindex="-1" role="dialog" aria-labelledby="myLargeModalLabel">
    <div class="modal-dialog modal-lg" role="document" style="width: 650px;">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span>
                </button>
                <h4 class="modal-title">编辑班级</h4>
            </div>
            <!--新增班级 start-->
            <form style="padding-top: 20px" class="form-horizontal">
                <input id="editClassId" type="hidden" value=""/>
                <div class="form-group">
                    <label for="editCLassName" class="col-sm-2 control-label">班级名称</label>
                    <div class="col-sm-10">
                        <input style="width: 200px;" type="text" class="form-control" id="editCLassName"
                               placeholder="班级名称">
                    </div>
                </div>
                <div class="form-group">
                    <label for="editCLassBoss" class="col-sm-2 control-label">班主任</label>
                    <div class="col-sm-10">
                        <input style="width: 200px;" type="text" class="form-control" id="editCLassBoss"
                               placeholder="班主任">
                    </div>
                </div>
                <div class="form-group">
                    <label for="editCLassDepa" class="col-sm-2 control-label">当前院系</label>
                    <div class="col-sm-10">
                        <input style="width: 200px;" type="text" class="form-control" id="editCLassDepa"
                               placeholder="当前院系">
                    </div>
                </div>
                <div class="form-group">
                    <label for="editCLassMajor" class="col-sm-2 control-label">当前专业</label>
                    <div class="col-sm-10">
                        <input style="width: 200px;" type="text" class="form-control" id="editCLassMajor"
                               placeholder="当前专业">
                    </div>
                </div>
                <div class="form-group">
                    <label for="Boss2" class="col-sm-2 control-label">选择班主任</label>
                    <div class="col-sm-10">
                        <div class="layui-form">
                            <div class="layui-form-item">
                                <div class="layui-input-inline" style="width: 200px;">
                                    <select id="editBoss" name="province" class="province-selector" data-value="广东省"
                                            lay-filter="editBoss">
                                        <option value="">请选择班主任</option>
                                    </select>
                                </div>

                            </div>
                        </div>
                    </div>
                </div>
                <div class="form-group">
                    <label for="Depa2" class="col-sm-2 control-label">请选择院系</label>
                    <div class="col-sm-10">
                        <div class="layui-form">
                            <div class="layui-form-item">
                                <div class="layui-input-inline" style="width: 200px;">
                                    <select id="editDepa" name="province" class="province-selector" data-value="广东省"
                                            lay-filter="editDepa" lay-search>
                                        <option value="">请选择院系</option>
                                    </select>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="form-group">
                    <label for="Major2" class="col-sm-2 control-label">请选择院系</label>
                    <div class="col-sm-10">
                        <div class="layui-form">
                            <div class="layui-input-inline" style="width: 200px;">
                                <select id="editMajor" name="city" class="city-selector" data-value="深圳市"
                                        lay-filter="editMajor">
                                    <option value="">请选择专业</option>
                                </select>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-default" data-dismiss="modal">取消修改</button>
                    <button id="editClassBtn" type="button" class="btn btn-primary" data-dismiss="modal">确认修改</button>
                </div>

            </form>
            <!--新增班级 end-->

        </div>
    </div>
</div>
<!--编辑班级Modal end-->


<script type="text/html" id="barDemo">
    <%--<a class="layui-btn layui-btn-primary layui-btn-xs" lay-event="detail">查看</a>--%>
    <a class="layui-btn layui-btn-xs" lay-event="edit">编辑</a>
    <a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="del">删除</a>
</script>

<!--layui-->
<script src="layui/layui.js"></script>
<!-- jQuery Js -->
<script src="js/jquery-3.3.1.min.js"></script>
<!-- Bootstrap Js -->
<script src="js/bootstrap.min.js"></script>
<!-- Metis Menu Js -->
<script src="js/jquery.metisMenu.js"></script>
<!-- Custom Js -->
<script src="js/custom-scripts.js"></script>

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
            , form = layui.form

        //向世界问个好
        // layer.msg('Hello World');

        //监听Tab切换
        element.on('tab(demo)', function (data) {
            layer.tips('切换了 ' + data.index + '：' + this.innerHTML, this, {
                tips: 1
            });
        });

        //执行一个 table 实例
        var tableIns = table.render({
            elem: '#classInfoTable'
            , height: 520
            , url: '/userctlr/allClassInfo.do' //数据接口
            , title: '用户表'
            , page: true //开启分页
            , toolbar: 'default' //开启工具栏，此处显示默认图标，可以自定义模板，详见文档
            , totalRow: false //开启合计行
            , cols: [[ //表头
                {type: 'checkbox', fixed: 'left'}
                , {field: 'classid', title: '班级ID', width: 80, sort: true, fixed: 'left', totalRowText: '合计：'}
                , {field: 'classname', title: '班级名称', width: 120, sort: true, totalRow: true}
                , {field: 'teaname', title: '班主任', width: 90, sort: true}
                , {field: 'depname', title: '院系', width: 140, sort: true}
                , {field: 'majname', title: '专业', width: 140, sort: true}
                , {fixed: 'right', width: 165, align: 'center', toolbar: '#barDemo'}
            ]]
            , id: 'testReload'
        });

        //监听头工具栏事件
        table.on('toolbar(test)', function (obj) {
            var checkStatus = table.checkStatus(obj.config.id)
                , data = checkStatus.data; //获取选中的数据
            switch (obj.event) {
                case 'add':
                    $("#addClassInfo").modal();
                    break;
                case 'update':
                    if (data.length === 0) {
                        layer.msg('请选择一行');
                    } else if (data.length > 1) {
                        layer.msg('只能同时编辑一个');
                    } else {
                        // layer.alert('编辑 [id]：' + checkStatus.data[0].id);


                        $("#editClassInfo").modal()
                        $("#editClassId").val(checkStatus.data[0].classid)
                        $("#editCLassName").val(checkStatus.data[0].classname)
                        $("#editCLassDepa").val(checkStatus.data[0].depname)
                        $("#editCLassMajor").val(checkStatus.data[0].majname)
                        $("#editCLassBoss").val(checkStatus.data[0].teaname)


                    }
                    break;
                case 'delete':
                    if (data.length === 0) {
                        layer.msg('请选择一行');
                    } else {
                        layer.msg('删除');
                    }
                    break;
            }
            ;
        });

        //监听行工具事件
        table.on('tool(test)', function (obj) { //注：tool 是工具条事件名，test 是 table 原始容器的属性 lay-filter="对应的值"
            var data = obj.data //获得当前行数据
                , layEvent = obj.event; //获得 lay-event 对应的值
            if (layEvent === 'detail') {
                layer.msg('查看操作');
            } else if (layEvent === 'del') {
                layer.confirm('确认删除该数据?', function (index) {
                    obj.del(); //删除对应行（tr）的DOM结构
                    layer.close(index);
                    //向服务端发送删除指令

                    $.ajax({
                        type: "get",
                        url: "/userctlr/delClassInfo.do",
                        data: {
                            "classid": data.classid,
                        },
                        dataType: "json",
                        error: function (data) {
                            layer.msg(data.delClassResult);
                        },
                        success: function (data) {
                            layer.msg(data.delClassResult);


                            tableIns.reload();


                        }
                    });


                });
            } else if (layEvent === 'edit') {
                // layer.msg(data.classid);

                $("#editClassInfo").modal()
                $("#editClassId").val(data.classid)
                $("#editCLassName").val(data.classname)
                $("#editCLassDepa").val(data.depname)
                $("#editCLassMajor").val(data.majname)
                $("#editCLassBoss").val(data.teaname)
            }
        });


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

        //添加新班级
        $("#addClassBtn").on('click', function () {
            var className = $("#addCLassName").val()
            var classBoss = $("#Boss2").val()
            var depaName = $("#Depa2").val()
            var majorName = $("#Major2").val()

            $.ajax({
                type: "get",
                url: "/userctlr/addNewClass.do",
                data: {
                    "className": className,
                    "classBoss": classBoss,
                    "depaName": depaName,
                    "majorName": majorName,
                },
                dataType: "json",
                error: function () {
                    layer.msg("错误，请重试");
                },
                success: function (data) {
                    layer.msg(data.addNewClass);


                    tableIns.reload();


                }
            });


        });


        //修改班级信息
        $("#editClassBtn").click(function () {
            var classid = $("#editClassId").val()
            var classname = $("#editCLassName").val()
            var teaname = $("#editCLassBoss").val()
            var depname = $("#editCLassDepa").val()
            var majname = $("#editCLassMajor").val()

            $.ajax({
                type: "get",
                url: "/userctlr/editClassInfo.do",
                data: {
                    "classid": classid,
                    "classname": classname,
                    "teaname": teaname,
                    "depname": depname,
                    "majname": majname,
                },
                dataType: "json",
                error: function (data) {
                    layer.msg(data.editClassResult);
                },
                success: function (data) {
                    layer.msg(data.editClassResult);


                    tableIns.reload();


                }
            });


        });


        //高级查找-班主任所带班级
        form.on('select(Boss-1)', function (data) {
            var teaName = data.value
            //执行重载
            table.reload('testReload', {
                url: '/userctlr/allClassInfoByBoss.do'
                , method: 'get'
                , page: {
                    curr: 1 //重新从第 1 页开始
                }
                , where: {
                    teaname: teaName
                }
            });
        });

        //高级查找-通过院系/专业/班级
        $("#searchBtn").click(function () {
            var depName = $("#Depa").val()
            var majName = $("#Major").val()
            var className = $("#ChooseClass").val()


            if (depName.length != 0 && majName.length == 0 && className.length == 0) {

                //执行重载
                table.reload('testReload', {
                    url: '/userctlr/allClassInfoByDepa.do'
                    , method: 'get'
                    , page: {
                        curr: 1 //重新从第 1 页开始
                    }
                    , where: {
                        depname: depName
                    }
                });

            } else if (depName.length != 0 && majName.length != 0 && className.length == 0) {
                //执行重载
                table.reload('testReload', {
                    url: '/userctlr/allClassInfoByMajor.do'
                    , method: 'get'
                    , page: {
                        curr: 1 //重新从第 1 页开始
                    }
                    , where: {
                        majname: majName
                    }
                });
            } else if (depName.length != 0 && majName.length != 0 && className.length != 0) {
                //执行重载
                table.reload('testReload', {
                    url: '/userctlr/allClassInfoByClass.do'
                    , method: 'get'
                    , page: {
                        curr: 1 //重新从第 1 页开始
                    }
                    , where: {
                        classname: className
                    }
                });
            }


        });

        $("#clearAllSearch").click(function () {
            //执行重载
            table.reload('testReload', {
                url: '/userctlr/allClassInfo.do'
                , method: 'get'
                , page: {
                    curr: 1 //重新从第 1 页开始
                }
            });
        })


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
                    $("#editDepa").append(info);
                }

                layui.form.render("select");
            }

        });

        $.ajax({
            type: "post", // 指定是post还是get
            url: "/userctlr/allBoss.do", //发送请求的地址
            dataType: "json",
            error: function () { //如果确定能正确运行,可不写
                layer.msg("发生错误,请重试");
            },
            success: function (data) {
                for (var i = 0; i < data.allBoss.length; i++) {
                    var info = '<option value = "' + data.allBoss[i] + '">' + data.allBoss[i] + '</option>'
                    $("#Boss").append(info);
                    $("#Boss2").append(info);
                    $("#editBoss").append(info);

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

        form.on('select(depa-1)', function (data) {
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


                    for (var i = 0; i < data.allMajor.length; i++) {
                        var info = '<option value = "' + data.allMajor[i] + '">' + data.allMajor[i] + '</option>'
                        $("#Major2").append(info);
                    }
                    form.render("select");
                }
            })

        });


        form.on('select(editDepa)', function (data) {
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

                    var citySelect = document.getElementById("editMajor");
                    // 获取其所有子元素
                    var optionEleList = citySelect.getElementsByTagName("option");
                    // 循环遍历每个option元素，然后在citySelect中移除
                    while (optionEleList.length > 1) { //子元素的个数如果大于1就循环，等于1就不循环了！
                        citySelect.removeChild(optionEleList[1]); //总是删除1下标，因为1删除了，2就变成1了！
                    }


                    form.render('select');
                },
                success: function (data) {

                    var citySelect = document.getElementById("editMajor");
                    // 获取其所有子元素
                    var optionEleList = citySelect.getElementsByTagName("option");
                    // 循环遍历每个option元素，然后在citySelect中移除
                    while (optionEleList.length > 1) { //子元素的个数如果大于1就循环，等于1就不循环了！
                        citySelect.removeChild(optionEleList[1]); //总是删除1下标，因为1删除了，2就变成1了！
                    }


                    for (var i = 0; i < data.allMajor.length; i++) {
                        var info = '<option value = "' + data.allMajor[i] + '">' + data.allMajor[i] + '</option>'
                        $("#editMajor").append(info);
                    }
                    form.render("select");


                    $("#editCLassDepa").val(depaname)

                }
            })

        });

        form.on('select(editMajor)', function (data) {
            var majname = data.value
            form.render('select')

            $("#editCLassMajor").val(majname)

        });

        form.on('select(editBoss)', function (data) {
            var teaname = data.value
            form.render('select')

            $("#editCLassBoss").val(teaname)

        });


    });
</script>

<script>
    $("#addCLassName").blur(function () {
        var className = $(this).val()

        $.ajax({
            type: "get",
            url: "/userctlr/searchClassName.do",
            data: {
                "className": className,
            },
            dataType: "json",
            error: function () {
                layer.msg("错误，请重试");
            },
            success: function (data) {
                layer.msg(data.searchClassName);
            }
        });

    });


</script>

</body>
</html>
