package com.diplom.model;

public class Category {
	
	private String name;
	private String status;
	private String editNameStatus;
	private String section;
	private String field;
	private int numberCategoryInList;
	
	public String getName() {
		return name;
	}
	public Category setName(String name) {
		this.name = name;
		return this;
	}
	public String getStatus() {
		return status;
	}
	public Category setStatus(String status) {
		this.status = status;
		return this;
	}
	public String getSection() {
		return section;
	}
	public Category setSection(String section) {
		this.section = section;
		return this;
	}
	public String getField() {
		return field;
	}
	public Category setField(String field) {
		this.field = field;
		return this;
	}
	public int getNumberCategoryInList() {
		return numberCategoryInList;
	}
	public Category setNumberCategoryInList(int numberCategoryInList) {
		this.numberCategoryInList = numberCategoryInList;
		return this;
	}
	public String getEditNameStatus() {
		return editNameStatus;
	}
	public Category setEditNameStatus(String editNameStatus) {
		this.editNameStatus = editNameStatus;
		return this;
	}
}
