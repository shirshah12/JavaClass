package com.inheratance;

public class A implements Z,V {
	// VARIABLE 
	// CONSTROCTOR
	// METHOD
	
	static String name;
	static String address;
	
	public A(String name, String address) {
		
		this.name = name;
		this.address = address;
	}
	
	
	public static String showDetails() {
		
		return "SOME Details";
	}
	
	
}
