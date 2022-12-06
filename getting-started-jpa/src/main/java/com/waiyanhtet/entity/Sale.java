package com.waiyanhtet.entity;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class Sale implements Serializable {

	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private SalePK pk;
	private String description;
	private int sales;

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

	public SalePK getPk() {
		return pk;
	}

	public void setPk(SalePK pk) {
		this.pk = pk;
	}

}
