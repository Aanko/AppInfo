package cc.slogc.appmanager.service;

import cc.slogc.appmanager.model.entity.DevUser;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * @author Aanko on 2018/9/24.
 * @version 1.0
 */
public abstract class DevUserService {

    /**
     * 显示所有开发者用户
     * @return List
     */
    public abstract List<DevUser> listAll();

    /**
     * 列出所有开发者用户 分页
     *
     * @param pageable 分页信息
     * @return Page
     */
    public abstract Page<DevUser> listPage(Pageable pageable);

    /**
     * 根据id查询开发者用户
     *
     * @param id id
     * @return DevUser
     */
    public abstract DevUser getById(Long id);

    /**
     * 添加开发者用户
     * @param devUser
     */

    public abstract void add(DevUser devUser);

    /**
     * 删除开发者用户
     * @param devUser
     */
    public abstract void delete(DevUser devUser);

    /**
     * 修改开发者用户
     * @param devUser
     */
    public abstract void update(DevUser devUser);


    public abstract DevUser verifyLogin(DevUser devUser);
}
