package com.dxc.dtc.dos.squad.model;

import java.io.Serializable;
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
@Table(name="squad")
public class Squad implements Serializable {

	private static final long serialVersionUID = 4976673457624264442L;

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="squad_id")
	private Integer squadId;
	
	@Column(name="squad_name")
	private String squadName;
	
	@Column(name="squad_desc")
	private String squadDesc;
	
	@Column(name="created_date")
	private Date createdDate;
	
	@Column(name="updated_date")
	private Date updatedDate;
	
	@Column(name="created_by")
	private Integer createdBy;
	
	@Column(name="updated_by")
	private Integer updatedBy;
	
	@Column(name="start_date")
	private Date startDate;
	
	@Column(name="project_id")
	private Integer projectId;
	
	public Squad() {
		super();
	}
	
	public Squad(Integer squadId, String squadName, String squadDesc, Date createdDate, Date updatedDate, Integer createdBy, Integer updatedBy, Date startDate, Integer projectId) {
		super();
		this.squadId=squadId;
		this.squadName=squadName;
		this.squadDesc=squadDesc;
		this.createdDate=createdDate;
		this.updatedDate=updatedDate;
		this.createdBy=createdBy;
		this.updatedBy=updatedBy;
		this.startDate=startDate;
		this.projectId=projectId;
	}

	public Integer getSquadId() {
		return squadId;
	}

	public void setSquadId(Integer squadId) {
		this.squadId = squadId;
	}

	public String getSquadName() {
		return squadName;
	}

	public void setSquadName(String squadName) {
		this.squadName = squadName;
	}

	public String getSquadDesc() {
		return squadDesc;
	}

	public void setSquadDesc(String squadDesc) {
		this.squadDesc = squadDesc;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	public Integer getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(Integer createdBy) {
		this.createdBy = createdBy;
	}

	public Integer getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(Integer updatedBy) {
		this.updatedBy = updatedBy;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Integer getProjectId() {
		return projectId;
	}

	public void setProjectId(Integer projectId) {
		this.projectId = projectId;
	}
	
}
