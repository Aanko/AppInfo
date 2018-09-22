package cc.slogc.appmanager.web.controller.admin;

import cc.slogc.appmanager.model.entity.AppInfo;
import cc.slogc.appmanager.model.entity.DataDictionary;
import cc.slogc.appmanager.service.AppInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Aanko on 2018/9/22.
 * @version 1.0
 */
@Controller
@RequestMapping(value = "/admin/appInfo")
public class AppInfoController {
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
        //将dictionaries返回到页面
        model.addAttribute("appInfos", appInfos);
        return "admin/admin_appInfo";
    }

}
