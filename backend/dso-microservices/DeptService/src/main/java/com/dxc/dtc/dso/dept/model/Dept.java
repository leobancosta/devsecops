package com.dxc.dtc.dso.dept.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.rest.core.annotation.RestResource;

@Entity
@RestResource
@Table(name="dept")
public class Dept {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="dept_id")
	private Integer deptId;
	
	@Column(name="dept_name")
	private String deptName;
	
	@Column(name="dept_desc")
	private String deptDesc;
	
	public Dept() {
		super();
	}
	
	public Dept(Integer deptId, String deptName, String deptDesc) {
		super();
		this.deptId=deptId;
		this.deptName=deptName;
		this.deptDesc=deptDesc;
	}

	public Integer getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getDeptDesc() {
		return deptDesc;
	}

	public void setDeptDesc(String deptDesc) {
		this.deptDesc = deptDesc;
	}
	
	
}
