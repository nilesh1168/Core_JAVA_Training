package com.psl.day8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MyList<E extends Object> implements List<E> {
	E[] list;

	public MyList(int size) {
		E[] es = (E[]) new Object[size];
		this.list = es;
	}

	void printList() {
		System.out.println("=====Start of List====");
		for (E object : list) {
			System.out.println(object);
		}
		System.out.println("=====End of List====");	
	}

	@Override
	public boolean add(E arg0) {
		int i;
		for (i = 0; i < this.list.length; i++) {
			if (this.list[i] == null) {
				break;
			}
		}
		if (i == this.list.length) {
			System.out.println("List full!");
			return false;
		}

		this.list[i] = arg0;
		return true;
	}

	@Override
	public void add(int arg0, E arg1) {
		if (arg0 < this.list.length) {
			this.list[arg0] = arg1;
		} else
			System.out.println("Index out of bounds (" + arg0 + "," + this.list.length + ")");
	}

	@Override
	public boolean addAll(Collection<? extends E> arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(int arg0, Collection<? extends E> arg1) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		for (int i = 0; i < list.length; i++) {
			this.list[i] = null;
		}

	}

	@Override
	public boolean contains(Object arg0) {
		for (int i = 0; i < list.length; i++) {
			if (this.list[i] == (E) arg0)
				return true;
		}
		return false;
	}

	@Override
	public boolean containsAll(Collection<?> arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public E get(int index) {
		if(index >= list.length)
		{
			System.out.println("Index out of bound!!!");
			return null;
		}
		else
			return list[index];
	}

	@Override
	public int indexOf(Object element) {
		for (int i = 0; i < list.length; i++) {
			if(list[i].equals(element))
				return i;
		} 

		return -1;
	}

	@Override
	public boolean isEmpty() {
		for (E e : list) {
			if(e != null)
				return false;
		}
		return true;
	}

	@Override
	public Iterator<E> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int lastIndexOf(Object element) {
		int lastIndex=-1;
		for (int i = 0; i < list.length; i++) {
			if(list[i]!=null)
				if(list[i].equals(element))
					lastIndex = i;
		}
		return lastIndex;
	}

	@Override
	public ListIterator<E> listIterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ListIterator<E> listIterator(int arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean remove(Object element) {
		System.out.println(element);
		for (int i = 0; i < list.length; i++) {
			if(list[i].equals(element))
			{
				list[i] = null;
				return true;
			}	
		}
		return false;
	}

	@Override
	public E remove(int index) {
		E removed = list[index];
		for (int i = index; i < list.length; i++) {
			if(i+1 >= list.length)
				list[i] = null;
			else
					list[i] = list[i+1];
		}
		return removed;
	}

	@Override
	public boolean removeAll(Collection<?> arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection<?> arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public E set(int index, E element) {
		E replace = list[index];
		if (index < 0 || index >= list.length) {
			System.out.println("Index out of bound!!");
			return null;
		} else
			list[index] = element;
		return replace;
	}

	@Override
	public int size() {
		int cnt = 0;
		for (int i = 0; i < list.length; i++) {
				cnt++;
		}
		return cnt;
	}

	@Override
	public List<E> subList(int start, int end) {
		List<E> sublist = new ArrayList<E>();
		if (start < 0 || end >= list.length) {
			System.out.println("Index out of bound!!");
			return null;
		} else {
			for (int i = start; i < end; i++) {
				sublist.add(list[i]);
			}
		}
		return sublist;
	}

	@Override
	public Object[] toArray() {
		Object obj [] =new Object[this.size()];
		for (int i = 0; i < obj.length; i++) {
			obj[i] = this.get(i);
		} 
		return obj;
	}

	@Override
	public <T> T[] toArray(T[] arg0) {
		// TODO Auto-generated method stub
		return null;
	}

}
