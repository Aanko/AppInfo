package cc.slogc.appmanager.web.controller.admin;

import cc.slogc.appmanager.model.dto.JsonResult;
import cc.slogc.appmanager.model.entity.DataDictionary;
import cc.slogc.appmanager.service.DataDictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * @author : RYAN0UP
 * @date : 2018/9/21
 */
@Controller
@RequestMapping(value = "/admin/dictionary")
public class DictionaryController {

    @Autowired
    DataDictionaryService dataDictionaryService;

    /**
     * 字典列表
     *
     * @param page  当前页码
     * @param size  每页显示条数
     * @param model model
     * @return String 模板路径admin/admin_dictionary
     */
    @GetMapping
    public String dictionary(@RequestParam(value = "page", defaultValue = "0") Integer page,
                             @RequestParam(value = "size", defaultValue = "10") Integer size,
                             Model model) {
        //根据编号降序
        Sort sort = new Sort(Sort.Direction.DESC, "id");
        Pageable pageable = PageRequest.of(page, size, sort);
        Page<DataDictionary> dictionaries = dataDictionaryService.listPage(pageable);
        //将dictionaries返回到页面
        model.addAttribute("dictionaries", dictionaries);
        return "admin/admin_dictionary";
    }

    /**
     * 根据编号删除字典
     *
     * @param id 编号
     * @return 重定向到/admin/dictionary
     */
    @GetMapping(value = "/delete")
    public String delete(@RequestParam(value = "id") Long id) {
        try {
            DataDictionary dataDictionary = dataDictionaryService.getById(id);
            if (null != dataDictionary) {
                dataDictionaryService.delete(dataDictionary);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "redirect:/admin/dictionary";
    }

    /**
     * 跳转到添加页面
     *
     * @param model model
     * @return 模板路径admin/dictionary/form
     */
    @GetMapping(value = "/toAdd")
    public String toAdd(Model model) {
        model.addAttribute("title", "添加");
        return "admin/dictionary/form";
    }

    /**
     * 跳转到修改页面
     *
     * @param model model
     * @param id id
     * @return 模板路径admin/dictionary/form
     */
    @GetMapping(value = "/toEdit")
    public String toEdit(Model model,
                         @RequestParam(value = "id") Long id){
        DataDictionary dataDictionary = dataDictionaryService.getById(id);
        if(null!=dataDictionary){
            model.addAttribute("dataDictionary",dataDictionary);
        }
        model.addAttribute("title", "修改");
        return "admin/dictionary/form";
    }

    /**
     * 保存
     *
     * @param dataDictionary dataDictionary
     * @return JsonResult
     */
    @PostMapping(value = "/save")
    @ResponseBody
    public JsonResult add(@ModelAttribute DataDictionary dataDictionary) {
        try {
            dataDictionaryService.add(dataDictionary);
        } catch (Exception e) {
            e.printStackTrace();
            return new JsonResult(0, "保存失败");
        }
        return new JsonResult(1, "保存成功");
    }
}
