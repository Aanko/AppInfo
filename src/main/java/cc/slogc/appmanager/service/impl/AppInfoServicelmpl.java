package cc.slogc.appmanager.service.impl;

import cc.slogc.appmanager.model.entity.AppInfo;
import cc.slogc.appmanager.model.entity.DataDictionary;
import cc.slogc.appmanager.repository.AppInfoRepository;
import cc.slogc.appmanager.service.AppInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @author Aanko on 2018/9/21.
 * @version 1.0
 */

@Service
public class AppInfoServicelmpl extends AppInfoService {

    @Autowired
    private AppInfoRepository appInfoRepository;

    /**
     * 添加app信息
     *
     * @param appInfo appInfo
     */
    @Override
    public void add(AppInfo appInfo) {
        //添加时设置创建时间和更新时间为当前时间
        appInfo.setCreationDate(new Date());
        appInfo.setModifyDate(new Date());
        appInfoRepository.save(appInfo);
    }

    /**
     * 列出所有app 信息
     *
     * @return List
     */
    @Override
    public List<AppInfo> listAll() {
        return appInfoRepository.findAll();
    }

    /**
     * 列出所有app信息 分页
     *
     * @param pageable 分页信息
     * @return Page
     */
    @Override
    public Page<AppInfo> listPage(Pageable pageable) {
        return appInfoRepository.findAll(pageable);
    }

    /**
     * 根据id查询app信息
     *
     * @param id id
     * @return DataDictionary
     */
    @Override
    public AppInfo getById(Long id) {
        return appInfoRepository.getOne(id);
    }

    /**
     * 删除App信息
     *
     * @param appInfo appInfo
     */
    @Override
    public void delete(AppInfo appInfo) {
        appInfoRepository.delete(appInfo);
    }

}
