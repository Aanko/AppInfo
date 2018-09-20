package cc.slogc.appmanager.service.impl;

import cc.slogc.appmanager.model.entity.User;
import cc.slogc.appmanager.repository.UserRepository;
import cc.slogc.appmanager.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 该类继承UserService接口，并且必须实现UserService接口中的方法
 *
 * @author : RYAN0UP
 * @date : 2018/9/20
 */
@Service
public class UserServiceImpl implements UserService {

    /**
     * 自动注入持久层对象，不需要实例化
     */
    @Autowired
    private UserRepository userRepository;

    /**
     * 查询所有用户
     *
     * @return List
     */
    @Override
    public List<User> findAll() {
        //其中findAll为持久层中默认提供的接口，直接调用即可
        return userRepository.findAll();
    }

    /**
     * 删除用户
     *
     * @param user user
     */
    @Override
    public void delete(User user) {
        //delete也是持久层中提供的
        userRepository.delete(user);
    }

    /**
     * 根据编号查询用户
     *
     * @param id id
     * @return User
     */
    @Override
    public User getById(Long id) {
        //getOne也为持久层提供的方法，用于根据编号查询单个用户
        return userRepository.getOne(id);
    }

    /**
     * 添加用户
     *
     * @param user user
     */
    @Override
    public void add(User user) {
        //同上
        userRepository.save(user);
    }

    /**
     * 根据姓名查询用户
     *
     * @param name 用户姓名
     * @return List
     */
    @Override
    public List<User> getByName(String name) {
        return userRepository.findUsersByName(name);
    }
}
