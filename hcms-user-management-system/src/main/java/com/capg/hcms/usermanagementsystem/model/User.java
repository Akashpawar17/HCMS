package com.capg.hcms.usermanagementsystem.model;

import java.math.BigInteger;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user_data")
public class User {
	@Id
	//@GeneratedValue(strategy=GenerationType.AUTO)
	private String userId;
	private String userName;
	private String userPassword;
	private BigInteger contactNumber;
	private String userEmail;
	private String userRole;
	private Integer age;
	private String gender;
	private String passKey;
	public User() {
		super();
	}
	public User(String userId, String userName, String userPassword, BigInteger contactNumber, String userEmail,
			String userRole, Integer age, String gender,String passKey) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userPassword = userPassword;
		this.contactNumber = contactNumber;
		this.userEmail = userEmail;
		this.userRole = userRole;
		this.age = age;
		this.gender = gender;
		this.passKey=passKey;
	}
	public String getPassKey() {
		return passKey;
	}
	public void setPassKey(String passKey) {
		this.passKey = passKey;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public BigInteger getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(BigInteger contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserRole() {
		return userRole;
	}
	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userPassword=" + userPassword
				+ ", contactNumber=" + contactNumber + ", userEmail=" + userEmail + ", userRole=" + userRole + ", age="
				+ age + ", gender=" + gender + ", passKey=" + passKey + "]";
	}

}