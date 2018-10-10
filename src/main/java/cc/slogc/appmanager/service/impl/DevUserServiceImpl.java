package cc.slogc.appmanager.service.impl;

import cc.slogc.appmanager.model.entity.DevUser;
import cc.slogc.appmanager.repository.DevUserRepository;
import cc.slogc.appmanager.service.DevUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 *
 * @author Aanko on 2018/9/24.
 * @version 1.0
 */
@Service
public class DevUserServiceImpl extends DevUserService {

    @Autowired
    private DevUserRepository devUserRepository;

    /**
     * 列出所有开发者用户
     *
     * @return List
     */
    @Override
    public List<DevUser> listAll() {
        return devUserRepository.findAll();
    }

    /**
     * 列出所有开发者用户 分页
     *
     * @param pageable 分页信息
     * @return Page
     */
    @Override
    public Page<DevUser> listPage(Pageable pageable) {
        return devUserRepository.findAll(pageable);
    }

    /**
     * 根据id查询开发者用户
     *
     * @param id id
     * @return DevUser
     */
    @Override
    public DevUser getById(Long id) {
        return devUserRepository.getOne(id);
    }


    /**
     * 添加开发者
     *
     * @param devUser devUser
     */
    @Override
    public void add(DevUser devUser) {
        //添加时设置创建时间和更新时间为当前时间
        devUser.setCreationDate(new Date());
        devUser.setModifyDate(new Date());
        devUserRepository.save(devUser);
    }

    /**
     * 删除开发者
     *
     * @param devUser devUser
     */
    @Override
    public void delete(DevUser devUser) {
        devUserRepository.delete(devUser);
    }

    /**
     * 修改开发者
     *
     * @param devUser devUser
     */
    @Override
    public void update(DevUser devUser) {
        //修改时修改更新时间
        devUser.setModifyDate(new Date());
        devUserRepository.save(devUser);
    }

    /**
     * 登录验证
     * @param devUser
     * @return
     */
    public DevUser verifyLogin(DevUser devUser){

        List<DevUser> userList = devUserRepository.findDevUserByDevCodeAndDevPassword(devUser.getDevCode(), devUser.getDevPassword());
        if (userList != null && userList.size() > 0) {
            return userList.get(0);
        }
        else {
            return null;
        }
    }



}
