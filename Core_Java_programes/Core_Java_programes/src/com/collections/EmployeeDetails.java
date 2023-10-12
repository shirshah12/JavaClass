package com.collections;

import java.util.LinkedList;

public class EmployeeDetails {

	public static void main(String[] args) {
		Employee obj1 = new Employee("Ahmad", "Samir", 25, "NY");
		Employee obj2 = new Employee("Tamana", "Ahadi", 27, "VA");
		Employee obj3 = new Employee("Zalim", "Kamal", 24, "CA");
		Employee obj4 = new Employee("Farid", "Wahidi", 23, "TX");
		Employee obj5 = new Employee("Wazhma", "Kamal", 22, "kabul");
		LinkedList<Employee> EmployeeLists = new LinkedList<Employee>();
		EmployeeLists.add(obj1);
		EmployeeLists.add(obj2);
		EmployeeLists.add(obj3);
		EmployeeLists.add(obj4);
		EmployeeLists.add(obj5);
		
		for( Employee emp :  EmployeeLists) {
			System.out.println(emp.getFirstName() + "  " + emp.getLastName() + " " + emp.getAge() + " " + emp.getAddresss());
			
		}
		
		

	}

}
