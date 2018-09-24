package cc.slogc.appmanager.model.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

/**
 * @author Aanko on 2018/9/21.
 * @version 1.0
 */
@Entity
public class AppInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
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
    private String apkName;

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
    private String appInduction;

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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSoftwareName() {
        return softwareName;
    }

    public void setSoftwareName(String softwareName) {
        this.softwareName = softwareName;
    }

    public String getApkName() {
        return apkName;
    }

    public void setApkName(String apkName) {
        this.apkName = apkName;
    }

    public String getSupportROM() {
        return supportROM;
    }

    public void setSupportROM(String supportROM) {
        this.supportROM = supportROM;
    }

    public String getInterfaceLanguage() {
        return interfaceLanguage;
    }

    public void setInterfaceLanguage(String interfaceLanguage) {
        this.interfaceLanguage = interfaceLanguage;
    }

    public Double getSoftwareSize() {
        return softwareSize;
    }

    public void setSoftwareSize(Double softwareSize) {
        this.softwareSize = softwareSize;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public Integer getDevId() {
        return devId;
    }

    public void setDevId(Integer devId) {
        this.devId = devId;
    }

    public String getAppInduction() {
        return appInduction;
    }

    public void setAppInduction(String appInduction) {
        this.appInduction = appInduction;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getOnSaleDate() {
        return onSaleDate;
    }

    public void setOnSaleDate(Date onSaleDate) {
        this.onSaleDate = onSaleDate;
    }

    public Date getOffSaleDate() {
        return offSaleDate;
    }

    public void setOffSaleDate(Date offSaleDate) {
        this.offSaleDate = offSaleDate;
    }

    public Integer getFlatformId() {
        return flatformId;
    }

    public void setFlatformId(Integer flatformId) {
        this.flatformId = flatformId;
    }

    public Integer getCategoryLevel3() {
        return categoryLevel3;
    }

    public void setCategoryLevel3(Integer categoryLevel3) {
        this.categoryLevel3 = categoryLevel3;
    }

    public Integer getDownloads() {
        return downloads;
    }

    public void setDownloads(Integer downloads) {
        this.downloads = downloads;
    }

    public Integer getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Integer createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Integer getModifyBy() {
        return modifyBy;
    }

    public void setModifyBy(Integer modifyBy) {
        this.modifyBy = modifyBy;
    }

    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    public Integer getCategoryLevel1() {
        return categoryLevel1;
    }

    public void setCategoryLevel1(Integer categoryLevel1) {
        this.categoryLevel1 = categoryLevel1;
    }

    public Integer getCategoryLevel2() {
        return categoryLevel2;
    }

    public void setCategoryLevel2(Integer categoryLevel2) {
        this.categoryLevel2 = categoryLevel2;
    }

    public String getLogoPicPath() {
        return logoPicPath;
    }

    public void setLogoPicPath(String logoPicPath) {
        this.logoPicPath = logoPicPath;
    }

    public String getLogoLocPath() {
        return logoLocPath;
    }

    public void setLogoLocPath(String logoLocPath) {
        this.logoLocPath = logoLocPath;
    }

    public Integer getVersionId() {
        return versionId;
    }

    public void setVersionId(Integer versionId) {
        this.versionId = versionId;
    }

    @Override
    public String toString() {
        return "AppInfo{" +
                "id=" + id +
                ", softwareName='" + softwareName + '\'' +
                ", apkName='" + apkName + '\'' +
                ", supportROM='" + supportROM + '\'' +
                ", interfaceLanguage='" + interfaceLanguage + '\'' +
                ", softwareSize=" + softwareSize +
                ", updateDate=" + updateDate +
                ", devId=" + devId +
                ", appInduction='" + appInduction + '\'' +
                ", status=" + status +
                ", onSaleDate=" + onSaleDate +
                ", offSaleDate=" + offSaleDate +
                ", flatformId=" + flatformId +
                ", categoryLevel3=" + categoryLevel3 +
                ", downloads=" + downloads +
                ", createdBy=" + createdBy +
                ", creationDate=" + creationDate +
                ", modifyBy=" + modifyBy +
                ", modifyDate=" + modifyDate +
                ", categoryLevel1=" + categoryLevel1 +
                ", categoryLevel2=" + categoryLevel2 +
                ", logoPicPath='" + logoPicPath + '\'' +
                ", logoLocPath='" + logoLocPath + '\'' +
                ", versionId=" + versionId +
                '}';
    }
}
