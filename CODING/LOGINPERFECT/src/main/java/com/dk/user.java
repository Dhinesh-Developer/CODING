package com.dk;

public class user {
	private String uName;
	private String uEmail;
	private String uPassword;
	public String getuName() {
		return uName;
	}
	public void setuName(String uName) {
		this.uName = uName;
	}
	public String getuEmail() {
		return uEmail;
	}
	public void setuEmail(String uEmail) {
		this.uEmail = uEmail;
	}
	public String getuPassword() {
		return uPassword;
	}
	public void setuPassword(String uPassword) {
		this.uPassword = uPassword;
	}
	public user(String uName, String uEmail, String uPassword) {
		super();
		this.uName = uName;
		this.uEmail = uEmail;
		this.uPassword = uPassword;
	}
	@Override
	public String toString() {
		return "user [uName=" + uName + ", uEmail=" + uEmail + ", uPassword=" + uPassword + "]";
	}
	public user() {
		super();
	}
	
}
