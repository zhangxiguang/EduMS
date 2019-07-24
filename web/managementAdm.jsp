<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="multipart/form-data; charset=utf-8"/>
    <title>layui</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <link rel="stylesheet" href="layui/css/layui.css" media="all">
    <!-- 注意：如果你直接复制所有代码到本地，上述css路径需要改成你本地的 -->
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
                <small>EduMS教务管理系统-管理员管理中心</small>

            </h1>
        </div>
    </div>
    <!-- /. ROW  -->


    <div class="row">
        <div class="col-md-12">
            <div class="panel panel-default">
                <div class="panel-heading">
                    尊敬的管理员:${sessionScope.nowadmin.admname},您好.因为此功能仅面向超级管理员，所以请您先验证身份.
                </div>


                <div class="panel-body">

                    <form class="layui-form  layui-form-pane" action="">
                        <div class="layui-form-item">
                            <label class="layui-form-label">当前账户</label>
                            <div class="layui-input-inline">
                                <input id="nowAdmName" type="text" name="title" autocomplete="off"
                                       value="${sessionScope.nowadmin.admname}"
                                       placeholder="${sessionScope.nowadmin.admname}" class="layui-input" disabled>
                            </div>
                        </div>

                        <div class="layui-form-item">
                            <div class="layui-input-block">
                                <button type="button" class="layui-btn layui-btn-normal" id="checkStatusBtn">
                                    点击验证身份
                                </button>
                            </div>
                        </div>


                        <div id="dataTable" class="layui-form-item" style="width: 900px;display: none">

                            <table class="layui-hide" id="classInfoTable" lay-filter="test"></table>

                        </div>


                    </form>


                </div>
            </div>
        </div>
    </div>


</div>


<!-- Modal -->
<div class="modal fade" id="addNewAdm" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span>
                </button>
                <h4 class="modal-title" id="myModalLabel">新增班级信息</h4>
            </div>
            <div class="modal-body" style="margin: 20px">

                <form class="layui-form layui-form-pane">

                    <div class="layui-form-item">
                        <label class="layui-form-label">管理员账户</label>
                        <div class="layui-input-inline">
                            <input id="newAdmName" type="text" name="username" lay-verify="required"
                                   placeholder="请输入管理员账户"
                                   autocomplete="off" class="layui-input">
                        </div>
                        <div class="layui-form-mid layui-word-aux">请务必填写管理员账户</div>
                    </div>

                    <div class="layui-form-item">
                        <label class="layui-form-label">密码</label>
                        <div class="layui-input-inline">
                            <input id="newAdmPass1" type="password" name="password" placeholder="请输入密码"
                                   autocomplete="off"
                                   class="layui-input">
                        </div>
                        <div class="layui-form-mid layui-word-aux">请输入密码</div>
                    </div>

                    <div class="layui-form-item">
                        <label class="layui-form-label">重复密码</label>
                        <div class="layui-input-inline">
                            <input id="newAdmPass2" type="password" name="password" placeholder="请再次输入密码"
                                   autocomplete="off"
                                   class="layui-input">
                        </div>
                        <div class="layui-form-mid layui-word-aux">请再次输入密码</div>
                    </div>

                    <div class="layui-form-item">
                        <label class="layui-form-label">联系方式</label>
                        <div class="layui-input-inline">
                            <input id="newAdmTel" type="number" name="phone" placeholder="请输入绑定手机号" autocomplete="off"
                                   class="layui-input">
                        </div>
                        <div class="layui-form-mid layui-word-aux">请输入绑定手机号</div>
                    </div>

                    <div class="layui-form-item" pane="">
                        <label class="layui-form-label">账户状态</label>
                        <div class="layui-input-block">
                            <input id="newAdmStatus" type="radio" name="sex" value="true" title="正常登录" checked="">
                            <input type="radio" name="sex" value="false" title="禁止登录">

                        </div>
                    </div>

                </form>

            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-danger" data-dismiss="modal">取消添加</button>
                <button id="addNewAdmBtn" type="button" class="btn btn-primary" data-dismiss="modal">确认新增</button>
            </div>
        </div>
    </div>
</div>

