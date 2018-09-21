package cc.slogc.appmanager.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author : wangry
 * @version : 1.0
 * @date : 2018年09月21日
 */
@Controller
@RequestMapping(value = "/test")
public class TestController {

    @GetMapping
    public String test(){
        return "test";
    }
}
