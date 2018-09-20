package cc.slogc.appmanager.model.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * 加上@Entity注解，让SpringBoot启动时自动扫描该实体类，并创建好表结构
 *
 * @author : RYAN0UP
 * @date : 2018/9/20
 */
@Entity
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键，@Id注解标志它为主键，@GeneratedValue注解让它自增长
     */
    @Id
    @GeneratedValue
    private Long id;

    /**
     * 姓名
     */
    private String name;

    /**
     * 性别
     */
    private String sex;
}
