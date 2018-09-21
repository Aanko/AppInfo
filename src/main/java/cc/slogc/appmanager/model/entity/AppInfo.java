package cc.slogc.appmanager.model.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

/**
 * @author Aanko on 2018/9/21.
 * @version 1.0
 */
public class AppInfo implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 主键，@Id注解标志它为主键，@GeneratedValue注解让它自增长
     */
    @Id
    @GeneratedValue

    private Long id;

    /**
     * 软件名称
     */
    private String softwareName;

    /**
     * Apk名称
     */

    private String APKName;

    /**
     * 支持的ROM
     */

    private String supportROM;

    /**
     * 软件界面语言
     */

    private String interfaceLanguage;

    /**
     * 软件的大小
     */

    private Double softwareSize;

    /**
     * 更新日期
     */

    private Date updateDate;

    /**
     * 开发者Id
     */

    private Integer devId;

    /**
     * 应用简介
     */

    private String appInfo;

    /**
     * 应用状态(来源于：data_dictionary，1 待审核 2 审核通过 3 审核不通过 4 已上架 5 已下架)
     */

    private Integer status;

    /**
     * 上架时间
     */

    private Date onSaleDate;

    /**
     * 下架时间
     */

    private Date offSaleDate;

    /**
     * 所属平台(来源于：data_dictionary，1 手机 2 平板 3 通用)
     */

    private Integer flatformId;

    /**
     * 所属三级分类
     */

    private Integer categoryLevel3;

    /**
     * 下载量
     */

    private Integer downloads;

    /**
     * 创建者（后台管理员和其它角色创建的开发者）
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
     * 所属一级分类
     */

    private Integer categoryLevel1;

    /**
     * 所属二级分类
     */

    private Integer categoryLevel2;

    /**
     * logo 图片url路径
     */

    private String logoPicPath;

    /**
     * logo 图片的服务器路径
     */

    private String logoLocPath;

    /**
     * 最近软件的版本iD
     */

    private Integer versionId;

}
