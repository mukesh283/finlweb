package com.flp.ems.bean;

import java.util.Date;

/**
 * @author Dinesh Rajput
 *
 */
public class EmployeeBean {
	private Integer id;
	private String name;
	private int kin_id;
	private Long phone_no;
	private String address;
	private String email_id;
	private Date DOB;
	private Date DOJ;
	private int departmentid;
	private int projectid;
	private int rolesid;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKin_id() {
		return kin_id;
	}
	public void setKin_id(int kin_id) {
		this.kin_id = kin_id;
	}
	public Long getPhone_no() {
		return phone_no;
	}
	public void setPhone_no(Long phone_no) {
		this.phone_no = phone_no;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail_id() {
		return email_id;
	}
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}
	public Date getDOB() {
		return DOB;
	}
	public void setDOB(Date dOB) {
		DOB = dOB;
	}
	public Date getDOJ() {
		return DOJ;
	}
	public void setDOJ(Date dOJ) {
		DOJ = dOJ;
	}
	public int getDepartmentid() {
		return departmentid;
	}
	public void setDepartmentid(int departmentid) {
		this.departmentid = departmentid;
	}
	public int getProjectid() {
		return projectid;
	}
	public void setProjectid(int projectid) {
		this.projectid = projectid;
	}
	public int getRolesid() {
		return rolesid;
	}
	public void setRolesid(int rolesid) {
		this.rolesid = rolesid;
	}
	
	
	}
