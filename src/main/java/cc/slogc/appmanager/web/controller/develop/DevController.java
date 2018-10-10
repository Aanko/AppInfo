package cc.slogc.appmanager.web.controller.develop;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Aanko on 2018/10/10.
 * @version 1.0
 */
@Controller
@RequestMapping(value = "/Develop")
public class DevController {
    /**
     * 请求后台首页
     *
     * @return
     */
    @GetMapping
    public String develop() {
        return "develop/develop_index";
    }
}
