package com.inheratance;

public class C extends B implements X,V,Z {

	public C(String name, String address) {
		super(name, address);
		 
	}
	
	 public static void main(String[] args) {
		C obj = new C("Kamal", "VA");
		System.out.println(obj.name);
		System.out.println(obj.address);
		System.out.println(obj.showDetails());
	}

}
