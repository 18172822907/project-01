package com.meicloud.model;

/**
 * 用户表
 * 
 * @author Administrator
 *
 */
public class User {

	public User() {
		// TODO Auto-generated constructor stub
	}

	public User(String userAccount, String password) {
		this.userAccount = userAccount;
		this.password = password;
	}

	private Long id;
	private String userAccount;// 用户账号
	private String password;// 密码
	private String userName;// 用户名称

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserAccount() {
		return userAccount;
	}

	public void setUserAccount(String userAccount) {
		this.userAccount = userAccount;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

}
