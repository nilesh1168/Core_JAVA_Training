package com.psl.day12.print;

import java.util.Collection;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class GenericPrint {

	public static void print(Collection c) {
		for (Iterator iterator = c.iterator(); iterator.hasNext();) {
			Object object = (Object) iterator.next();
			System.out.println(object);
		}
	}
	
	
	public static void main(String[] args) {
		Queue set = new PriorityQueue<Integer>();
		set.add(345);
		set.add(56);
		print(set);
	}

}
