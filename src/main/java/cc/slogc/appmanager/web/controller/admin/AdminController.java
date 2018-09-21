package cc.slogc.appmanager.web.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author : RYAN0UP
 * @date : 2018/9/21
 */
@Controller
@RequestMapping(value = "/admin")
public class AdminController {

    /**
     * 请求后台首页
     * @return
     */
    @GetMapping
    public String admin(){
        return "admin/admin_index";
    }
}
