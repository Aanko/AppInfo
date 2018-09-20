package cc.slogc.appmanager.repository;

import cc.slogc.appmanager.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * User实体的持久层，用户操作数据库，其中包含默认的查询方法，不需要重写，如：findAll() ,查询所有
 *
 * @author : RYAN0UP
 * @date : 2018/9/20
 */
public interface UserRepository extends JpaRepository<User,Long> {

    //可以自定义查询，但是必须遵循JPA的命名规范，JPA是通过方法名来生成sql查询的，如下：根据姓名查询用户，然后就可以在Service中调用了

    /**
     * 根据用户姓名查询用户
     *
     * @param name 参数：用户姓名
     * @return List
     */
    List<User> findUsersByName(String name);
}
