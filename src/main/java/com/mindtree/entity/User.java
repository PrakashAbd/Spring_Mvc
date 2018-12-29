package com.mindtree.entity;

public class User 
{
	int userId;
	String username;
	String password;
	String doj;
	String email;
	String role;
	int projectId;

	public User() {
		super();
	}
	public User(int userId, String username, String password, String doj, String email, String role, int projectId) {
		super();
		this.userId = userId;
		this.username = username;
		this.password = password;
		this.doj = doj;
		this.email = email;
		this.role = role;
		this.projectId = projectId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getDoj() {
		return doj;
	}
	public void setDoj(String doj) {
		this.doj = doj;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public int getProjectId() {
		return projectId;
	}
	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}
	
}