package com.flp.ems.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Dinesh Rajput
 *
 */
@Entity
@Table(name="Employee")
public class Employee implements Serializable{

	private static final long serialVersionUID = -723583058586873479L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "empid")
	private Integer empId;
	
	@Column(name="empname")
	private String empName;
	
	@Column(name="empaddress")
	private String empAddress;
	
	@Column(name="phoneno")
	private Long Phone_no;
	
	@Column(name="email")
	private String emailid;
	
	@Column(name="DOJ")
	private Date doj;

	@Column(name="DOB")
	private Date dob;
	
	@Column(name="kin_id")
	private Integer kinid;
	
	@Column(name="Department_id")
	private Integer department_id;
	
	@Column(name="Project_id")
	private Integer project_id;
	
	@Column(name="Roles_id")
	private Integer roles_id;

	
	public Integer getEmpId() {
		return empId;
	}


	public void setEmpId(Integer empId) {
		this.empId = empId;
	}


	public String getEmpName() {
		return empName;
	}


	public void setEmpName(String empName) {
		this.empName = empName;
	}


	public String getEmpAddress() {
		return empAddress;
	}


	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}


	public Long getPhone_no() {
		return Phone_no;
	}


	public void setPhone_no(Long phone_no) {
		Phone_no = phone_no;
	}


	public String getEmailid() {
		return emailid;
	}


	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}


	public Date getDoj() {
		return doj;
	}


	public void setDoj(Date doj) {
		this.doj = doj;
	}


	public Date getDob() {
		return dob;
	}


	public void setDob(Date dob) {
		this.dob = dob;
	}


	public Integer getKinid() {
		return kinid;
	}


	public void setKinid(Integer kinid) {
		this.kinid = kinid;
	}


	public Integer getDepartment_id() {
		return department_id;
	}


	public void setDepartment_id(Integer department_id) {
		this.department_id = department_id;
	}


	public Integer getProject_id() {
		return project_id;
	}


	public void setProject_id(Integer project_id) {
		this.project_id = project_id;
	}


	public Integer getRoles_id() {
		return roles_id;
	}


	public void setRoles_id(Integer roles_id) {
		this.roles_id = roles_id;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

}
