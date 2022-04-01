package com.boot.system.entity;

import com.boot.common.core.domain.BaseEntity;
//import com.logistics.common.annotation.Excel;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.util.Date;

/**
 * 人员信息对象 cwwl_user
 *
 * @author logistics
 * @date 2019-09-04
 */
public class CwwlUser extends BaseEntity {
    private static final long serialVersionUID = 1L;

    /**
     * 用户主键id
     */
    private Long userId;

    /**
     * 登陆用户手机号
     */
//    @Excel(name = "登陆用户手机号")
    private String userPhone;

    /**
     * 人员姓名
     */
//    @Excel(name = "人员姓名")
    private String userName;

    /**
     * 密码
     */
//    @Excel(name = "密码")
    private String password;

    /**
     * 用户类型
     */
//    @Excel(name = "用户类型")
    private Integer userType;

    /**
     * 状态
     */
//    @Excel(name = "状态")
    private Integer status;

    /**
     * 所属公司id
     */
//    @Excel(name = "所属公司id")
    private Long companyId;

    /**
     * 创建时间
     */
//    @Excel(name = "创建时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date createDate;

    /**
     * 头像途径
     */
//    @Excel(name = "头像途径")
    private String avatar;

    /**
     * 加盐码
     */
//    @Excel(name = "加盐码")
    private String salt;

    /**
     * 最后登录时间
     */
//    @Excel(name = "最后登录时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date loginDate;

    /**
     * token
     */
//    @Excel(name = "token")
    private String token;

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    public Integer getUserType() {
        return userType;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getStatus() {
        return status;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getSalt() {
        return salt;
    }

    public void setLoginDate(Date loginDate) {
        this.loginDate = loginDate;
    }

    public Date getLoginDate() {
        return loginDate;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getToken() {
        return token;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("userId", getUserId())
                .append("userPhone", getUserPhone())
                .append("userName", getUserName())
                .append("password", getPassword())
                .append("userType", getUserType())
                .append("status", getStatus())
                .append("companyId", getCompanyId())
                .append("createDate", getCreateDate())
                .append("avatar", getAvatar())
                .append("salt", getSalt())
                .append("loginDate", getLoginDate())
                .append("createBy", getCreateBy())
                .append("createTime", getCreateTime())
                .append("updateBy", getUpdateBy())
                .append("updateTime", getUpdateTime())
                .append("remark", getRemark())
                .append("token", getToken())
                .toString();
    }
}
