package cc.slogc.appmanager.web.controller.admin;

import cc.slogc.appmanager.model.dto.JsonResult;
import cc.slogc.appmanager.model.entity.DevUser;
import cc.slogc.appmanager.service.DevUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * @author Aanko on 2018/9/24.
 * @version 1.0
 */
@Controller
@RequestMapping(value = "/admin/DevUser")
public class DevUserController {

    @Autowired
     DevUserService devUserService;
    /**
     * 字典列表
     *
     * @param page  当前页码
     * @param size  每页显示条数
     * @param model model
     * @return String 模板路径admin/admin_dev
     */
    @GetMapping
    public String DevUser(@RequestParam(value = "page", defaultValue = "0") Integer page,
                             @RequestParam(value = "size", defaultValue = "10") Integer size,
                             Model model) {
        //根据编号降序
        Sort sort = new Sort(Sort.Direction.DESC, "id");
        Pageable pageable = PageRequest.of(page, size, sort);
        Page<DevUser> devUsers = devUserService.listPage(pageable);
        //将dictionaries返回到页面
        model.addAttribute("devUsers", devUsers);
        return "admin/admin_dev";
    }

    /**
     * 跳转到修改页面
     *
     * @param model model
     * @param id id
     * @return 模板路径admin/DevUser/form
     */
    @GetMapping(value = "/toEdit")
    public String toEdit(Model model,
                         @RequestParam(value = "id") Long id){
        DevUser devUser = devUserService.getById(id);
        if(null!=devUser){
            model.addAttribute("devUser",devUser);
        }
        model.addAttribute("title", "修改");
        return "admin/DevUser/form";
    }

    /**
     * 跳转到添加页面
     *
     * @param model model
     * @return 模板路径admin/DevUser/form
     */
    @GetMapping(value = "/toAdd")
    public String toAdd(Model model) {
        model.addAttribute("title", "添加");
        return "admin/DevUser/form";
    }

    /**
     * 保存
     *
     * @param devUser devUser
     * @return JsonResult
     */
    @PostMapping(value = "/save")
    @ResponseBody
    public JsonResult add(@ModelAttribute DevUser devUser) {
        try {
            devUserService.add(devUser);
        } catch (Exception e) {
            e.printStackTrace();
            return new JsonResult(0, "保存失败");
        }
        return new JsonResult(1, "保存成功");
    }


    /**
     * 根据编号删除App信息
     *
     * @param id 编号
     * @return 重定向到/admin/DevUser
     */
    @GetMapping(value = "/delete")
    public String delete(@RequestParam(value = "id") Long id) {
        try {
            DevUser devUser = devUserService.getById(id);
            if (null != devUser) {
                devUserService.delete(devUser);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "redirect:/admin/DevUser";
    }

}