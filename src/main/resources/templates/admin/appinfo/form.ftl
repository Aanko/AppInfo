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
                <form class="form-horizontal" id="appInfoForm">
                    <#if appInfo??>
                        <input type="hidden" name="id" value="${appInfo.id}">
                    </#if>
                    <div class="box-body">
                        <div class="form-group">
                            <label for="typeCode" class="col-sm-2 control-label">软件名称</label>
                            <div class="col-sm-10">
                                <input type="text" class="form-control" id="softwareName" name="softwareName" value="<#if appInfo??>${appInfo.softwareName?if_exists}</#if>">
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="typeName" class="col-sm-2 control-label">Apk名称</label>
                            <div class="col-sm-10">
                                <input type="text" class="form-control" id="apkName" name="apkName" value="<#if appInfo??>${appInfo.apkName?if_exists}</#if>" >
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="valueId" class="col-sm-2 control-label">应用简介</label>
                            <div class="col-sm-10">
                                <input type="text" class="form-control" id="appInduction" name="appInduction" value="<#if appInfo??>${appInfo.appInduction?if_exists}</#if>" >
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="valueName" class="col-sm-2 control-label">版本</label>
                            <div class="col-sm-10">
                                <input type="text" class="form-control" id="versionId" name="versionId" value="<#if appInfo??>${appInfo.versionId?if_exists}</#if>" >
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
        var param = $("#appInfoForm").serialize();
        $.ajax({
            type: 'POST',
            url: '/admin/appInfo/save',
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
