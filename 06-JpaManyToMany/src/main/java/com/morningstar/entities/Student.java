package com.morningstar.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="Stud")
public class Student {

	@Id
	@Column(name="Student_Id")
	private int sId;
	@Column(name="Student_Name")
	private String sName;
	
	@ManyToMany(targetEntity = Course.class)
	@JoinColumn(name="Course")
	private List<Course> course;

	public Student() {}
	
	public Student(int sId, String sName, List<Course> course) {
		super();
		this.sId = sId;
		this.sName = sName;
		this.course = course;
	}

	public int getsId() {
		return sId;
	}

	public void setsId(int sId) {
		this.sId = sId;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public List<Course> getCourse() {
		return course;
	}

	public void setCourse(List<Course> course) {
		this.course = course;
	}
	
}
