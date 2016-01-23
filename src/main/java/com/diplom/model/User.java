package com.diplom.model;



public class User {
	
	private String password;
	private String email;
	private String login;
	private String surname;
	private String name;
	private String patronymic;
	private String skype;
	private String phone;
	private String role;
	private String sex;
	private String subdomain;
	
	
	public String getPassword() {
		return password;
	}
	public User setPassword(String password) {
		this.password = password;
		return this;
	}
	public String getEmail() {
		return email;
	}
	public User setEmail(String email) {
		this.email = email;
		return this;
	}
	public String getLogin() {
		return login;
	}
	public User setLogin(String login) {
		this.login = login;
		return this;
	}
	public String getSurname() {
		return surname;
	}
	public User setSurname(String surname) {
		this.surname = surname;
		return this;
	}
	public String getName() {
		return name;
	}
	public User setName(String name) {
		this.name = name;
		return this;
	}
	public String getSkype() {
		return skype;
	}
	public User setSkype(String skype) {
		this.skype = skype;
		return this;
	}
	public String getPhone() {
		return phone;
	}
	public User setPhone(String phone) {
		this.phone = phone;
		return this;
	}
	public String getRole() {
		return role;
	}
	public User setRole(String role) {
		this.role = role;
		return this;
	}
	public String getPatronymic() {
		return patronymic;
	}
	public User setPatronymic(String patronymic) {
		this.patronymic = patronymic;
		return this;
	}
	public String getSubdomain() {
		return subdomain;
		
	}
	public User setSubdomain(String subdomain) {
		this.subdomain = subdomain;
		return this;
	}
	public String getSex() {
		return sex;
	}
	public User setSex(String sex) {
		this.sex = sex;
		return this;
	}


}
