package com.morningstar.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class Address {
	@Id
	@Column(name="Address_Id")
	private int addressId;
	private String city;
	private String pincode;
	
	@OneToOne(mappedBy = "address")	//mappedBy attribute - inverse entity
	//@JoinColumn	only should be in owner table
	private Student student;
	
	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Address() {}
	
	public Address(int addressId, String city, String pincode) {
		super();
		this.addressId = addressId;
		this.city = city;
		this.pincode = pincode;
	}

	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", city=" + city + ", pincode=" + pincode + "]";
	}
	
	

}
