package cc.slogc.appmanager.model.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

/**
 * @author Aanko on 2018/9/20.
 * @version 1.0
 */
@Entity
public class DevUser implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @Id
    @GeneratedValue
    private Long id;

    /**
     * 开发者账号
     */
    private String devCode;

    /**
     * 开发者名称
     */
    private String devName;

    /**
     * 开发者密码
     */
    private String devPassword;

    /**
     * 开发者邮箱
     */
    private String devEmail;

    /**
     * 开发者简介
     */
    private String devInfo;

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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDevCode() {
        return devCode;
    }

    public void setDevCode(String devCode) {
        this.devCode = devCode;
    }

    public String getDevName() {
        return devName;
    }

    public void setDevName(String devName) {
        this.devName = devName;
    }

    public String getDevPassword() {
        return devPassword;
    }

    public void setDevPassword(String devPassword) {
        this.devPassword = devPassword;
    }

    public String getDevEmail() {
        return devEmail;
    }

    public void setDevEmail(String devEmail) {
        this.devEmail = devEmail;
    }

    public String getDevInfo() {
        return devInfo;
    }

    public void setDevInfo(String devInfo) {
        this.devInfo = devInfo;
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

    @Override
    public String toString() {
        return "DevUser{" +
                "id=" + id +
                ", devCode='" + devCode + '\'' +
                ", devName='" + devName + '\'' +
                ", devPassword='" + devPassword + '\'' +
                ", devEmail='" + devEmail + '\'' +
                ", devInfo='" + devInfo + '\'' +
                ", createdBy=" + createdBy +
                ", creationDate=" + creationDate +
                ", modifyBy=" + modifyBy +
                ", modifyDate=" + modifyDate +
                '}';
    }
}
