package com.dxc.dtc.dso.emp.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="emp")
public class Emp {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="emp_id")
	private Integer empId;
	
	@Column(name="emp_username")
	private String empUsername;
	
	@Column(name="emp_email")
	private String empEmail;
	
	@Column(name="emp_password")
	private String empPassword;
	
	@Column(name="start_date")
	private Date startDate;
	
	@Column(name="registration_date")
	private Date registrationDate;
	
	@Column(name="title")
	private String title;
	
	@Column(name="emp_firstname")
	private String empFirstname;
	
	@Column(name="emp_lastname")
	private String empLastname;
	
	@Column(name="dept_id")
	private Integer deptId;
	
	@Column(name="manager_id")
	private Integer managerId;

	public Emp() {
		super();
	}
	
	public Emp(Integer empId, String empFirstname, String empLastname, String empUsername, String empPassword, String empEmail, Date startDate, Date registrationDate, String title, Integer deptId, Integer managerId) {
		super();
		this.empId=empId;
		this.empFirstname=empFirstname;
		this.empLastname=empLastname;
		this.empUsername=empUsername;
		this.empPassword=empPassword;
		this.startDate=startDate;
		this.registrationDate=registrationDate;
		this.title=title;
		this.deptId=deptId;
		this.managerId=managerId;
		this.empEmail=empEmail;
	}
	
	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getEmpUsername() {
		return empUsername;
	}

	public void setEmpUsername(String empUsername) {
		this.empUsername = empUsername;
	}

	public String getEmpEmail() {
		return empEmail;
	}

	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}

	public String getEmpPassword() {
		return empPassword;
	}

	public void setEmpPassword(String empPassword) {
		this.empPassword = empPassword;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(Date registrationDate) {
		this.registrationDate = registrationDate;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getEmpFirstname() {
		return empFirstname;
	}

	public void setEmpFirstname(String empFirstname) {
		this.empFirstname = empFirstname;
	}

	public String getEmpLastname() {
		return empLastname;
	}

	public void setEmpLastname(String empLastname) {
		this.empLastname = empLastname;
	}

	public Integer getDeptId() {
		return deptId;
	}

	public void setDeptId(Integer deptId) {
		this.deptId = deptId;
	}

	public Integer getManagerId() {
		return managerId;
	}

	public void setManagerId(Integer managerId) {
		this.managerId = managerId;
	}

}
