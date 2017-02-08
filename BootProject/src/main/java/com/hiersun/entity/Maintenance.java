package com.hiersun.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;

public class Maintenance {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY) private Long id;

	@Column(name = "maintenance_id") private String maintenanceId;

	@Column(name = "category_id") private Integer categoryId;

	@Column(name = "category_name") private String categoryName;

	@Column(name = "type_id") private Integer typeId;

	@Column(name = "type_name") private String typeName;

	/**
	 * 紧急度 0 ：至急 1：高 2 ：中 3 ：低 4 ：最低
	 */
	private Byte emergency;

	private String issue;

	/**
	 * 区域 总部/终端
	 */
	private Integer area;

	@Column(name = "deparment_id") private Integer deparmentId;

	@Column(name = "department_name") private String departmentName;

	@Column(name = "employee_id") private Integer employeeId;

	@Column(name = "employee_name") private String employeeName;

	private String mobile;

	private String tel;

	private String email;

	@Column(name = "create_time") @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") private Date createTime;

	private Integer dealtime;

	/**
	 * 处理状态 0：未处理 1：已分配 2：处理中 3：审核中 4：已完成
	 */
	private Integer state;

	@Column(name = "creater_id") private Integer createrId;

	@Column(name = "creater_name") private String createrName;

	@Column(name = "update_time") private Date updateTime;

	/**
	 * 删除状态 0：正常 1：删除
	 */
	private Byte flag;

	/**
	 * @return id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return maintenance_id
	 */
	public String getMaintenanceId() {
		return maintenanceId;
	}

	/**
	 * @param maintenanceId
	 */
	public void setMaintenanceId(String maintenanceId) {
		this.maintenanceId = maintenanceId;
	}

	/**
	 * @return category_id
	 */
	public Integer getCategoryId() {
		return categoryId;
	}

	/**
	 * @param categoryId
	 */
	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	/**
	 * @return category_name
	 */
	public String getCategoryName() {
		return categoryName;
	}

	/**
	 * @param categoryName
	 */
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	/**
	 * @return type_id
	 */
	public Integer getTypeId() {
		return typeId;
	}

	/**
	 * @param typeId
	 */
	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
	}

	/**
	 * @return type_name
	 */
	public String getTypeName() {
		return typeName;
	}

	/**
	 * @param typeName
	 */
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	/**
	 * 获取紧急度 0 ：至急 1：高 2 ：中 3 ：低 4 ：最低
	 *
	 * @return emergency - 紧急度 0 ：至急 1：高 2 ：中 3 ：低 4 ：最低
	 */
	public Byte getEmergency() {
		return emergency;
	}

	/**
	 * 设置紧急度 0 ：至急 1：高 2 ：中 3 ：低 4 ：最低
	 *
	 * @param emergency
	 *            紧急度 0 ：至急 1：高 2 ：中 3 ：低 4 ：最低
	 */
	public void setEmergency(Byte emergency) {
		this.emergency = emergency;
	}

	/**
	 * @return issue
	 */
	public String getIssue() {
		return issue;
	}

	/**
	 * @param issue
	 */
	public void setIssue(String issue) {
		this.issue = issue;
	}

	/**
	 * 获取区域 总部/终端
	 *
	 * @return area - 区域 总部/终端
	 */
	public Integer getArea() {
		return area;
	}

	/**
	 * 设置区域 总部/终端
	 *
	 * @param area
	 *            区域 总部/终端
	 */
	public void setArea(Integer area) {
		this.area = area;
	}

	/**
	 * @return deparment_id
	 */
	public Integer getDeparmentId() {
		return deparmentId;
	}

	/**
	 * @param deparmentId
	 */
	public void setDeparmentId(Integer deparmentId) {
		this.deparmentId = deparmentId;
	}

	/**
	 * @return department_name
	 */
	public String getDepartmentName() {
		return departmentName;
	}

	/**
	 * @param departmentName
	 */
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	/**
	 * @return employee_id
	 */
	public Integer getEmployeeId() {
		return employeeId;
	}

	/**
	 * @param employeeId
	 */
	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	/**
	 * @return employee_name
	 */
	public String getEmployeeName() {
		return employeeName;
	}

	/**
	 * @param employeeName
	 */
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	/**
	 * @return mobile
	 */
	public String getMobile() {
		return mobile;
	}

	/**
	 * @param mobile
	 */
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	/**
	 * @return tel
	 */
	public String getTel() {
		return tel;
	}

	/**
	 * @param tel
	 */
	public void setTel(String tel) {
		this.tel = tel;
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
	 * @return create_time
	 */
	public Date getCreateTime() {
		return createTime;
	}

	/**
	 * @param createTime
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	/**
	 * @return dealtime
	 */
	public Integer getDealtime() {
		return dealtime;
	}

	/**
	 * @param dealtime
	 */
	public void setDealtime(Integer dealtime) {
		this.dealtime = dealtime;
	}

	/**
	 * 获取处理状态 0：未处理 1：已分配 2：处理中 3：审核中 4：已完成
	 *
	 * @return state - 处理状态 0：未处理 1：已分配 2：处理中 3：审核中 4：已完成
	 */
	public Integer getState() {
		return state;
	}

	/**
	 * 设置处理状态 0：未处理 1：已分配 2：处理中 3：审核中 4：已完成
	 *
	 * @param state
	 *            处理状态 0：未处理 1：已分配 2：处理中 3：审核中 4：已完成
	 */
	public void setState(Integer state) {
		this.state = state;
	}

	/**
	 * @return creater_id
	 */
	public Integer getCreaterId() {
		return createrId;
	}

	/**
	 * @param createrId
	 */
	public void setCreaterId(Integer createrId) {
		this.createrId = createrId;
	}

	/**
	 * @return creater_name
	 */
	public String getCreaterName() {
		return createrName;
	}

	/**
	 * @param createrName
	 */
	public void setCreaterName(String createrName) {
		this.createrName = createrName;
	}

	/**
	 * @return update_time
	 */
	public Date getUpdateTime() {
		return updateTime;
	}

	/**
	 * @param updateTime
	 */
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	/**
	 * 获取删除状态 0：正常 1：删除
	 *
	 * @return flag - 删除状态 0：正常 1：删除
	 */
	public Byte getFlag() {
		return flag;
	}

	/**
	 * 设置删除状态 0：正常 1：删除
	 *
	 * @param flag
	 *            删除状态 0：正常 1：删除
	 */
	public void setFlag(Byte flag) {
		this.flag = flag;
	}

	private Integer dealId;
	private String dealName;
	private Date allocateTime;

	public Integer getDealId() {
		return dealId;
	}

	public void setDealId(Integer dealId) {
		this.dealId = dealId;
	}

	public String getDealName() {
		return dealName;
	}

	public void setDealName(String dealName) {
		this.dealName = dealName;
	}

	public Date getAllocateTime() {
		return allocateTime;
	}

	public void setAllocateTime(Date allocateTime) {
		this.allocateTime = allocateTime;
	}

}