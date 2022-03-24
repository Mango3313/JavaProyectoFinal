package com.model;

public class User {
	int u_id;
	String u_name;
	String u_address;

	public User() {
	}

	public User(String u_name, String u_address) {
		this.u_name = u_name;
		this.u_address = u_address;
	}

	public int getU_id() {
		return u_id;
	}

	public void setU_id(int u_id) {
		this.u_id = u_id;
	}

	public String getU_name() {
		return u_name;
	}

	public void setU_name(String u_name) {
		this.u_name = u_name;
	}

	public String getU_address() {
		return u_address;
	}

	public void setU_address(String u_address) {
		this.u_address = u_address;
	}

	@Override
	public String toString() {
		return "Employee [emp_id=" + u_id + ", u_name=" + u_name + ", u_address=" + u_address + "]";
	}
}
