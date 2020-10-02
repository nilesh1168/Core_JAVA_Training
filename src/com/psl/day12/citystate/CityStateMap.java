package com.psl.day12.citystate;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class CityStateMap {
	String city [] ;
	String state [] ;
	int index;
//	Map<String, String> cityState;
//	
	public CityStateMap() {
		String line = null;
		city = new String[50];
		state = new String[50];
		index = 0;
		try(BufferedReader reader = new BufferedReader(new FileReader("/media/nilesh/Work/eclipse-workspace/Core_JAVA_Training/src/com/psl/day12/citystate/citystate.txt"))) {
			while ((line = reader.readLine()) != null) {
				String [] token = line.split(",");
				city[index] = token[0];
				state[index] = token[1];
				index++;
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	
	public void printMap() {
		for (int i = 0; i < index; i++) {
			System.out.println(city[i]+" : "+state[i]);
		}
	}
//	
	public void add(String city,String state) {
		this.city[index] = city;
		this.state[index] = state;
		index++;
	}
//	
	public String[] getAllCities() {
		return city;
	}
//	
	public String []  getAllStates() {
		return state;
	}
//	
	public List<String> getCities(String state) {
		List<String> cities = new ArrayList<String>();
		
		for (int i = 0; i < index; i++) {
			if(this.state[i].equals(state))
				cities.add(this.city[i]);
		}
		
		return cities;
	}
	
	public void delCities(String state) {	
		
		String [] tempCity = new String[50];
		String [] tempState = new String[50];
		int tempIndex = 0;
		for (int i = 0; i < index; i++) {
			if(!this.state[i].equals(state)) {
				tempCity[tempIndex] = this.city[i];
				tempState[tempIndex] = this.state[i];
				tempIndex++;
			}
		}
		this.city = tempCity;
		this.state = tempState;
		this.index = tempIndex;
 	}
	
}
