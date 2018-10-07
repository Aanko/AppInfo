package cc.slogc.appmanager.web.controller.admin;

import cc.slogc.appmanager.WebSecurityConfig;
import cc.slogc.appmanager.model.dto.JsonResult;
import cc.slogc.appmanager.model.entity.SysUser;
import cc.slogc.appmanager.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;


/**
 * @author Aanko on 2018/9/28.
 * @version 1.0
 */
@Controller
@RequestMapping(value = "/login")
public class AdminLoginController {
    @Autowired
    private SysUserService sysUserService;
    @GetMapping
    public String login() {
        return "admin/admin_login";
    }

    @GetMapping("/admin")
    public String index(@SessionAttribute(WebSecurityConfig.SESSION_KEY) String account, Model model) {

        return "admin/admin_login";
    }
  //  登录验证
    @PostMapping("/loginVerify")
    @ResponseBody
    public JsonResult loginVerify(String userCode, String userPassword, HttpSession session){
        SysUser sysUser = new SysUser();
        sysUser.setUserCode(userCode);
        sysUser.setUserPassword(userPassword);

        SysUser verify = sysUserService.verifyLogin(sysUser);

        if (verify !=null) {
            session.setAttribute(WebSecurityConfig.SESSION_KEY, verify);
            return new JsonResult(ResultCodeEnum.SUCCESS.getCode());
        } else {
            return new JsonResult(ResultCodeEnum.FAIL.getCode());
        }
    }
    @GetMapping("/loginout")
    public String loginout(HttpSession session){
        session.removeAttribute(WebSecurityConfig.SESSION_KEY);
        return "redirect:/login";
    }
}
