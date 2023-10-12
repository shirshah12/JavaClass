package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListExample {

	public static void main(String[] args) {

		ArrayList<String> studentDetails = new <String>ArrayList();

		// loops
		studentDetails.add("Samir");
		studentDetails.add("Fariha");
		studentDetails.add("Ahmad");
		studentDetails.add("sahar");
		
		Collections.reverse(studentDetails);
		
		System.out.println(" Reversed" +  studentDetails);
		
		
		System.out.println(studentDetails.remove(3));

		// iterator Interface
		System.out.println(" \n Interfacen iterator\n");
		Iterator names = studentDetails.iterator();

		while (names.hasNext()) {
			System.out.println(names.next());
		}

		System.out.println(" \n Interface ListIterator\n");
		// ListIterator
		ListIterator<String> myList = studentDetails.listIterator();
		while (myList.hasNext()) {
			String stuList = myList.next();
			System.out.println(stuList);

		}

		System.out.println(" \n Traversing list through for-each loop \n");

		for (String s1 : studentDetails) {
			System.out.println(s1);

			System.out.println(" \n    \n");

		}

		System.out.println(" \n Traversing list through for each Method \n");

		studentDetails.forEach(st -> {
			System.out.println(st);
		});

		System.out.println(" \n Traversing list through for loop \n");

		for (int i = 0; i < studentDetails.size(); i++) {

			System.out.println(studentDetails.get(i));

		}
		
		System.out.println(" \n Traversing list through forEachRemaining method \n");
		
		Iterator<String> sName = studentDetails.iterator();
		
		sName.forEachRemaining( s2 -> {
			System.out.println(s2);
			
		});
	

	}
	

}
