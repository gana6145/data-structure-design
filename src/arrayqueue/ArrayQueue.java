package arrayqueue;

import arraylistimplementation.WrongIntialCapacity;

public class ArrayQueue<E> {
	int count=0;
	Object [] ar;
	int intialCap=Queue.intialCap;
	
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
	boolean add(E ele) {
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
	 E element() {
		if(ar[0]!=null) {
			 return (E) ar[0];
		}
		throw new ListIsEmpty("list ie empty");
	}
	

}
