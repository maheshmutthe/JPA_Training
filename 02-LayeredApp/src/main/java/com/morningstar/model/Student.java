package com.morningstar.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//Model class is simple POJO class which has fields similar to columns in database
//POJO has Constructor, getter-Setter methods

@Entity
@Table(name="Student")
public class Student {

	@Id
	@Column(name="Student_Id")
	private int StudentId;
	
	@Column(name="Student_Name", nullable=false, length=50)
	private String StudentName;
	
	@Column(name="Student_Score", nullable= false, length=3)
	private double StudentScore;

	public Student() {
		//this is No-Argument 'ctor, a good practise to have this 'ctor
	}
	
	public Student(int studentId, String studentName, double studentScore) {
		super();
		StudentId = studentId;
		StudentName = studentName;
		StudentScore = studentScore;
	}

	public int getStudentId() {
		return StudentId;
	}

	public void setStudentId(int studentId) {
		StudentId = studentId;
	}

	public String getStudentName() {
		return StudentName;
	}

	public void setStudentName(String studentName) {
		StudentName = studentName;
	}

	public double getStudentScore() {
		return StudentScore;
	}

	public void setStudentScore(int studentScore) {
		StudentScore = studentScore;
	}
}
