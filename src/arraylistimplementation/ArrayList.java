package arraylistimplementation;



public class ArrayList<E> {
	int count=0;
	int initCap=ResizableArray.intialCap;
	Object ar[];
	
	
	ArrayList(){
		ar=new Object[initCap];
		
	}
    ArrayList(int intialCap){
    	if(intialCap>0) {
    		this.initCap=intialCap;
        	ar=new Object[initCap];
    	}
		
	}
    
    public boolean add(E o){
    	if(count<ar.length*ResizableArray.loadFactor) {
    		ar[count++]=o;
    		
    	}
    	else {
    		Object temp[]= new Object[ar.length*2];
    		for(int i=0;i<count;i++) {
    			temp[i]=ar[i];
    		}
    		temp[count++]=o;
    		ar=temp;
    		
    	}
    
    	return true;
    		
    	}
    
    
    public boolean add(int index,E o) {
    	if(index>=0 && index<=count) {
    		rightShift(index);
    		ar[index]=o;
    		count++;
    	}
    	else {
    		return false;
    	}
    	
    	
    	return true;
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