<!-- Modal -->
<div class="modal fade" id="editAdmInfo" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span>
                </button>
                <h4 class="modal-title" id="myModalLabel2">新增班级信息</h4>
            </div>
            <div class="modal-body" style="margin: 20px">

                <form class="layui-form layui-form-pane">
                    <input id="editAdmId" type="hidden">
                    <div class="layui-form-item">
                        <label class="layui-form-label">管理员账户</label>
                        <div class="layui-input-inline">
                            <input id="editAdmName" type="text" name="username" lay-verify="required"
                                   placeholder="请输入管理员账户"
                                   autocomplete="off" class="layui-input" disabled>
                        </div>
                        <div class="layui-form-mid layui-word-aux">账户暂不支持修改</div>
                    </div>

                    <div class="layui-form-item">
                        <label class="layui-form-label">密码</label>
                        <div class="layui-input-inline">
                            <input id="editAdmPass" type="password" name="password" placeholder="请输入密码"
                                   autocomplete="off"
                                   class="layui-input">
                        </div>
                        <div class="layui-form-mid layui-word-aux">请输入密码</div>
                    </div>


                    <div class="layui-form-item">
                        <label class="layui-form-label">联系方式</label>
                        <div class="layui-input-inline">
                            <input id="editAdmTel" type="number" name="phone" placeholder="请输入绑定手机号" autocomplete="off"
                                   class="layui-input">
                        </div>
                        <div class="layui-form-mid layui-word-aux">请输入绑定手机号</div>
                    </div>

                    <div class="layui-form-item" pane="">
                        <label class="layui-form-label">账户状态</label>
                        <div class="layui-input-block">
                            <input id="editAdmStatus" type="radio" name="sex" value="true" title="正常登录" checked="">
                            <input id="editAdmStatus2" type="radio" name="sex" value="false" title="禁止登录">

                        </div>
                    </div>

                </form>

            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-danger" data-dismiss="modal">取消修改</button>
                <button id="editNewAdmBtn" type="button" class="btn btn-primary" data-dismiss="modal">确认修改</button>
            </div>
        </div>
    </div>
</div>

<script type="text/html" id="barDemo">
    <%--<a class="layui-btn layui-btn-primary layui-btn-xs" lay-event="detail">查看</a>--%>
    <a class="layui-btn layui-btn-xs" lay-event="edit">编辑</a>
    <a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="del">删除</a>
</script>


<script src="layui/layui.js" charset="utf-8"></script>
<!-- 注意：如果你直接复制所有代码到本地，上述js路径需要改成你本地的 -->
<!-- jQuery Js -->
<script src="js/jquery-3.3.1.min.js"></script>
<!-- Bootstrap Js -->
<script src="js/bootstrap.min.js"></script>
<!-- Metis Menu Js -->
<script src="js/jquery.metisMenu.js"></script>
<!-- Custom Js -->
<script src="js/custom-scripts.js"></script>

