package cc.slogc.appmanager.web.controller.admin;

import cc.slogc.appmanager.model.dto.JsonResult;
import cc.slogc.appmanager.model.entity.SysUser;
import cc.slogc.appmanager.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * @author Aanko on 2018/9/25.
 * @version 1.0
 */
@Controller
@RequestMapping(value = "/admin/SysUser")
public class SysUserController {
    @Autowired
    SysUserService sysUserService;

    /**
     * 管理员列表
     *
     * @param page  当前页码
     * @param size  每页显示条数
     * @param model model
     * @return String 模板路径admin/admin_sys
     */
    @GetMapping
    public String SysUser(@RequestParam(value = "page", defaultValue = "0") Integer page,
                             @RequestParam(value = "size", defaultValue = "10") Integer size,
                             Model model) {
        //根据编号降序
        Sort sort = new Sort(Sort.Direction.DESC, "id");
        Pageable pageable = PageRequest.of(page, size, sort);
        Page<SysUser> sysUsers = sysUserService.listPage(pageable);
        //sysUsers返回界面
        model.addAttribute("sysUsers", sysUsers);
        return "admin/admin_sys";
    }

    /**
     * 跳转到修改页面
     *
     * @param model model
     * @param id id
     * @return 模板路径admin/SysUser/form
     */
    @GetMapping(value = "/toEdit")
    public String toEdit(Model model,
                         @RequestParam(value = "id") Long id){
        SysUser sysUser = sysUserService.getById(id);
        if(null!=sysUser){
            model.addAttribute("sysUser",sysUser);
        }
        model.addAttribute("title", "修改");
        return "admin/SysUser/form";
    }

    /**
     * 跳转到添加页面
     *
     * @param model model
     * @return 模板路径admin/SysUser/form
     */
    @GetMapping(value = "/toAdd")
    public String toAdd(Model model) {
        model.addAttribute("title", "添加");
        return "admin/SysUser/form";
    }

    /**
     * 保存
     *
     * @param sysUser sysUser
     * @return JsonResult
     */
    @PostMapping(value = "/save")
    @ResponseBody
    public JsonResult add(@ModelAttribute SysUser sysUser) {
        try {
            sysUserService.add(sysUser);
        } catch (Exception e) {
            e.printStackTrace();
            return new JsonResult(0, "保存失败");
        }
        return new JsonResult(1, "保存成功");
    }


    /**
     * 根据编号删除管理员用户
     *
     * @param id 编号
     * @return 重定向到/admin/SysUser
     */
    @GetMapping(value = "/delete")
    public String delete(@RequestParam(value = "id") Long id) {
        try {
            SysUser sysUser = sysUserService.getById(id);
            if (null != sysUser) {
                sysUserService.delete(sysUser);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "redirect:/admin/SysUser";
    }
}
