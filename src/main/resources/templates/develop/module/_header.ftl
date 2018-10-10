<header class="main-header">
    <a href="/admin" class="logo">
        <span class="logo-mini"><b>A</b>M</span>
        <span class="logo-lg"><b>App</b>Manager</span>
    </a>
    <nav class="navbar navbar-static-top" role="navigation">
        <a href="#" class="sidebar-toggle" data-toggle="push-menu" role="button">
            <span class="sr-only">Toggle navigation</span>
        </a>
        <div class="navbar-custom-menu">
            <ul class="nav navbar-nav">
                <li><a href="/" title="跳转到前台" target="_blank"><i class="fa fa-location-arrow"></i></a></li>
                <li class="dropdown user user-menu">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                        <img src="/static/images/default.png" class="user-image" alt="User Image">
                        <span class="hidden-xs">${sesysUser.devName}</span>
                    </a>
                    <ul class="dropdown-menu">
                        <li class="user-header">
                            <img src="/static/images/default.png" class="img-circle" alt="User Image">
                            <p>${sesysUser.devName}</p>
                        </li>
                        <li class="user-footer">
                            <div class="pull-left"><a data-pjax="true" href="#" class="btn btn-default "><i class="fa fa-user"></i>个人资料</a></div>
                            <div class="pull-right"><a href="/devlogin/loginout"  class="btn btn-default "><i class="fa fa-sign-out"></i>退出</a></div>
                        </li>
                    </ul>
                </li>
            </ul>
        </div>
    </nav>
</header>
