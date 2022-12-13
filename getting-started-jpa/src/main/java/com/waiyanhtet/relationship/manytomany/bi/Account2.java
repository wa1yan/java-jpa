package com.waiyanhtet.relationship.manytomany.bi;

import static javax.persistence.EnumType.STRING;
import static javax.persistence.GenerationType.IDENTITY;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.waiyanhtet.relationship.onetoone.uni.Role;

@Entity
@Table(name = "account2")
public class Account2 implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = IDENTITY)
	private int id;
	@Column(nullable = false, length = 45)
	private String name;
	
	@Column(nullable = false, length = 45)
	@Enumerated(STRING)
	private Role role;
	
	@Column(nullable = false, name = "login_id", length = 10)
	private String loginId;
	
	@Column(nullable = false)
	private String password;
	
	@ManyToMany(mappedBy = "teachers")
	List<Section2> sections;

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

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public String getLoginId() {
		return loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
