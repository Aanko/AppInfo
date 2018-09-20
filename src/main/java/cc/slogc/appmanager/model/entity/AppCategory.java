package cc.slogc.appmanager.model.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

/**
 * @author Aanko on 2018/9/20.
 * @version 1.0
 */
public class AppCategory implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 主键，@Id注解标志它为主键，@GeneratedValue注解让它自增长
     */
    @Id
    @GeneratedValue

    private Long id;

    /**
     *分类编码
     */

    private String categoryCode;

    /**
     * 分类名称
     */

    private String categoryName;

    /**
     * 父节点Id
     */

    private Integer parentId;

    /**
     * 创建者（后台管理员和其它角色创建的开发者）
     */

    private  Integer createdBy;
    /**
     * 创建时间
     */

    private Date creationDate;

    /**
     * 更新者
     */
    private Integer modifyBy;

    /**
     * 最近更新时间
     */
    private Date modifyDate;

}
