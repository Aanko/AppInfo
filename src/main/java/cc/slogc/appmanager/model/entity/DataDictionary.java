package cc.slogc.appmanager.model.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

/**
 * @author Aanko on 2018/9/21.
 * @version 1.0
 */
public class DataDictionary  implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 主键，@Id注解标志它为主键，@GeneratedValue注解让它自增长
     */
    @Id
    @GeneratedValue

    private Long id;

    /**
     *类型编码
     */
    private Integer typeCode;

    /**
     *类型名称
     */
    private String typeName;

    /**
     *  类型值ID
     */

    private Integer valueId;


    /**
     *  类型值Name
     */

    private Integer valueName;

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
