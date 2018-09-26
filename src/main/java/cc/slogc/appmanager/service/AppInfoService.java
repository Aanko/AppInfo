package cc.slogc.appmanager.service;

import cc.slogc.appmanager.model.entity.AppInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * @author Aanko on 2018/9/21.
 * @version 1.0
 */
public abstract class AppInfoService {

    /**
     * 列出所有App信息
     *
     * @return List
     */
    public abstract List<AppInfo> listAll();

    /**
     * 列出所有App信息 分页
     *
     * @param pageable 分页信息
     * @return Page
     */
    public abstract Page<AppInfo> listPage(Pageable pageable);

    /**
     * 根据id查App信息
     *
     * @param id id
     * @return AppInfo
     */
    public abstract AppInfo getById(Long id);


    /**
     * 添加App
     *
     * @param appInfo appInfo
     */
    public abstract void add(AppInfo appInfo);

    /**
     *
     * 删除App信息
     *
     * @param appInfo
     */
    public abstract void delete(AppInfo appInfo);
}
