package linkedlistdesign;

public class LinkedList<E> {
	int count=0;
	public static  Node head;
	public static  Node tail;
	
	public static class Node<E> {
	    E data;
		Node next;
		Node prev;
		
	   public Node() {
		   
	   }
	    public Node(E data) {
	    	this.data=data;
	    	this.prev=null;
	    	this.next=null;
	   
	    }

	}
	
	boolean add (E data) {
		Node<E> newNode= new Node<E>(data);
		if(count==0) {
			head=tail=newNode;
			count++;
		}
		else {
			tail.next=newNode;
			newNode.prev=tail;
			tail=newNode;
			}
		count++;
		
		return true;
	}
	
	@Override
	public String toString() {
	    String op = "[ ";
	    Node<E> current = head;

	    while (current != null) {
	        op = op + current.data + " ";  
	        current = current.next;
	    }

	    op = op + "]";
	    return op;
	}

	
	
	
	
	
	
	
	

}
