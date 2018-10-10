package cc.slogc.appmanager.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author : Aanko
 * @version : 1.0
 * @date : 2018年09月21日
 */
@Controller
@RequestMapping(value = "/index")
public class HomeController {

    @GetMapping
    public String test(){
        return "index";
    }
}