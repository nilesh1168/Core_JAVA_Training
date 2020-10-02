package com.psl.day8;

import java.util.List;

public class MyListDemo {

	public static void main(String[] args) {
		
		MyList<Integer > intList = new MyList<Integer>(5);
		intList.add(5);
		intList.add(3,4);
		intList.add(4);
		intList.add(6);
		intList.printList();
		System.out.println(intList.contains(4));
		
		List<Integer> list = intList.subList(1, 4);
		for (Integer integer : list) {
			System.out.println(integer);
		}
	
		System.out.println(intList.size());
		
		System.out.println("previous element : "+intList.set(2,10));
		intList.printList();
		intList.add(34);
		
		intList.printList();
		
		System.out.println(intList.remove(4));
		intList.printList();
		System.out.println(intList.remove(new Integer(10)));
		intList.printList();
		System.out.println("Last occurence at index : "+intList.lastIndexOf(new Integer(4)));
		System.out.println("Is intList empty?: "+intList.isEmpty());
		System.out.println("First occurence at index : "+intList.indexOf(new Integer(4)));
		
		intList.printList();
		
		System.out.println("Size : "+intList.size());
		for (Object integer : intList.toArray()) {
			System.out.println(integer);
		}
		
	}

}
