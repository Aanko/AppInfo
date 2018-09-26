package cc.slogc.appmanager.service.impl;

import cc.slogc.appmanager.model.entity.SysUser;
import cc.slogc.appmanager.repository.SysUserRepository;
import cc.slogc.appmanager.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * 业务实现
 * @author Aanko on 2018/9/25.
 * @version 1.0
 */
@Service
public class SysUserServiceImpl extends SysUserService {

    @Autowired
    private SysUserRepository sysUserRepository;

    /**
     * 列出所有管理员信息
     */
   @Override
    public List<SysUser> listAll(){ return sysUserRepository .findAll();}

    /**
     * 列出所有管理员用户 分页
     *
     * @param pageable 分页信息
     * @return Page
     */
    @Override
    public Page<SysUser> listPage(Pageable pageable) {
        return sysUserRepository.findAll(pageable);
    }

    /**
     * 根据id查询管理员用户
     *
     * @param id id
     * @return DataDictionary
     */
    @Override
    public SysUser getById(Long id) {
        return sysUserRepository.getOne(id);
    }


    /**
     * 添加管理员
     *
     * @param sysUser sysUser
     */
    @Override
    public void add(SysUser sysUser) {
        //添加时设置创建时间和更新时间为当前时间
        sysUser.setCreationDate(new Date());
        sysUser.setModifyDate(new Date());
        sysUserRepository.save(sysUser);
    }

    /**
     * 删除管理员
     *
     * @param sysUser sysUser
     */
    @Override
    public void delete(SysUser sysUser) {
        sysUserRepository.delete(sysUser);
    }

    /**
     * 修改管理员
     *
     * @param sysUser sysUser
     */
    @Override
    public void update(SysUser sysUser) {
        //修改时修改更新时间
        sysUser.setModifyDate(new Date());
        sysUserRepository.save(sysUser);
    }


}
