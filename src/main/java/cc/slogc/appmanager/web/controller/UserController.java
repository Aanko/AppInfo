package cc.slogc.appmanager.web.controller;

import cc.slogc.appmanager.model.entity.User;
import cc.slogc.appmanager.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 注解@Controller，代表它为控制层，用作视图控制
 * 注解@RequestMapping，里面的value作为当前请求的路径，用作类上为根路径，用作方法上为子路径
 *
 * @author : RYAN0UP
 * @date : 2018/9/20
 */
@RestController
@RequestMapping(value = "/user")
public class UserController {

    /**
     * 自动注入业务层对象，不需要实例化
     */
    @Autowired
    private UserService userService;

    /**
     * 查询所有用户，返回json数据
     *
     * @return List
     */
    @GetMapping
    public List<User> list(){
        return userService.findAll();
    }

}
