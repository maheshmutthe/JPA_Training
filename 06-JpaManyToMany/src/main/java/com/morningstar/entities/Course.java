package com.morningstar.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="Course")
public class Course {
	
	@Id
	@Column(name="Course_Id")
	private int cId;
	
	@Column(name="Course_Name")
	private String cName;
	

	@ManyToMany(targetEntity = Student.class)
	@JoinColumn(name="Student")
	private List<Student> student;
	
	
	public Course() {}
	
	public Course(int cId, String cName, List<Student> student) {
		super();
		this.cId = cId;
		this.cName = cName;
		this.student = student;
	}

	public int getcId() {
		return cId;
	}
	public void setcId(int cId) {
		this.cId = cId;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}

	public List<Student> getStudent() {
		return student;
	}

	public void setStudent(List<Student> student) {
		this.student = student;
	}
	
}
