package com.psl.day12.citystate;

import java.util.List;

public class CityStateTester {
	public static void main(String[] args) {
		CityStateMap map = new CityStateMap();
		map.printMap();
		
		List<String> cities = map.getCities("Maharashtra");
		for (String string : cities) {
			System.out.println(string);
		}
		
		map.delCities("Punjab");
		map.printMap();
		map.add("Karad", "Maharashtra");
		map.printMap();
	}
}
