<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
    <link rel="stylesheet" href="/static/plugins/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/static/css/AdminLTE.min.css">
    <style>
        .form-horizontal .control-label{text-align:left}
    </style>
</head>
<body>
<div class="container-fluid">
    <div class="row">
        <div class="col-lg-12 attachDesc">
            <div class="box box-solid">
                <div class="box-header with-border">
                    <h3 class="box-title">${title}</h3>
                </div>
                <form class="form-horizontal" id="devUserForm">
                    <#if devUser??>
                        <input type="hidden" name="id" value="${devUser.id}">
                    </#if>
                    <div class="box-body">
                        <div class="form-group">
                            <label for="devCode" class="col-sm-2 control-label">编码</label>
                            <div class="col-sm-10">
                                <input type="text" class="form-control" id="devCode" name="devCode" value="<#if devUser??>${devUser.devCode?if_exists}</#if>">
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="devName" class="col-sm-2 control-label">昵称</label>
                            <div class="col-sm-10">
                                <input type="text" class="form-control" id="devName" name="devName" value="<#if devUser??>${devUser.devName?if_exists}</#if>" >
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="devEmail" class="col-sm-2 control-label">邮箱</label>
                            <div class="col-sm-10">
                                <input type="text" class="form-control" id="devEmail" name="devEmail" value="<#if devUser??>${devUser.devEmail?if_exists}</#if>" >
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="devInfo" class="col-sm-2 control-label">开发者简介</label>
                            <div class="col-sm-10">
                                <input type="text" class="form-control" id="devInfo" name="devInfo" value="<#if devUser??>${devUser.devInfo?if_exists}</#if>" >
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="devPassword" class="col-sm-2 control-label">密码</label>
                            <div class="col-sm-10">
                                <input type="text" class="form-control" id="devPassword" name="devPassword" value="<#if devUser??>${devUser.devPassword?if_exists}</#if>" >
                            </div>
                        </div>
                    </div>
                    <div class="box-footer">
                        <button type="button" class="btn btn-danger btn-sm pull-left" onclick="save()">保存</button>
                        <button type="button" class="btn btn-info btn-sm pull-right" >取消</button>
                    </div>
                </form>
            </div>
        </div>
    </div>
</div>
</body>
<script src="/static/plugins/jquery/jquery.min.js"></script>
<script src="/static/plugins/bootstrap/js/bootstrap.min.js"></script>
<script src="/static/js/adminlte.min.js"></script>
<script src="/static/plugins/layer/layer.js"></script>
<script>
    function save() {
        var param = $("#devUserForm").serialize();
        $.ajax({
            type: 'POST',
            url: '/admin/DevUser/save',
            async: false,
            data: param,
            success: function (data) {
                if(data.code==1){
                    parent.location.reload();
                    alert("添加成功")
                }
            }
        });
    }
</script>
</html>
