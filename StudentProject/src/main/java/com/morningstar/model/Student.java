package com.morningstar.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="Student")
public class Student {
	@Id
	@Column(name ="Student_Id")
	private int studentId;
	@Column(name ="Student_name", nullable = false,length = 50)
	private String studentName;
	@Column(name="Student_Score",nullable =false, length=30)
	private double studentScore;
	
	public Student()
	{
		
	}
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
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentScore=" + studentScore
				+ "]";
	}
	
	

}
