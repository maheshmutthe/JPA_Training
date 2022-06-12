package com.morningstar.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Student")
public class Student {
	@Id
	@Column(name="Student_Id")
	private int studentId;
	@Column(name="Student_Name")
	private String studentName;
	@Column(name="Student_Score")
	private double studentScore;
	
	public Student() {}
	
	public Student(int studentId, String studentName, double studentScore) {

		this.studentId = studentId;
		
		this.studentName = studentName;
	
		this.studentScore = studentScore;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public double getStudentScore() {
		return studentScore;
	}
	public void setStudentScore(double studentScore) {
		this.studentScore = studentScore;
	}
	

}
