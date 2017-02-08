package com.hiersun.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Transient;

public class Department {

	@Transient private String fullName = null;

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	/**
	 * 部门编号
	 */
	@Id @Column(name = "department_id") private Integer departmentId;

	/**
	 * 部门名称
	 */
	@Column(name = "department_name") private String departmentName;

	/**
	 * 父级编号
	 */
	@Column(name = "parent_department_id") private Integer parentDepartmentId;

	/**
	 * 管理者编号
	 */
	@Column(name = "manager_id") private Integer managerId;

	/**
	 * 地址
	 */
	private String address;

	/**
	 * 邮编
	 */
	private String postcode;

	/**
	 * Email
	 */
	private String email;

	/**
	 * 状态 0：正常 1：删除
	 */
	private Byte flag;

	/**
	 * 描述
	 */
	private String description;

	/**
	 * 获取部门编号
	 *
	 * @return department_id - 部门编号
	 */
	public Integer getDepartmentId() {
		return departmentId;
	}

	/**
	 * 设置部门编号
	 *
	 * @param departmentId
	 *            部门编号
	 */
	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}

	/**
	 * 获取部门名称
	 *
	 * @return department_name - 部门名称
	 */
	public String getDepartmentName() {
		return departmentName;
	}

	/**
	 * 设置部门名称
	 *
	 * @param departmentName
	 *            部门名称
	 */
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	/**
	 * 获取父级编号
	 *
	 * @return parent_department_id - 父级编号
	 */
	public Integer getParentDepartmentId() {
		return parentDepartmentId;
	}

	/**
	 * 设置父级编号
	 *
	 * @param parentDepartmentId
	 *            父级编号
	 */
	public void setParentDepartmentId(Integer parentDepartmentId) {
		this.parentDepartmentId = parentDepartmentId;
	}

	/**
	 * 获取管理者编号
	 *
	 * @return manager_id - 管理者编号
	 */
	public Integer getManagerId() {
		return managerId;
	}

	/**
	 * 设置管理者编号
	 *
	 * @param managerId
	 *            管理者编号
	 */
	public void setManagerId(Integer managerId) {
		this.managerId = managerId;
	}

	/**
	 * 获取地址
	 *
	 * @return address - 地址
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * 设置地址
	 *
	 * @param address
	 *            地址
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * 获取邮编
	 *
	 * @return postcode - 邮编
	 */
	public String getPostcode() {
		return postcode;
	}

	/**
	 * 设置邮编
	 *
	 * @param postcode
	 *            邮编
	 */
	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	/**
	 * 获取Email
	 *
	 * @return email - Email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * 设置Email
	 *
	 * @param email
	 *            Email
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * 获取状态 0：正常 1：删除
	 *
	 * @return flag - 状态 0：正常 1：删除
	 */
	public Byte getFlag() {
		return flag;
	}

	/**
	 * 设置状态 0：正常 1：删除
	 *
	 * @param flag
	 *            状态 0：正常 1：删除
	 */
	public void setFlag(Byte flag) {
		this.flag = flag;
	}

	/**
	 * 获取描述
	 *
	 * @return description - 描述
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * 设置描述
	 *
	 * @param description
	 *            描述
	 */
	public void setDescription(String description) {
		this.description = description;
	}
}