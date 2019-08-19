package com.dxc.dtc.dos.client.model;

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
@Table(name="client")
public class Client implements Serializable {

	private static final long serialVersionUID = 2205407899579832094L;

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="client_id")
	private Integer clientId;
	
	@Column(name="client_name")
	private String clientName;
	
	@Column(name="client_desc")
	private String clientDesc;
	
	@Column(name="start_date")
	private Date startDate;
	
	@Column(name="created_date")
	private Date createdDate;

	@Column(name="udpated_date")
	private Date updatedDate;
	
	@Column(name="created_by")
	private Integer createdBy;
	
	@Column(name="updated_by")
	private Integer updatedBy;
	
	@Column(name="active")
	private Integer active;
	
	public Client() {
		super();
	}
	
	public Client(Integer clientId, String clientName, String clientDesc, Date startDate, Date createdDate, Date updatedDate, Integer createdBy, Integer updatedBy, Integer active) {
		super();
		this.clientId=clientId;
		this.clientName=clientName;
		this.clientDesc=clientDesc;
		this.startDate=startDate;
		this.createdDate=createdDate;
		this.updatedDate=updatedDate;
		this.createdBy=createdBy;
		this.updatedBy=updatedBy;
	}

	public Integer getClientId() {
		return clientId;
	}

	public void setClientId(Integer clientId) {
		this.clientId = clientId;
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public String getClientDesc() {
		return clientDesc;
	}

	public void setClientDesc(String clientDesc) {
		this.clientDesc = clientDesc;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
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

	public Integer getActive() {
		return active;
	}

	public void setActive(Integer active) {
		this.active = active;
	}
}
