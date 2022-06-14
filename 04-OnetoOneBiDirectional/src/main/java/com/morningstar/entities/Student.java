package com.morningstar.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "STUDENT")
public class Student {
	@Id
	@Column(name = "Student_Id")
	private int studentId;

	@Column(name = "Student_Name")
	private String studentName;

	@Column(name = "Student_Score")
	private double studentScore;
	
	//default fk name:- refname_pkcolumn ie. address_address_id
	
	@OneToOne(cascade = CascadeType.PERSIST)	//can perform on both side
	@JoinColumn(name="Address_id")	// foreign key column
	private Address address;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	// default constructor
	public Student() {

	}

	// parameterized constructor
	public Student(int studentId, String studentName, double studentScore) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentScore = studentScore;
	}

	// getter setters
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
