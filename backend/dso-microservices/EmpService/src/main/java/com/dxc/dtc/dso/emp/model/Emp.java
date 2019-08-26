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
	private String username;
	
	@Column(name="emp_email")
	private String email;
	
	@Column(name="emp_password")
	private String password;
	
	@Column(name="start_date")
	private Date startDate;
	
	@Column(name="registration_date")
	private Date registrationDate;
	
	@Column(name="title")
	private String title;
	
	@Column(name="emp_firstname")
	private String firstname;
	
	@Column(name="emp_lastname")
	private String lastname;
	
	@Column(name="dept_id")
	private Integer deptId;
	
	@Column(name="manager_id")
	private Integer managerId;

	public Emp() {
		super();
	}
	
	public Emp(Integer empId, String firstname, String lastname, String username, String password, String email, Date startDate, Date registrationDate, String title, Integer deptId, Integer managerId) {
		super();
		this.empId=empId;
		this.firstname=firstname;
		this.lastname=lastname;
		this.username=username;
		this.password=password;
		this.startDate=startDate;
		this.registrationDate=registrationDate;
		this.title=title;
		this.deptId=deptId;
		this.managerId=managerId;
		this.email=email;
	}
	
	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
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

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}
