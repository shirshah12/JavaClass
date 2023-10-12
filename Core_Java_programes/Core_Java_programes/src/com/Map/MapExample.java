package com.Map;

import java.io.PrintStream;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.stream.Stream;

public class MapExample {

	public static void main(String[] args) {
		 // list soccer players with jersey numbers
		
		LinkedHashMap <Integer, String> soccerPlayersDetails = new LinkedHashMap <Integer, String> ();
		
		
		soccerPlayersDetails.put(null, null );
		soccerPlayersDetails.put(10, "Messi");
		soccerPlayersDetails.put(9, "Bezima");
		soccerPlayersDetails.put(11, "Mane");
		soccerPlayersDetails.put(5, "Zidan");
		soccerPlayersDetails.put(21, "Zalatan");
		
		soccerPlayersDetails.remove(21);
		
		// insertion order 
		for(Entry <Integer, String> players : soccerPlayersDetails.entrySet()) {
			
			
			System.out.println(players.getKey() + " " + players.getValue() );
		}
		
		// Countries telephone code and names
		// Hashmap
		// LinkedHashmap
		// TreeMap
		// Map
		// SortedMap
		
		TreeMap<Integer, String> countries = new TreeMap<Integer, String>();
		
		countries.put(+1, "United Stats of Amarica" );
		countries.put(+93, "Afghanistan");
		countries.put(+92, "Pakistan");
		countries.put(+98, "Iran");
		countries.put(100, "Germany");
		
		
		System.out.println(countries.get(1));
		
		System.out.println("===================\n");
		
		// change your enters to set
		for(  Entry<Integer, String>    c :    countries.entrySet()  ) {
			
			System.out.println(c.getKey() + "  "  +  c.getValue());
			
		
			
		}
		
		System.out.println("===================\n");
		countries.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEach(System.out::println);
		
		
		
		
	//	countriesLlist
		
		HashMap<String, String> countriesLlist = new HashMap<String, String>();
		
		countriesLlist.put("USA", "United Stats Of Amarica");
		countriesLlist.put("GER", "Germany");
		countriesLlist.put("JP", "Japa");
		countriesLlist.put("Afg", "Afghanistan");
		countriesLlist.put("IN", "INDIA");
		
		
		System.out.println("===================\n");
		
		// reversded list
		
		
		for(Entry<String, String>  cn  : countriesLlist.entrySet() ) {
			
			System.out.println(cn.getKey() + "  " +  cn.getValue());
			
		}
		
	}
	
 

}
