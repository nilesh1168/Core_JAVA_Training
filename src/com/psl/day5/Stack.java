package com.psl.day5;

public class Stack<T extends Object> {
	private T[] arr;
	private static int size;
	private static int top;
	
	public Stack(int size) {
		Stack.size = size;
		Stack.top = 0;
		this.arr = (T[]) new Object[size];
	}
	
	 void push(T obj) {
		try {
			if(obj instanceof Contact) {
				if(!((Contact) obj).validate())
					throw new Exception("Validation Failed !!");
			}
			
			if(this.arr == null) {
				throw new Exception("Uninitialised Stack!!");
			}
			
			if(Stack.top == Stack.size) {
				throw new Exception("Stack Full!!");
			}
			this.arr[Stack.top++]=obj;
			
		} catch (Exception e) {
			System.out.println("hello");
			System.out.println(e);
		}
	}
	
	  T pop() {
		try {
			if(this.arr == null) {
				throw new Exception("Uninitialised Stack!!");
			}
			
			else if(Stack.top == 0) {
				throw new Exception("Stack Empty!!");
			}

				
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return this.arr[top--];
	}
	
	 T peek() {
		try {
			if(this.arr == null) {
				throw new Exception("Uninitialised Stack!!");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		return this.arr[top];
	}
	
	 void printStack(){
		 for (T object : arr) {
			 if(object != null)
			System.out.println(object.toString());
		}
	 }
	 
	 int getSize() {
		 return size;
	 }
	 
}
