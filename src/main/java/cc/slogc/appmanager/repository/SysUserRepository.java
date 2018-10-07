package cc.slogc.appmanager.repository;

import cc.slogc.appmanager.model.entity.SysUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * 持久层 用于操作数据库
 * @author Aanko on 2018/9/25.
 * @version 1.0
 */
public interface SysUserRepository extends JpaRepository<SysUser , Long> {

    public List<SysUser> findSysUsersByUserCodeAndUserPassword(String userCode, String userPassword);
}