<!-- 引入 echarts.js -->
<script src="js/echarts.js"></script>


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
            , url: '/userctlr/allAdmInfo.do' //数据接口
            , title: '用户表'
            , page: true //开启分页
            , toolbar: 'default' //开启工具栏，此处显示默认图标，可以自定义模板，详见文档
            , totalRow: false //开启合计行
            , cols: [[ //表头
                {type: 'checkbox', fixed: 'left'}
                , {field: 'admid', title: '管理员ID', width: 120, sort: true, fixed: 'left', totalRowText: '合计：'}
                , {field: 'admname', title: '管理员账户', width: 120, sort: true, totalRow: true}
                , {field: 'admpass', title: '管理员密码', width: 120, sort: true}
                , {field: 'admphone', title: '管理员电话', width: 140, sort: true}
                , {
                    field: 'admstatus', title: '管理员状态', width: 140, sort: true, templet: function (d) {
                        if (d.admstatus == true) {
                            return '<input type="checkbox" checked lay-skin="switch" lay-filter="switchTest" lay-text="正常|禁止" value=' + d.admid + '>'
                        } else {
                            return '<input type="checkbox" lay-skin="switch" lay-filter="switchTest" lay-text="正常|禁止" value=' + d.admid + '>'
                        }
                        // return 'ID：'+ d.admstatus +'，标题：<span style="color: #c00;">'+ d.admid +'</span>'
                    }
                }
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
                    $("#addNewAdm").modal()
                    break;
                case 'update':
                    if (data.length === 0) {
                        layer.msg('请选择一行');
                    } else if (data.length > 1) {
                        layer.msg('只能同时编辑一个');
                    } else {
                        // layer.alert('编辑 [id]：' + checkStatus.data[0].id);


                        $("#editAdmInfo").modal()
                        $("#editAdmId").val(checkStatus.data[0].admid)
                        $("#editAdmName").val(checkStatus.data[0].admname)
                        $("#editAdmPass").val(checkStatus.data[0].admpass)
                        $("#editAdmTel").val(checkStatus.data[0].admphone)

                        if(checkStatus.data[0].admstatus==true){
                            $("#editAdmStatus").prop("checked",true);
                            form.render()
                        }else{
                            $("#editAdmStatus2").prop("checked",true);
                            form.render()
                        }



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
                        url: "/userctlr/delAdm.do",
                        data: {
                            "admId": data.admid,
                        },
                        dataType: "json",
                        error: function (data) {
                            layer.msg(data.delClassResult);
                        },
                        success: function (data) {
                            var json = JSON.parse(data)

                            if (json.delAdm == true) {
                                layer.msg('删除成功')

                                tableIns.reload();

                            } else {
                                layer.msg('删除失败，请稍后重试')
                            }
                            tableIns.reload();


                        }
                    });


                });
            } else if (layEvent === 'edit') {
                // layer.msg(data.classid);

                $("#editAdmInfo").modal()
                $("#editAdmId").val(data.admid)
                $("#editAdmName").val(data.admname)
                $("#editAdmPass").val(data.admpass)
                $("#editAdmTel").val(data.admphone)

                if(data.admstatus==true){
                    $("#editAdmStatus").prop("checked",true);
                    form.render()
                }else{
                    $("#editAdmStatus2").prop("checked",true);
                    form.render()
                }

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

        //监听指定开关
        form.on('switch(switchTest)', function (data) {

            if (this.checked == true) {

                $.ajax({
                    type: "get",
                    url: "/userctlr/updateNorAdminStatus.do",
                    data: {
                        "admid": data.value,
                        "admstatus": true,
                    },
                    error: function () {
                        layer.msg("错误，请重试");
                    },
                    success: function (data) {
                        layer.msg('更新成功');

                        tableIns.reload();
                        form.render();

                    }
                });

            } else {
                // layer.msg('false')

                $.ajax({
                    type: "get",
                    url: "/userctlr/updateNorAdminStatus.do",
                    data: {
                        "admid": data.value,
                        "admstatus": false,
                    },
                    error: function () {
                        layer.msg("错误，请重试");
                    },
                    success: function (data) {
                        layer.msg('更新成功');

                        tableIns.reload();
                        form.render();

                    }
                });
            }

        });

        $("#addNewAdmBtn").click(function () {
            var status = null;


            if ($("#newAdmStatus").is(':checked')) {
                status = true
            }
            else status = false


            if($("#newAdmName").val().length!=0&&$("#newAdmPass2").val().length!=0&&$("#newAdmTel").val().length!=0){
                $.ajax({
                    type: "post",
                    url: "/userctlr/addNewAdm.do",
                    data: {
                        "admName": $("#newAdmName").val(),
                        "admPass": $("#newAdmPass1").val(),
                        "admTel": $("#newAdmTel").val(),
                        "admStatus":status,

                    },
                    success: function (data) {

                        var json = JSON.parse(data)

                        if (json.addNewAdm == true) {
                            layer.msg('添加成功')

                            tableIns.reload();

                        } else {
                            layer.msg('添加失败，请稍后重试')
                        }
                    }
                });
            }else {
                layer.open({
                    title: '温馨提示'
                    , content: '信息尚未填全，请重试'
                });
            }


        });

        $("#editNewAdmBtn").click(function () {
            var status = null;


            if ($("#editAdmStatus").is(':checked')) {
                status = true
            }
            else status = false

            $.ajax({
                type: "post",
                url: "/userctlr/updateNorAdminInfo.do",
                data: {
                    "admid":$("#editAdmId").val(),
                    "admname": $("#editAdmName").val(),
                    "admpass": $("#editAdmPass").val(),
                    "admphone": $("#editAdmTel").val(),
                    "admstatus":status,

                },
                success: function (data) {

                    var json = JSON.parse(data)

                    if (json.updateNorAdminInfo == true) {
                        layer.msg('修改成功')

                        tableIns.reload();

                    } else {
                        layer.msg('修改失败，请稍后重试')
                    }
                }
            });

        });

        //底部信息
        var footerTpl = lay('#footer')[0].innerHTML;
        lay('#footer').html(layui.laytpl(footerTpl).render({}))
            .removeClass('layui-hide');
    });
</script>


<script type="text/javascript">

    $("#checkStatusBtn").click(function () {

        var status = $("#nowAdmName").val()

        // layer.msg(status)

        if (status != 'admin') {
            layer.open({
                title: '温馨提示'
                , content: '此功能仅面向超级管理员哦!'
            });

        } else {
            $("#dataTable").show()
            //显示数据表格
        }

    });

    $("#newAdmName").blur(function () {
        $.ajax({
            type: "post",
            url: "/userctlr/checkAdmName.do",
            data: {
                "admName": $("#newAdmName").val(),
            },
            success: function (data) {

                var json = JSON.parse(data)

                if (json.checkAdmName == true) {
                    layer.open({
                        title: '温馨提示'
                        , content: '该账户已被注册，请修改'
                    });
                    $("#newAdmName").val('')

                } else {

                }
            }
        });

    });

    $("#newAdmPass2").blur(function () {
        if ($("#newAdmPass1").val() != $("#newAdmPass2").val()) {
            layer.open({
                title: '温馨提示'
                , content: '两次输入的密码不同，请修改'
            });
            $("#newAdmPass2").val('')
        }

    });




</script>


</body>
</html>
