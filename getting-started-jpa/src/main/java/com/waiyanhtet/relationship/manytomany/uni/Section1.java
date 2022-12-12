package com.waiyanhtet.relationship.manytomany.uni;

import static javax.persistence.GenerationType.IDENTITY;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.waiyanhtet.relationship.onetoone.uni.Account;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;

@Entity
@Table(name = "class1")
public class Section1 implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = IDENTITY)
	private int id;

	@Column(name = "start_date")
	private LocalDate startDate;

	@Column(name = "start_time")
	private LocalTime startTime;

	@Column(name = "end_time")
	private LocalTime endTime;

	private double months;

	@ManyToMany
	@JoinTable(name = "class_teacher",
			joinColumns = @JoinColumn(name = "class_id"),
			inverseJoinColumns = @JoinColumn(name = "teacher_id"))
	private List<Account> teachers;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalTime getStartTime() {
		return startTime;
	}

	public void setStartTime(LocalTime startTime) {
		this.startTime = startTime;
	}

	public LocalTime getEndTime() {
		return endTime;
	}

	public void setEndTime(LocalTime endTime) {
		this.endTime = endTime;
	}

	public double getMonths() {
		return months;
	}

	public void setMonths(double months) {
		this.months = months;
	}

	public List<Account> getTeachers() {
		return teachers;
	}

	public void setTeachers(List<Account> teachers) {
		this.teachers = teachers;
	}

}
