package cc.slogc.appmanager.web.controller.develop;

import cc.slogc.appmanager.WebSecurityConfig;
import cc.slogc.appmanager.model.dto.JsonResult;
import cc.slogc.appmanager.model.entity.DevUser;
import cc.slogc.appmanager.model.entity.SysUser;
import cc.slogc.appmanager.service.DevUserService;
import cc.slogc.appmanager.web.controller.admin.ResultCodeEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

/**
 * @author Aanko on 2018/10/10.
 * @version 1.0
 */
@Controller
@RequestMapping(value = "/devlogin")
public class DevLoginController {
    @Autowired
    private DevUserService devUserService;
    @GetMapping
    public String devlogin(){
        return "develop/develop_login";
    }

    @GetMapping("/Devlop")
    public String index(@SessionAttribute(WebSecurityConfig.SESSION_KEY) String account, Model model) {

        return "devlop/devlop_login";
    }
    //  登录验证
    @PostMapping("/loginVerify")
    @ResponseBody
    public JsonResult loginVerify(String devCode, String devPassword, HttpSession session) {
        DevUser devUser = new DevUser();
        devUser.setDevCode(devCode);
        devUser.setDevPassword(devPassword);

        DevUser verify = devUserService.verifyLogin(devUser);
        if (verify != null) {
            session.setAttribute(WebSecurityConfig.SESSION_KEY, verify);//存入session
            return new JsonResult(ResultCodeEnum.SUCCESS.getCode());//返回code为1
        } else {
            return new JsonResult(ResultCodeEnum.FAIL.getCode());
        }
    }

    //退出登录
    @GetMapping("/loginout")
    public String loginout(HttpSession session) {
        session.removeAttribute(WebSecurityConfig.SESSION_KEY);
        return "redirect:/devlogin";
    }
}
