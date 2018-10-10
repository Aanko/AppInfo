package cc.slogc.appmanager.repository;

import cc.slogc.appmanager.model.entity.DevUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * 开发者用户持久层  用于操作数据库
 *
 * @author Aanko on 2018/9/24.
 * @version 1.0
 */
public interface DevUserRepository extends JpaRepository<DevUser, Long> {


    public List<DevUser> findDevUserByDevCodeAndDevPassword(String devCode, String devPassword);
}
