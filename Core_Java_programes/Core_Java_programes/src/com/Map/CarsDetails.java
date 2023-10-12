package com.Map;

import java.util.HashMap;
import java.util.Map;

public class CarsDetails {

	public static void main(String[] args) {
		 
		BMW b1 = new BMW("BMW R", 2023, "I7", "BMW", 120.00, "Black", "Electric");
		BMW b2 = new BMW("BMW S", 2022, "I2", "BMW", 100.00, "Wihte", "Gass");
		BMW b3 = new BMW("BMW M ", 2021, "I3", "BMW", 90.00, "Gray", "Hybrid");
		BMW b4 = new BMW("BMW Y", 2020, "I5", "BMW", 80.00, "Green", "Gass");
		BMW b5 = new BMW("BMW W", 2019, "I3", "BMW", 70.00, "Red", "Hybrid");
		
		
		HashMap<Integer, BMW> cars = new HashMap<Integer, BMW>();
		
		cars.put(1 ,  b1);
		cars.put(2 ,  b2);
		cars.put(3 ,  b3);
		cars.put(4 ,  b4);
		cars.put(5 ,  b5);
		
		
		
		for(Map.Entry<Integer, BMW> car :   cars.entrySet() ) {
			
			int keys = car.getKey();
			BMW value = car.getValue();
			
			System.out.println(keys);
			System.out.println(value.name +  "  " +  value.year  + " " + value.model + "  " + 
			value.company + " " + value.price + " " + value.color + " " + value.engineType);
			
			
			
		}
		
		

	}

}
