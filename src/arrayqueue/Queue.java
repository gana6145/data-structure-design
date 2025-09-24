package arrayqueue;

public interface Queue<E> {
	int intialCap=10;
	
	boolean add(E ele);
	E element();
	E peek();
	E poll();
	E remove();
	int size();
	boolean isEmpty();
	boolean equals(Object E);
	String toString();
	
	}
