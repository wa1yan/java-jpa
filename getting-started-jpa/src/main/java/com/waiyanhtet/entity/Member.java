package com.waiyanhtet.entity;

import static javax.persistence.GenerationType.IDENTITY;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.SecondaryTable;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(
		name="MEMBER_TBL"
	)
@SecondaryTable(name = "LOGIN_INFO", indexes = {
		@Index(columnList = "loginId")
})
@SecondaryTable(name = "CONTACT_INFO", uniqueConstraints = {
		@UniqueConstraint(columnNames = {"email"})
})
public class Member implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = IDENTITY)
	private int id;
	private String name;
	
	@Column(table = "LOGIN_INFO")
	private String loginId;
	@Column(table = "LOGIN_INFO")
	private String password;
	@Column(table = "LOGIN_INFO")
	private Role role;

	@Embedded
	private Contact contact;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Contact getContact() {
		return contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

}
