package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "ACCOUNT")
public class Account {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long accId;

	private int status=1;
	
	private String createdOn;
	
	private String type;
	
	@NotNull
	@NotEmpty
	@Column(name = "cust_id")
	private Long custId;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("cust_id")
    @JoinColumn(name = "cust_id", nullable=false)   
    private Customer customer;

	
	public Long getId() {
		return accId;
	}
	public void setId(Long accId) {
		this.accId = accId;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getCreatedOn() {
		return createdOn;
	}
	public void setCreatedOn(String createdOn) {
		this.createdOn = createdOn;
	}
	public void setCustomer(Customer customer) {
		this.customer=customer;
	}
	public Customer getCustomer() {
		return customer;
	}
	public Long getCustId() {
		return custId;
	}
	public void setCustId(Long custId) {
		this.custId = custId;
	}
}
