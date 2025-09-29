package Stack;

import arraylistimplementation.ArrayList;

public class Stack<E> {
	private int count=0;
	private ArrayList<E> list=new ArrayList<E>();
	
	public boolean push(E ele) {
		list.add(ele);
		count++;
	    return true;
		}
	public boolean pop() {
		if(!list.isEmpty()) {
			list.remove(count-1);
			count--;
		   return true;
		}
		else return false;
		}
	
	public E peek() {
		if(list.size()>0) {
			return list.get(count-1);
		}
		return null;
	}
	public int size() {
		return count;
	}
	public boolean isEmpty() {
	return count==0;
	}
	
	

}
