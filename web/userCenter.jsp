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
                <small>EduMS教务管理系统-个人中心</small>

            </h1>
        </div>
    </div>
    <!-- /. ROW  -->


    <div class="row">
        <div class="col-md-12">
            <div class="panel panel-default">
                <div class="panel-heading">
                    尊敬的管理员:${sessionScope.nowadmin.admname},您好
                </div>


                <div class="panel-body">

                    <form class="layui-form  layui-form-pane" action="">
                        <div class="layui-form-item">
                            <label class="layui-form-label">当前账户</label>
                            <div class="layui-input-inline">
                                <input id="nowAdmName" type="text" name="title" autocomplete="off" value="${sessionScope.nowadmin.admname}"
                                       placeholder="${sessionScope.nowadmin.admname}" class="layui-input" disabled>
                            </div>
                        </div>

                        <div class="layui-form-item">
                            <label class="layui-form-label">资料修改</label>
                            <div class="layui-input-block">
                                <input id="kaiguan" type="checkbox" name="close" lay-skin="switch"
                                       lay-filter="switchTest" disabled
                                       lay-text="开|关" >
                            </div>
                        </div>


                        <div class="layui-form-item">
                            <div class="layui-inline">
                                <label class="layui-form-label">验证手机</label>
                                <div class="layui-input-inline">
                                    <input id="newTelNum" type="number" name="phone" lay-verify="required|phone"
                                           autocomplete="off"
                                           class="layui-input">
                                </div>
                                <div class="layui-form-mid layui-word-aux">请填写账户绑定手机号</div>
                            </div>
                        </div>

                        <div class="layui-form-item">
                            <div class="layui-input-block">
                                <button class="layui-btn layui-btn-normal" id="captchaBtn" onclick="getNoteCode(this)">
                                    点击获取验证码
                                </button>
                            </div>
                        </div>


                        <div class="layui-form-item">
                            <label class="layui-form-label">短信验证</label>
                            <div class="layui-input-inline">
                                <input id="duanxinNum" type="number" name="password" lay-verify="required|duanxin"
                                       placeholder="请输入短信验证码"
                                       autocomplete="off" class="layui-input">
                            </div>
                            <div class="layui-form-mid layui-word-aux">短信验证码5分钟后过期,请尽快填写!</div>
                        </div>


                        <div class="layui-form-item">
                            <div class="layui-input-block">
                                <button class="layui-btn" id="TelNumCheck">立即验证</button>
                                <button type="reset" class="layui-btn layui-btn-primary">重置</button>
                            </div>
                        </div>


                        <div class="layui-form-item hiddenInfo" style="display: none">
                            <label class="layui-form-label">新密码</label>
                            <div class="layui-input-inline">
                                <input id="newPass" type="password" name="password" required lay-verify="required"
                                       placeholder="请输入密码" autocomplete="off" class="layui-input">
                            </div>
                            <div class="layui-form-mid layui-word-aux">请输入密码</div>
                        </div>

                        <div class="layui-form-item hiddenInfo" style="display: none">
                            <label class="layui-form-label">重复密码</label>
                            <div class="layui-input-inline">
                                <input id="newPass2" type="password" name="password" required lay-verify="required"
                                       placeholder="请再次输入密码" autocomplete="off" class="layui-input">
                            </div>
                            <div class="layui-form-mid layui-word-aux">请再次输入密码</div>
                        </div>

                        <div class="layui-form-item hiddenInfo" style="display: none">
                            <div class="layui-inline">
                                <label class="layui-form-label">新手机号</label>
                                <div class="layui-input-inline">
                                    <input id="newPhone" type="tel" name="phone" lay-verify="required|phone" autocomplete="off"
                                           class="layui-input">
                                </div>
                                <div class="layui-form-mid layui-word-aux">请填写新的手机号</div>
                            </div>

                        </div>

                        <div class="layui-form-item hiddenInfo" style="display: none">
                            <div class="layui-input-block">
                                <button id="updateAdminInfo" class="layui-btn" type="button">确认修改</button>
                                <button type="reset" class="layui-btn layui-btn-primary">重置</button>
                            </div>
                        </div>

                    </form>


                </div>
            </div>
        </div>
    </div>


