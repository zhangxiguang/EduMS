<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>layui</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <link rel="stylesheet" href="layui/css/layui.css"  media="all">
    <!-- 注意：如果你直接复制所有代码到本地，上述css路径需要改成你本地的 -->
</head>
<body>



<div class="site-demo-button" id="layerDemo" style="margin-bottom: 0;">

    <button data-method="notice" class="layui-btn">示范一个公告层</button>

</div>




<script src="layui/layui.js" charset="utf-8"></script>
<!-- 注意：如果你直接复制所有代码到本地，上述js路径需要改成你本地的 -->
<script>
    layui.use('layer', function(){ //独立版的layer无需执行这一句
        var $ = layui.jquery, layer = layui.layer,form=layui.form; //独立版的layer无需执行这一句

        //触发事件
        var active = {
            notice: function(){
                //示范一个公告层
                layer.open({
                    type: 1
                    ,title: 'test' //不显示标题栏
                    ,closeBtn: false
                    ,area: '800px;'
                    ,shade: 0.8
                    ,id: 'LAY_layuipro' //设定一个id，防止重复弹出
                    ,btn: ['火速围观', '残忍拒绝']
                    ,btnAlign: 'c'
                    ,moveType: 1 //拖拽模式，0或者1
                    ,content: '<div style="margin: 20px"><form class="layui-form layui-form-pane" action="">\n' +
                    '  <div class="layui-form-item">\n' +
                    '    <label class="layui-form-label">管理员账户</label>\n' +
                    '    <div class="layui-input-inline">\n' +
                    '      <input type="text" name="username" lay-verify="required" placeholder="请输入" autocomplete="off" class="layui-input">\n' +
                    '    </div>\n' +
                    '  </div>\n' +
                    '  \n' +
                    '  <div class="layui-form-item">\n' +
                    '    <div class="layui-inline">\n' +
                    '      <label class="layui-form-label">日期选择</label>\n' +
                    '      <div class="layui-input-block">\n' +
                    '        <input type="text" name="date" id="date1" autocomplete="off" class="layui-input">\n' +
                    '      </div>\n' +
                    '    </div>\n' +
                    '    <div class="layui-inline">\n' +
                    '      <label class="layui-form-label">行内表单</label>\n' +
                    '      <div class="layui-input-inline">\n' +
                    '        <input type="text" name="number" autocomplete="off" class="layui-input">\n' +
                    '      </div>\n' +
                    '    </div>\n' +
                    '  </div>\n' +
                    '  <div class="layui-form-item">\n' +
                    '    <label class="layui-form-label">密码</label>\n' +
                    '    <div class="layui-input-inline">\n' +
                    '      <input type="password" name="password" placeholder="请输入密码" autocomplete="off" class="layui-input">\n' +
                    '    </div>\n' +
                    '    <div class="layui-form-mid layui-word-aux">请务必填写用户名</div>\n' +
                    '  </div>\n' +
                    '  \n' +
                    '  <div class="layui-form-item">\n' +
                    '    <div class="layui-inline">\n' +
                    '      <label class="layui-form-label">范围</label>\n' +
                    '      <div class="layui-input-inline" style="width: 100px;">\n' +
                    '        <input type="text" name="price_min" placeholder="￥" autocomplete="off" class="layui-input">\n' +
                    '      </div>\n' +
                    '      <div class="layui-form-mid">-</div>\n' +
                    '      <div class="layui-input-inline" style="width: 100px;">\n' +
                    '        <input type="text" name="price_max" placeholder="￥" autocomplete="off" class="layui-input">\n' +
                    '      </div>\n' +
                    '    </div>\n' +
                    '  </div>\n' +
                    '  \n' +
                    '  <div class="layui-form-item">\n' +
                    '    <label class="layui-form-label">单行选择框</label>\n' +
                    '    <div class="layui-input-block">\n' +
                    '      <select name="interest" lay-filter="aihao">\n' +
                    '        <option value=""></option>\n' +
                    '        <option value="0">写作</option>\n' +
                    '        <option value="1" selected="">阅读</option>\n' +
                    '        <option value="2">游戏</option>\n' +
                    '        <option value="3">音乐</option>\n' +
                    '        <option value="4">旅行</option>\n' +
                    '      </select>\n' +
                    '    </div>\n' +
                    '  </div>\n' +
                    '  \n' +
                    '  <div class="layui-form-item">\n' +
                    '    <label class="layui-form-label">行内选择框</label>\n' +
                    '    <div class="layui-input-inline">\n' +
                    '      <select name="quiz1">\n' +
                    '        <option value="">请选择省</option>\n' +
                    '        <option value="浙江" selected="">浙江省</option>\n' +
                    '        <option value="你的工号">江西省</option>\n' +
                    '        <option value="你最喜欢的老师">福建省</option>\n' +
                    '      </select>\n' +
                    '    </div>\n' +
                    '    <div class="layui-input-inline">\n' +
                    '      <select name="quiz2">\n' +
                    '        <option value="">请选择市</option>\n' +
                    '        <option value="杭州">杭州</option>\n' +
                    '        <option value="宁波" disabled="">宁波</option>\n' +
                    '        <option value="温州">温州</option>\n' +
                    '        <option value="温州">台州</option>\n' +
                    '        <option value="温州">绍兴</option>\n' +
                    '      </select>\n' +
                    '    </div>\n' +
                    '    <div class="layui-input-inline">\n' +
                    '      <select name="quiz3">\n' +
                    '        <option value="">请选择县/区</option>\n' +
                    '        <option value="西湖区">西湖区</option>\n' +
                    '        <option value="余杭区">余杭区</option>\n' +
                    '        <option value="拱墅区">临安市</option>\n' +
                    '      </select>\n' +
                    '    </div>\n' +
                    '  </div>\n' +
                    '  <div class="layui-form-item" pane="">\n' +
                    '    <label class="layui-form-label">开关-开</label>\n' +
                    '    <div class="layui-input-block">\n' +
                    '      <input type="checkbox" checked="" name="open" lay-skin="switch" lay-filter="switchTest" title="开关">\n' +
                    '    </div>\n' +
                    '  </div>\n' +
                    '  <div class="layui-form-item" pane="">\n' +
                    '    <label class="layui-form-label">单选框</label>\n' +
                    '    <div class="layui-input-block">\n' +
                    '      <input type="radio" name="sex" value="男" title="男" checked="">\n' +
                    '      <input type="radio" name="sex" value="女" title="女">\n' +
                    '      <input type="radio" name="sex" value="禁" title="禁用" disabled="">\n' +
                    '    </div>\n' +
                    '  </div>\n' +
                    '  <div class="layui-form-item layui-form-text">\n' +
                    '    <label class="layui-form-label">文本域</label>\n' +
                    '    <div class="layui-input-block">\n' +
                    '      <textarea placeholder="请输入内容" class="layui-textarea"></textarea>\n' +
                    '    </div>\n' +
                    '  </div>\n' +
                    '  <div class="layui-form-item">\n' +
                    '    <button class="layui-btn" lay-submit="" lay-filter="demo2">跳转式提交</button>\n' +
                    '  </div>\n' +
                    '</form></div>'
                    ,success: function(layero){
                        form.render();

                        var btn = layero.find('.layui-layer-btn');
                        btn.find('.layui-layer-btn0').attr({
                            href: 'http://www.layui.com/'
                            ,target: '_blank'
                        });
                    }
                });
            }
            ,offset: function(othis){
                var type = othis.data('type')
                    ,text = othis.text();

                layer.open({
                    type: 1
                    ,offset: type //具体配置参考：http://www.layui.com/doc/modules/layer.html#offset
                    ,id: 'layerDemo'+type //防止重复弹出
                    ,content: '<div style="padding: 20px 100px;">'+ text +'</div>'
                    ,btn: '关闭全部'
                    ,btnAlign: 'c' //按钮居中
                    ,shade: 0 //不显示遮罩
                    ,yes: function(){
                        layer.closeAll();
                    }
                });
            }
        };

        $('#layerDemo .layui-btn').on('click', function(){
            var othis = $(this), method = othis.data('method');
            active[method] ? active[method].call(this, othis) : '';
        });

    });

    function test(){
        alert('test')
    }
</script>

</body>
</html>