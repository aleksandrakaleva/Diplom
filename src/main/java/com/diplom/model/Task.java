package com.diplom.model;

import java.util.List;

public class Task {
	
	private String name;
	private String desc;
	private String type;
	private String priprity;
	private String manager;
	private String date;
	private String timeTo;
	private String toTime;
	private String typeObject;
	private String object;
	private List<String> parametrChecklist;
	
	public String getName() {
		return name;
	}
	public Task setName(String name) {
		this.name = name;
		return this;
	}
	public String getDesc() {
		return desc;
	}
	public Task setDesc(String desc) {
		this.desc = desc;
		return this;
	}
	public String getType() {
		return type;
	}
	public Task setType(String type) {
		this.type = type;
		return this;
	}
	public String getPriprity() {
		return priprity;
	}
	public Task setPriprity(String priprity) {
		this.priprity = priprity;
		return this;
	}
	public String getManager() {
		return manager;
	}
	public Task setManager(String manager) {
		this.manager = manager;
		return this;
	}
	public String getDate() {
		return date;
	}
	public Task setDate(String date) {
		this.date = date;
		return this;
	}
	public String getTimeTo() {
		return timeTo;
	}
	public Task setTimeTo(String timeTo) {
		this.timeTo = timeTo;
		return this;
	}
	public String getToTime() {
		return toTime;
	}
	public Task setToTime(String toTime) {
		this.toTime = toTime;
		return this;
	}
	public String getTypeObject() {
		return typeObject;
	}
	public Task setTypeObject(String typeObject) {
		this.typeObject = typeObject;
		return this;
	}
	public String getObject() {
		return object;
	}
	public Task setObject(String object) {
		this.object = object;
		return this;
	}
	public List<String> getParametrChecklist() {
		return parametrChecklist;
	}
	public void setParametrChecklist(List<String> parametrChecklist) {
		this.parametrChecklist = parametrChecklist;
	}


}
