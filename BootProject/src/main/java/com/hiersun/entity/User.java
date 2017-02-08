package com.hiersun.entity;

import java.util.Date;
import javax.persistence.*;

public class User {
    /**
     * 编号
     */
    @Id
    @Column(name = "user_id")
    private Integer userId;

    /**
     * 用户名
     */
    @Column(name = "user_name")
    private String userName;

    /**
     * 密码
     */
    private String password;

    /**
     * 姓名
     */
    @Column(name = "real_name")
    private String realName;

    /**
     * 部门编号
     */
    @Column(name = "department_id")
    private String departmentId;

    /**
     * 职位编号
     */
    @Column(name = "position_id")
    private String positionId;

    /**
     * 标识：1：在职 0：离职
     */
    private Boolean flag;

    /**
     * 电话
     */
    private String tel;

    /**
     * 性别
     */
    private Boolean gender;

    /**
     * 身份证号
     */
    @Column(name = "identity_card_num")
    private String identityCardNum;

    /**
     * 入职日期
     */
    @Column(name = "join_date")
    private Date joinDate;

    /**
     * 离职时间
     */
    @Column(name = "leave_date")
    private Date leaveDate;

    /**
     * 工号
     */
    @Column(name = "work_number")
    private String workNumber;

    /**
     * 头像
     */
    @Column(name = "image_url")
    private String imageUrl;

    private String email;

    /**
     * 录入日期
     */
    @Column(name = "input_date")
    private Date inputDate;

    /**
     * 获取编号
     *
     * @return user_id - 编号
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 设置编号
     *
     * @param userId 编号
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 获取用户名
     *
     * @return user_name - 用户名
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置用户名
     *
     * @param userName 用户名
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 获取密码
     *
     * @return password - 密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置密码
     *
     * @param password 密码
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取姓名
     *
     * @return real_name - 姓名
     */
    public String getRealName() {
        return realName;
    }

    /**
     * 设置姓名
     *
     * @param realName 姓名
     */
    public void setRealName(String realName) {
        this.realName = realName;
    }

    /**
     * 获取部门编号
     *
     * @return department_id - 部门编号
     */
    public String getDepartmentId() {
        return departmentId;
    }

    /**
     * 设置部门编号
     *
     * @param departmentId 部门编号
     */
    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    /**
     * 获取职位编号
     *
     * @return position_id - 职位编号
     */
    public String getPositionId() {
        return positionId;
    }

    /**
     * 设置职位编号
     *
     * @param positionId 职位编号
     */
    public void setPositionId(String positionId) {
        this.positionId = positionId;
    }

    /**
     * 获取标识：1：在职 0：离职
     *
     * @return flag - 标识：1：在职 0：离职
     */
    public Boolean getFlag() {
        return flag;
    }

    /**
     * 设置标识：1：在职 0：离职
     *
     * @param flag 标识：1：在职 0：离职
     */
    public void setFlag(Boolean flag) {
        this.flag = flag;
    }

    /**
     * 获取电话
     *
     * @return tel - 电话
     */
    public String getTel() {
        return tel;
    }

    /**
     * 设置电话
     *
     * @param tel 电话
     */
    public void setTel(String tel) {
        this.tel = tel;
    }

    /**
     * 获取性别
     *
     * @return gender - 性别
     */
    public Boolean getGender() {
        return gender;
    }

    /**
     * 设置性别
     *
     * @param gender 性别
     */
    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    /**
     * 获取身份证号
     *
     * @return identity_card_num - 身份证号
     */
    public String getIdentityCardNum() {
        return identityCardNum;
    }

    /**
     * 设置身份证号
     *
     * @param identityCardNum 身份证号
     */
    public void setIdentityCardNum(String identityCardNum) {
        this.identityCardNum = identityCardNum;
    }

    /**
     * 获取入职日期
     *
     * @return join_date - 入职日期
     */
    public Date getJoinDate() {
        return joinDate;
    }

    /**
     * 设置入职日期
     *
     * @param joinDate 入职日期
     */
    public void setJoinDate(Date joinDate) {
        this.joinDate = joinDate;
    }

    /**
     * 获取离职时间
     *
     * @return leave_date - 离职时间
     */
    public Date getLeaveDate() {
        return leaveDate;
    }

    /**
     * 设置离职时间
     *
     * @param leaveDate 离职时间
     */
    public void setLeaveDate(Date leaveDate) {
        this.leaveDate = leaveDate;
    }

    /**
     * 获取工号
     *
     * @return work_number - 工号
     */
    public String getWorkNumber() {
        return workNumber;
    }

    /**
     * 设置工号
     *
     * @param workNumber 工号
     */
    public void setWorkNumber(String workNumber) {
        this.workNumber = workNumber;
    }

    /**
     * 获取头像
     *
     * @return image_url - 头像
     */
    public String getImageUrl() {
        return imageUrl;
    }

    /**
     * 设置头像
     *
     * @param imageUrl 头像
     */
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    /**
     * @return email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 获取录入日期
     *
     * @return input_date - 录入日期
     */
    public Date getInputDate() {
        return inputDate;
    }

    /**
     * 设置录入日期
     *
     * @param inputDate 录入日期
     */
    public void setInputDate(Date inputDate) {
        this.inputDate = inputDate;
    }
}