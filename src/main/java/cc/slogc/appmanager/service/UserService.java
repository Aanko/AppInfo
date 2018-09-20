package cc.slogc.appmanager.service;

import cc.slogc.appmanager.model.entity.User;

import java.util.List;

/**
 * 业务层接口，该类只负责提供接口，规定方法名，方法参数，返回值类型，不做具体实现
 *
 * @author : RYAN0UP
 * @date : 2018/9/20
 */
public interface UserService {

    /**
     * 查询所有用户
     *
     * @return List
     */
    List<User> findAll();

    /**
     * 删除用户
     *
     * @param user user
     */
    void delete(User user);

    /**
     * 根据编号查询用户
     *
     * @param id id
     * @return User
     */
    User getById(Long id);

    /**
     * 添加用户
     *
     * @param user user
     */
    void add(User user);

    /**
     * 根据姓名查询用户
     *
     * @param name 用户姓名
     * @return List
     */
    List<User> getByName(String name);
}
