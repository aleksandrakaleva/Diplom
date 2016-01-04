package com.diplom.model;

public class File {

	private String name;
	private String path;

	public String getName() {
		return name;
	}
	
	public File setName(String name) {
		this.name = name;
		return this;
	}
	
	public String getPath() {
		return path;
	}
	
	public File setPath(String path) {
		this.path = path;
		return this;
	}

}
