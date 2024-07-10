package funcations;

public class fabseriesf7 {
public static void main(String args[]) {
	
	Series s1 = new Series();
	s1.getFab(15);
	
	
	
	
}	

}

class Series {
	
	public void getFab(int num) {
		int first = 0; 
		int second = 1;
	    int total = 0; 
	    System.out.print(first +" "+ second + " ");
	    
	   for(int i=2; i<=num; i++) {
		     total = first + second;
		     
		 System.out.print(total + " ");
		 
		     first = second;
		     second = total;
		 
		    
		 
	   } 
	  
		
	}
	
	
}