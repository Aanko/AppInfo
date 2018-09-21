package cc.slogc.appmanager.model.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

/**
 * @author Aanko on 2018/9/21.
 * @version 1.0
 */
public class AppVersion implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 主键，@Id注解标志它为主键，@GeneratedValue注解让它自增长
     */
    @Id
    @GeneratedValue

    private Long id;

    /**
     *来源于：app_info表的主键id
     */

    private Integer appId;

    /**
     * 版本号
     */
    private String versionNo;

    /**
     * 版本介绍
     */

    private String versionInfo;

    /**
     * 发布状态（来源于：data_dictionary，1 不发布 2 已发布 3 预发布）
     */

    private Integer publishStatus;

    /**
     * 下载链接
     */

    private String downloadLink;

    /**
     * 版本大小
     */

    private Double versionSize;


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
     * apk服务器存储路径
     */

    private String apkLocPath;

    /**
     * 上传的APK 文件名称
     */

    private String apkFileName;

}
