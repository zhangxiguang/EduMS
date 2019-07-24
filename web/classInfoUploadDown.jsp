<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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

    <!-- --------------引入bootStrap fileUpload 所需js、css start ---------------- -->

    <link type="text/css" href="fileinput/css/fileinput.css"
          rel="stylesheet">
    <link href="fileinput/css/font-awesome.min.css" media="all"
          rel="stylesheet" type="text/css" />
    <link href="fileinput/css/theme.css" media="all" rel="stylesheet"
          type="text/css" />


    <!-- ---------------引入bootStrap fileUpload 所需js、css end ------------------ -->


</head>
<body>

<div id="page-inner" style="background-color: #E6E6E6;margin-top: 0">
    <div class="row">
        <div class="col-md-12">
            <h1 class="page-header">
                欢迎使用
                <small>班级信息管理模块-批量上传</small>

            </h1>
        </div>
    </div>
    <!-- /. ROW  -->


    <div class="row">
        <div class="col-md-6">
            <div class="panel panel-default">
                <div class="panel-heading">
                    请选择您要上传的文件(仅限xls及xlsx文件)
                </div>

                <div class="panel-body">


                    <table class="table-detail" cellpadding="0" cellspacing="0"
                           border="0" type="main">
                        <tr>
                            <%--<th>附件上传</th>--%>
                            <td colspan="6"><input id="file" name="file" multiple
                                                   type="file" data-show-caption="true" class="projectfile"></td>
                        </tr>
                    </table>

                    <input type="hidden" id="flmAtt" name="flmAtt"
                           value="${flowMs.flmAtt}" />


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


<script src="fileinput/js/fileinput.min.js"></script>
<script src="fileinput/js/locales/zh.js"></script>
<script src="fileinput/js/plugins/sortable.js" type="text/javascript"></script>
<script src="fileinput/js/theme.min.js" type="text/javascript"></script>
<script src="fileinput/js/theme.js" type="text/javascript"></script>
<script src="fileinput/js/popper.min.js" type="text/javascript"></script>


<script type="text/javascript">
    //文件上传
    $(function() {
        initFileInput("file");
    });
    //文件上传
    function initFileInput(ctrlName) {
        var control = $('#' + ctrlName);
        control.fileinput({
            language : 'zh', //设置语言
            uploadUrl : "/userctlr/fileUpload.do?flmNo=${flowMs.flmNo}", //上传的地址
            /* allowedFileExtensions : [ 'jpg', 'gif', 'png', 'txt', 'xlsx', 'zip', 'pdf', 'pptx', 'docx', 'xls' ], //接收的文件后缀 */
            allowedFileExtensions : [ 'xlsx','xls' ], //接收的文件后缀
            //uploadExtraData:{"id": 1, "fileName":'123.mp3'},
            uploadAsync : true, //默认异步上传
            showUpload : true, //是否显示上传按钮
            showRemove : true, //显示移除按钮
            showPreview : true, //是否显示预览
            showCaption : false, //是否显示标题
            browseClass : "btn btn-primary", //按钮样式
            //dropZoneEnabled: true,//是否显示拖拽区域
            //minImageWidth: 50, //图片的最小宽度
            //minImageHeight: 50,//图片的最小高度
            //maxImageWidth: 1000,//图片的最大宽度
            //maxImageHeight: 1000,//图片的最大高度
            //maxFileSize: 0,//单位为kb，如果为0表示不限制文件大小
            //minFileCount: 0,
            maxFileCount : 10, //表示允许同时上传的最大文件个数
            enctype : 'multipart/form-data',
            validateInitialCount : true,
            previewFileIcon : "<i class='glyphicon glyphicon-king'></i>",
            msgFilesTooMany : "选择上传的文件数量({n}) 超过允许的最大数值{m}！",
        }).on('filepreupload', function(event, data, previewId, index) { //上传中
            var form = data.form,
                files = data.files,
                extra = data.extra,
                response = data.response,
                reader = data.reader;
            console.log('文件正在上传');
        }).on("fileuploaded", function(event, data, previewId, index) { //一个文件上传成功
            //后台返回的文件保存路径
            var filePath = data.response;
            if (!filePath == null) {
                //已经上传的附件路径
                var flmAtt = $('#flmAtt').val();
                if (flmAtt.isEmpty()) {
                    //赋值
                    flmAtt = filePath;
                } else {
                    //将附件保存地址拼接
                    flmAtt = flmAtt + "," + filePath;fileinput
                }
                //清空
                $('#flmAtt').val("");
                //赋值-->传入后台
                $('#flmAtt').val(flmAtt);
            }

            console.log('文件上传成功！' );
            layer.msg('文件上传成功！')



        }).on('fileerror', function(event, data, msg) { //一个文件上传失败
            console.log('文件上传失败！' );

            layer.msg('文件上传失败！')



        });
    }
</script>

</body>
</html>
