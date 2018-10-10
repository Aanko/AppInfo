package cc.slogc.appmanager.web.controller.develop;

import cc.slogc.appmanager.model.dto.JsonResult;
import cc.slogc.appmanager.model.entity.AppInfo;
import cc.slogc.appmanager.service.AppInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * @author Aanko on 2018/9/22.
 * @version 1.0
 */
@Controller
@RequestMapping(value = "Develop/appInfo")
public class DevAppInfoController {
    @Autowired
    AppInfoService appInfoService;
    @GetMapping
    public String AppInfo(@RequestParam(value = "page", defaultValue = "0") Integer page,
                             @RequestParam(value = "size", defaultValue = "10") Integer size,
                             Model model) {
        //根据编号降序
        Sort sort = new Sort(Sort.Direction.DESC, "id");
        Pageable pageable = PageRequest.of(page, size, sort);
        Page<AppInfo> appInfos = appInfoService.listPage(pageable);
        //将appInfos返回到页面
        model.addAttribute("appInfos", appInfos);
        return "Develop/dev_app";
    }

    /**
     * 跳转到修改页面
     *
     * @param model model
     * @param id id
     * @return 模板路径develop/app/form
     */
    @GetMapping(value = "/toEdit")
    public String toEdit(Model model,
                         @RequestParam(value = "id") Long id){
        AppInfo appInfo = appInfoService.getById(id);
        if(null!=appInfo){
            model.addAttribute("appInfo",appInfo);
        }
        model.addAttribute("title", "修改");
        return "Develop/appInfo/form";
    }

    /**
     * 跳转到添加页面
     *
     * @param model model
     * @return 模板路径develop/appinfo/form
     */
    @GetMapping(value = "/toAdd")
    public String toAdd(Model model) {
        model.addAttribute("title", "添加");
        return "Develop/appInfo/form";
    }

    /**
     * 保存
     *
     * @param appInfo appInfo
     * @return JsonResult
     */
    @PostMapping(value = "/save")
    @ResponseBody
    public JsonResult add(@ModelAttribute AppInfo appInfo) {
        try {
            appInfoService.add(appInfo);
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
     * @return 重定向到/admin/appInfo
     */
    @GetMapping(value = "/delete")
    public String delete(@RequestParam(value = "id") Long id) {
            AppInfo appInfo = appInfoService.getById(id);
            if (null != appInfo) {
                appInfoService.delete(appInfo);
            }
        return "redirect:/Develop/appInfo";
    }
}
