package cc.slogc.appmanager.service;

import cc.slogc.appmanager.model.entity.SysUser;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * @author Aanko on 2018/9/25.
 * @version 1.0
 */
public abstract class SysUserService {


    /**
     * 显示所有管理员用户
     * @return List
     */
    public abstract List<SysUser> listAll();

    /**
     * 列出所有开发者用户 分页
     *
     * @param pageable 分页信息
     * @return Page
     */
    public abstract Page<SysUser> listPage(Pageable pageable);

    /**
     * 根据id查询开发者用户
     *
     * @param id id
     * @return SysUser
     */
    public abstract SysUser getById(Long id);

    /**
     * 添加开发者用户
     * @param sysUser
     */

    public abstract void add(SysUser sysUser);

    /**
     * 删除开发者用户
     * @param sysUser
     */
    public abstract void delete(SysUser sysUser);

    /**
     * 修改开发者用户
     * @param sysUser
     */
    public abstract void update(SysUser sysUser);
}
