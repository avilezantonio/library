package com.hcl.training.library.model;

public class Staff extends Person {

	private String type;

	public Staff(int id, String name, String lastName, String secondLastName, String type) {
		super(id, name, lastName, secondLastName);
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
