package com.inheratance;

public class B extends A implements D{

	
	
	
	public B(String name, String address) {
		super(name, address);
		 
	} 
	
	public static void main(String[] args) {
		B obj1 = new B("Ahmad", "NY");
		
		System.out.println(obj1.name);
		System.out.println(obj1.address);
		System.out.println(obj1.Village);
		
		System.out.println(obj1.showDetails());
		
	}

}
