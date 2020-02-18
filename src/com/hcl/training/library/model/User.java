package com.hcl.training.library.model;

public class User extends Person {

	private String address;

	public User(String address, int id, String name, String lastName, String secondLastName) {
		super(id, name, lastName, secondLastName);
		this.address = address;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
