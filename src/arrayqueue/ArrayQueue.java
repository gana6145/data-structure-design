package arrayqueue;

import arraylistimplementation.WrongIntialCapacity;

public class ArrayQueue<E> implements Queue<E>   {
	private int count=0;
	private Object [] ar;
	private int intialCap=Queue.intialCap;
	
	ArrayQueue(){
		this.ar=new Object[intialCap];
	}
	ArrayQueue(int cap){
		if(cap<=0) {
			throw new WrongIntialCapacity("size cannot be Negative");
		}
		else {
			this.intialCap=cap;
			this.ar=new Object[intialCap];
		}
	}
	public boolean add(Object ele) {
		if(ele!=null) {
			resize();
			ar[count++]=ele;
			return true;
		}
		return false;
		
	}
	private void resize() {
    	Object temp[]= new Object[ar.length*2];
    	for(int i=0;i<count;i++) {
			temp[i]=ar[i];
		}
    	ar=temp;
    }
	
	 public String toString() {
			String op="[";
			for(int i=0;i<count;i++) {
				if(i<count-1) {
					op+=ar[i]+ ","; 
				}
				else {
					op+=ar[i];
				}
		}
			op+= "]";
			return op;
	    }
	 public E element() {
		if(ar[0]!=null) {
			 return (E) ar[0];
		}
		throw new ListIsEmpty("Queue is empty");
	}
	 public E remove() {
		 if(count==0) {
			 throw new ListIsEmpty("Queue is empty");
			 }
		 E val=(E) ar[0];
		 if(val!=null) {
		     leftShift();
			}
		 return val;
		 
	}
	 public E peek() {
		 if(count==0) {
			 return null;
		 }
		 else return (E) ar[0];
	 }
	 public E poll() {
		 E a;
		 if(count==0) {
			 return null;
			}
		 else {
			 a=(E) ar[0];
			 leftShift();
		}
		 return a;
	 }
	 
	 private void leftShift() {
		 
		 if(count!=0) {
			 for(int i=1;i<count;i++) {
				 ar[i-1]=ar[i];
			 }
			 ar[count-1]=null;
			 count--;
		 }
		}
	 public boolean isEmpty() {
		 return count==0;
	 }
	 public int size() {
		 return count;
	 }
	 public boolean equals(Object obj) {
		 
		 ArrayQueue<E> ref=(ArrayQueue<E>) obj;
		 
		 for(int i=0;i<count;i++) {
			 if(this.ar[i]!=ref.ar[i]) {
				 return false;
			 }
		 }
		 return true;
		 
	 }
	 

}
