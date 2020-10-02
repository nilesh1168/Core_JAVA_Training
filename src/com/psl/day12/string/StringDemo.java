package com.psl.day12.string;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class StringDemo {
	
	static Map<String, Integer> sequence = new HashMap<String, Integer>(); 	
	
	static int calcUniqueChars(String s) {
		if(sequence.containsKey(s)) {
			System.out.println("from hashmap");
			return sequence.get(s);
		}
		else {
			
		Set<Character> uniqueCharacters = new HashSet<Character>();
		char [] chars = s.toCharArray();
		for (int i = 0; i < chars.length; i++) {
			uniqueCharacters.add(chars[i]);
		}
		
		sequence.put(s, uniqueCharacters.size());
		
		return uniqueCharacters.size();
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Sequence : aeiou "+calcUniqueChars("aeiou"));
		System.out.println("Sequence : Nilesh "+calcUniqueChars("Nilesh"));
		System.out.println("Sequence : aeiou "+calcUniqueChars("aeiou"));
		
	}

}