</div>


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
    layui.use(['form', 'layedit', 'laydate'], function () {
        var form = layui.form
            , layer = layui.layer
            , layedit = layui.layedit
            , laydate = layui.laydate;

        //日期
        laydate.render({
            elem: '#date'
        });
        laydate.render({
            elem: '#date1'
        });

        //创建一个编辑器
        var editIndex = layedit.build('LAY_demo_editor');

        //自定义验证规则
        form.verify({
            title: function (value) {
                if (value.length < 5) {
                    return '标题至少得5个字符啊';
                }
            }
            , pass: [
                /^[\S]{6,12}$/
                , '密码必须6到12位，且不能出现空格'
            ]
            , duanxin: [
                /^[\S]{6,6}$/
                , '请输入6位短信验证码'
            ]
            , content: function (value) {
                layedit.sync(editIndex);
            }
        });

        //监听指定开关
        form.on('switch(switchTest)', function (data) {
           if(this.checked==false){//关
                $("#kaiguan").attr('disabled', 'true');
                $("#kaiguan").removeAttr('checked');
                form.render();
                $(".hiddenInfo").hide()
            }else {//开
               $("#kaiguan").attr('checked', 'true');
               $("#kaiguan").removeAttr('disabled');
               form.render();
               $(".hiddenInfo").show()
           }
            layer.tips('温馨提示：当此开关为开时您才能修改资料信息', data.othis)
        });

        //监听提交
        form.on('submit(demo1)', function (data) {
            layer.alert(JSON.stringify(data.field), {
                title: '最终的提交信息'
            })
            return false;
        });

        //表单初始赋值
        // form.val('example', {
        //     "username": "贤心" // "name": "value"
        //     , "password": "123456"
        //     , "interest": 1
        //     , "like[write]": true //复选框选中状态
        //     , "close": true //开关状态
        //     , "sex": "女"
        //     , "desc": "我爱 layui"
        // })


    });
</script>


<script type="text/javascript">

    //获取短信验证码
    var countDown = 60;

    function getNoteCode(val) {

        var newPhone = $("#newTelNum").val();
        var oldPhone =
        ${sessionScope.nowadmin.admphone}

        if (newPhone == "" || newPhone == null) {

            layer.msg("请输入正确的手机号")

        } else if (newPhone == oldPhone) {
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
                    layer.msg('验证通过，您现在可以修改密码及绑定手机号')

                    $("#kaiguan").attr('checked', 'true');
                    $("#kaiguan").removeAttr('disabled');
                    layui.form.render();
                    $(".hiddenInfo").show()
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

<script>

    $("#newPass2").blur(function () {

        var pass = $("#newPass").val()
        if ($(this).val() != pass) {
            layer.open({
                title: '请注意'
                , content: '两次密码不同，请重试'
            });
        }

    });

    $("#updateAdminInfo").click(function () {
        if ($("#newPass").val() == $("#newPass2").val()) {

            $.ajax({
                type: "post",
                url: "/userctlr/updateAdminInfo.do",
                data: {
                    "admId": ${sessionScope.nowadmin.admid},
                    "password": $("#newPass").val(),
                    "phone":$("#newPhone").val(),
                    "admName":$("#nowAdmName").val()
                },
                success: function (data) {
                    var json = JSON.parse(data)

                    var info=null;
                    if(json.updateAdminInfo==1){
                        info='更新成功'
                    }else {
                        info='更新失败'
                    }

                    layer.open({
                        title: '更新结果'
                        ,content: info
                    })

                    $("#kaiguan").attr('disabled', 'true');
                    $("#kaiguan").removeAttr('checked');
                    $(".hiddenInfo").hide()
                    $("#newTelNum").val('')
                    $("#duanxinNum").val('')

                    layui.form.render();

                },
                error: function () {
                    layer.msg('发生错误，请重试')
                }


            });
        }
    });

</script>

</body>
</html>
