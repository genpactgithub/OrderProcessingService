package com.orderdetails.OrderDetails.model;

public class User {
	
	public String userName;
	public String password;
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String phone;
	public String email;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public User(String userName, String password, String phone, String email) {
		super();
		this.userName = userName;
		this.password = password;
		this.phone = phone;
		this.email = email;
	}
	@Override
	public String toString() {
		return "User [userName=" + userName + ", password=" + password + ", phone=" + phone + ", email=" + email + "]";
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

}
