package com.waiyanhtet.relationship;

import static javax.persistence.EnumType.STRING;
import static javax.persistence.GenerationType.IDENTITY;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "course")
public class Course implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = IDENTITY)
	private int id;
	
	@Column(length = 45)
	private String name;
	
	@Column(columnDefinition = "LONGTEXT")
	private String description;
	
	@Enumerated(STRING)
	private Level level;
	private int hours;

	//private List<CourseFee> courseFee;

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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Level getLevel() {
		return level;
	}

	public void setLevel(Level level) {
		this.level = level;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

//	public List<CourseFee> getCourseFee() {
//		return courseFee;
//	}
//
//	public void setCourseFee(List<CourseFee> courseFee) {
//		this.courseFee = courseFee;
//	}

}
