package cc.slogc.appmanager.model.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

/**
 * @author Aanko on 2018/9/20.
 * @version 1.0
 */
public class SysUser implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 主键，@Id注解标志它为主键，@GeneratedValue注解让它自增长
     */
    @Id
    @GeneratedValue
    private Long id;

    /**
     *系统用户编号(登录账号)
     */
    private String userCode;

    /**
     * 管理员名称
     */
    private  String userName;

    /**
     * 管理员类型（来源于数据字典表，分为：超管、财务、市场、运营、销售）
     */

    private  Integer userType;

    /**
     *创建者（所有后台的管理员类型都由超管创建）
     */
    private Integer createdBy;

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

    /**
     * 管理员密码
     */
    private  String userPassword;
}
