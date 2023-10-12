package com.collections;

public class Employee {

	private String firstName;
	private String lastName;
	private int age;
	private String addresss;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddresss() {
		return addresss;
	}

	public void setAddresss(String addresss) {
		this.addresss = addresss;
	}

	public Employee(String firstName, String lastName, int age, String addresss) {

		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.addresss = addresss;
	}

}
