package com.waiyanhtet.entity;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class Contact implements Serializable {

	private static final long serialVersionUID = 1L;

	private String address;
	private String email;

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
