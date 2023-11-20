package com.example.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "UserRegistration")
public class User {
	@Id
	@GeneratedValue
	private int sno;
	
	@Column(name = "fristname")
	private String fname;
	@Column(name = "lastname")
	private String lname;
	@Column(name = "email")
	private String email;
	@Column(name = "password")
	private String passwd;
	@Column(name = "DOB")
	private String dob;
	@Column(name = "gender")
	private String gender;
	public String getFname() {
		return fname;
	}
	@Override
	public String toString() {
		return "User [fname=" + fname + ", lname=" + lname + ", email=" + email + ", passwd=" + passwd + ", dob=" + dob
				+ ", gender=" + gender + "]";
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
}
