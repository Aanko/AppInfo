<aside class="main-sidebar">
    <section class="sidebar">
        <div class="user-panel">
            <div class="pull-left image">
                <img src="/static/images/default.png" class="img-circle" alt="User Image">
            </div>
            <div class="pull-left info">
                <p>admin</p><a href="#"><i class="fa fa-circle text-success"></i>个人资料</a>
            </div>
        </div>
        <form action="#" method="get" class="sidebar-form">
            <div class="input-group">
                <input type="text" name="q" class="form-control" placeholder="Search...">
                <span class="input-group-btn">
                  <button type="submit" name="search" id="search-btn" class="btn btn-flat">
                    <i class="fa fa-search"></i>
                  </button>
                </span>
            </div>
        </form>
        <ul class="sidebar-menu" data-widget="tree">
            <li class="header">HEADER</li>
            <li>
                <a data-pjax="true" href="/admin">
                    <i class="fa fa-dashboard"></i>
                    <span>仪表盘</span>
                </a>
            </li>
            <li class="treeview">
                <a data-pjax="true" href="#">
                    <i class="fa  fa-apple"></i>
                    <span>应用管理</span>
                    <span class="pull-right-container"><i class="fa fa-angle-left pull-right"></i></span>
                </a>
                <ul class="treeview-menu" style="">
                    <li><a data-pjax="true" href="/admin/appInfo"><i class="fa fa-circle-o"></i>应用列表</a></li>
                </ul>
            </li>
            <li class="treeview">
                <a data-pjax="true" href="#">
                    <i class="fa  fa-user-circle"></i>
                    <span>成员管理</span>
                    <span class="pull-right-container"><i class="fa fa-angle-left pull-right"></i></span>
                </a>
                <ul class="treeview-menu" style="">
                    <li><a data-pjax="true" href="/admin/DevUser"><i class="fa fa-circle-o"></i>开发者管理</a></li>
                    <li><a data-pjax="false" href="/admin/SysUser"><i class="fa fa-circle-o"></i>管理员</a></li>
                </ul>
            </li>
            <li class="treeview">
                <a data-pjax="true" href="#">
                    <i class="fa  fa-opera"></i>
                    <span>系统管理</span>
                    <span class="pull-right-container"><i class="fa fa-angle-left pull-right"></i></span>
                </a>
                <ul class="treeview-menu" style="">
                    <li><a data-pjax="true" href="/admin/dictionary"><i class="fa fa-circle-o"></i>字典管理</a></li>
                </ul>
            </li>
        </ul>
    </section>
</aside>
