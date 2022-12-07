package com.waiyanhtet.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Lob;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@IdClass(SalePK.class)
public class Sale implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "seq_number")
	private int seqNumber;

	@Id
	@Column(name = "transaction_type")
	private int transactionType;

	@Basic(optional = false)
	@Lob
	private String description;
	
	@Column(nullable = true)
	private int sales;

	@Transient
	private boolean deleted;
	
	@Temporal(TemporalType.DATE)
	@Column(name =" created_at")
	private Date createdAt;

	public boolean isDeleted() {
		return deleted;
	}

	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}

	public int getSeqNumber() {
		return seqNumber;
	}

	public void setSeqNumber(int seqNumber) {
		this.seqNumber = seqNumber;
	}

	public int getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(int transactionType) {
		this.transactionType = transactionType;
	}

	public void setSales(int sales) {
		this.sales = sales;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getSales() {
		return sales;
	}

	public void setSales(Integer sales) {
		this.sales = sales;
	}
}
