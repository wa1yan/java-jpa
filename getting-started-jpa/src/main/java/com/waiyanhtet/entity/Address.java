package com.waiyanhtet.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Embeddable;

@Embeddable
public class Address implements Serializable {

	private static final long serialVersionUID = 1L;

	@ElementCollection
	private List<String> address1;

	@ElementCollection
	private List<String> address2;

	public List<String> getAddress1() {
		return address1;
	}

	public void setAddress1(List<String> address1) {
		this.address1 = address1;
	}

	public List<String> getAddress2() {
		return address2;
	}

	public void setAddress2(List<String> address2) {
		this.address2 = address2;
	}

}
