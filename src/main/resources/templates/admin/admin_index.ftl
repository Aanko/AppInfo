<#compress >
<#include "module/_macro.ftl">
<@head>AppManager | 仪表盘</@head>
<div class="wrapper">
    <!-- 顶部栏模块 -->
    <#include "module/_header.ftl">
    <!-- 菜单栏模块 -->
    <#include "module/_sidebar.ftl">
    <div class="content-wrapper">
        <style type="text/css" rel="stylesheet">
            #btnWidgetsOption{margin-left:4px;padding:3px 6px;position:relative;top:-4px;border:1px solid #ccc;border-radius:2px;background:#fff;text-shadow:none;font-weight:600;font-size:12px;line-height:normal;color:#3c8dbc;cursor:pointer;transition:all .2s ease-in-out}
            #btnWidgetsOption:hover{background:#3c8dbc;color:#fff}
            .form-horizontal .control-label{
                text-align: left;
            }
            .control-radio{
                padding-top: 7px;
            }
        </style>
        <section class="content-header">
            <h1 style="display: inline-block;">仪表盘</h1>
            <ol class="breadcrumb">
                <li>
                    <a href="/admin"><i class="fa fa-dashboard"></i> 首页</a>
                </li>
                <li class="active">仪表盘</li>
            </ol>
        </section>
        <section class="content container-fluid">

        </section>
    </div>
    <#include "module/_footer.ftl">
</div>
<@footer></@footer>
</#compress>
