package arraylistimplementation;



public class ArrayList<E> {
	private int count=0;
	int initCap=ResizableArray.intialCap;
	Object ar[];
	
	
	public ArrayList(){
		ar=new Object[initCap];
		
	}
    ArrayList(int intialCap){
    	if(intialCap>0) {
    		this.initCap=intialCap;
        	ar=new Object[initCap];
    	}
    	else {
    		throw new WrongIntialCapacity("enter a positive number");
    	}
		
	}
     
    
    private void resize() {
    	Object temp[]= new Object[ar.length*2];
    	for(int i=0;i<count;i++) {
			temp[i]=ar[i];
		}
    	ar=temp;
    }
    public boolean add(E o){
    	if(count>=ar.length*ResizableArray.loadFactor) {
    		resize();
    		}
    	ar[count++]=o;
    	return true;
    		
    	}
    
    
    public boolean add(int index,E o) {
    	if(index>=0 && index<=count) {
    	 if(count>=ar.length*ResizableArray.loadFactor) {
        		resize();
          }
    		rightShift(index);
    		ar[index]=o;
    		count++;
    	}
    	else {
    		return false;
    	}
    	return true;
    	}
    
    public boolean set(int index, E o) {
    	if(index>=0 && index<count) {
    		ar[index]=o;
    		return true;
    	}
		return false;
    	
    }
    public boolean clear() {
    	for(int i=0;i<count;i++) {
    		ar[i]=null;
    		
    	}
    	count=0;
    	return true;
    }
    
    public int indexOf(E o) {
    	for(int i=0;i<count;i++) {
    		if(ar[i]==o) {
    			return i;
    		}
    	}
    	return -1;
    }
    
    
    
    public boolean remove(int index) {
    	if(index<count && index>=0) {
    		leftShift(index);
    		return true;
    	}
    	else {
    		return false;
    	}
    	
   }
    public boolean rightShift(int index) {
    	
    	for(int i=count-1;i>=index;i--) {
    		
    		ar[i+1]=ar[i];
    		
    		}
    	return true;
    	
    }
     public boolean leftShift(int index) {
    	
    	if(index>=0 && index<count) {
    		for(int i=index;i<count-1;i++) {
        		
        		ar[i]=ar[i+1];
        		
        		}
        	ar[count-1]=null;
        	count--;
        	
    	}
    	else {
    		return false;
    	}
    	return true;
    	
    }
    
     public boolean isEmpty() {
    	 return count==0;
     }
     
     
     public int size() {
    	 return count;
     }
    
    
     @Override
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
     
     public  E get(int index) {
    	 if(index>=0 && index <count) {
    		 return (E) ar[index]; 
    	 }
    	 else return null;
     }
    	

}
