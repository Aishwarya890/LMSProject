package com.lms.entity;

import java.time.LocalDate;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity

public class TablCollege {
	private String collegeName;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String principalName;
	private String email;
	private Long telephoneNumber;
	private String state;
	private String district;
	private String taluka;
	private String city;
	private int pincode;
	private LocalDate registrationDate;
	private Date createdAt;
	public String getCollegeName() {
		return collegeName;
	}
	public String getPrincipalName() {
		return principalName;
	}
	public void setPrincipalName(String principalName) {
		this.principalName = principalName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getTelephoneNumber() {
		return telephoneNumber;
	}
	public void setTelephoneNumber(Long telephoneNumber) {
		this.telephoneNumber = telephoneNumber;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getTaluka() {
		return taluka;
	}
	public void setTaluka(String taluka) {
		this.taluka = taluka;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public LocalDate getRegistrationDate() {
		return registrationDate;
	}
	public void setRegistrationDate(LocalDate registrationDate) {
		this.registrationDate = registrationDate;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public TablCollege() {
		super();
	}
	public TablCollege(String collegeName, Long id, String email, Long telephoneNumber, String state, String district,
			String taluka, String city, int pincode, LocalDate registrationDate, Date createdAt) {
		super();
		this.collegeName = collegeName;
		this.id = id;
		this.principalName=principalName;
		this.email = email;
		this.telephoneNumber = telephoneNumber;
		this.state = state;
		this.district = district;
		this.taluka = taluka;
		this.city = city;
		this.pincode = pincode;
		this.registrationDate = registrationDate;
		this.createdAt = createdAt;
	}
	

}
