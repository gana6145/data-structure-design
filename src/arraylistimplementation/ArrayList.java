package arraylistimplementation;

import java.util.Arrays;

public class ArrayList {
	int count=0;
	int initCap=ResizableArray.intialCap;
	Object ar[];
	
	
	ArrayList(){
		ar=new Object[initCap];
		
	}
    ArrayList(int intialCap){
    	this.initCap=intialCap;
    	ar=new Object[initCap];
		
	}
    
    public boolean add(Object o){
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
    
    
    
     @Override
    public String toString() {
		return Arrays.toString(ar);
    	
    }
    	

}
