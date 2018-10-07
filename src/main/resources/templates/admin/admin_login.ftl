<#compress >
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
    <link rel="stylesheet" href="/static/plugins/bootstrap/css/bootstrap.min.css">

    <link rel="stylesheet" href="/static/plugins/toast/css/jquery.toast.min.css">
    <link rel="stylesheet" href="/static/plugins/font-awesome/css/font-awesome.min.css">
</head>
<div class="wrapper" xmlns="http://www.w3.org/1999/html">
    <div class="content-wrapper">
        <style type="text/css" rel="stylesheet">
            body {
                background-color: #f5f5f5;
            }

            .loginbox {
                padding-top: 30px;
                margin: 50px auto;
                width: 400px;
                height: 300px;
                background-color: #ffffff;

            }

            .login-input {
                margin: 20px auto;
                width: 90%;
            }

            @media screen and (max-width: 800px) {
                .loginbox {
                    width: 90%;
                    height: 250px;

                }
            }

            @media screen and (max-width: 420px) {
                .loginbox {
                    width: 90%;
                    height: 250px;
                }
            }

        </style>
        <section class="content-header" style="text-align: center">
            <h2 style="display: inline-block;">App信息管理系统（后台登录入口）</h2>
            <div class="loginbox">
                <form>
                    <div class="form-group login-input">
                        <input type="text" class="form-control" id="userCode" placeholder="请输入账号">
                    </div>
                    <div class="form-group login-input">
                        <input type="password" class="form-control" id="userPassword" placeholder="请输入密码">
                    </div>
                    <button type="button" class="btn btn-info" style="width: 90%;" id="btn-login" onclick="loginbtn()">
                        登录
                    </button>
                </form>
            </div>

        </section>
        <section class="content container-fluid">

        </section>
    </div>
    <script>
        function loginbtn() {
            $('#btn-login').button('loading');
            var code = $("#userCode").val();
            var pwd = $("#userPassword").val();
            if (code == "" || pwd == "") {
                $.toast({
                    text: "请输入完整内容！",
                    showHideTransition: 'fade',
                    allowToastClose: true,
                    icon: 'error',
                    hideAfter: 3000,
                    position: 'bottom-right',
                    textAlign: 'left',
                    loader: true,
                    loaderBg: '#ffffff'
                })
                $('#btn-login').button('reset');
            } else {
                $.ajax({
                    type: 'POST',
                    url: '/login/loginVerify',
                    async: false,
                    data: {
                        'userCode': code,
                        'userPassword': pwd
                    },
                    success: function (data) {
                        // alert(sysUser)
                        localStorage.setItem('userCode', $("#userCode").val());
                        if (data.code == 1) {
                            $.toast({
                                text: "登录成功！",
                                icon: 'success',
                                showHideTransition: 'fade',
                                allowToastClose: true,
                                hideAfter: 1000,
                                stack: 1,
                                position: 'top-center',
                                textAlign: 'left',
                                loader: true,
                                loaderBg: '#ffffff',
                                afterHidden: function () {
                                    window.location.href = "/admin";
                                }
                            });
                        } else {
                            $.toast({
                                text: " 账号或者密码错误！请重新输入！",
                                showHideTransition: 'fade',
                                allowToastClose: true,
                                icon: 'error',
                                hideAfter: 2000,
                                position: 'bottom-right',
                                textAlign: 'left',
                                loader: true,
                                loaderBg: '#ffffff',
                                afterHidden: function () {
                                    window.location.href = "/login";
                                }
                            })
                        }
                    }
                });
            }
        }

    </script>
    <script src="/static/plugins/jquery/jquery.min.js"></script>
    <script src="/static/plugins/bootstrap/js/bootstrap.min.js"></script>
    <script src="/static/plugins/toast/js/jquery.toast.min.js"></script>
    <script>
        $(document).keydown(function (event) {  //回车登录
            if (event.keyCode == 13) {
                loginbtn();
            }
        });
    </script>
</div>
</#compress>
