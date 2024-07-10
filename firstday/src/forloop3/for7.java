package forloop3;

public class for7 {
public static void main(String args[]) {
	
	
	for(int i = 20; i<100; i++) {
		boolean isPrime = true;
		
	for(int j =2; j<i; j++ ) {
		if(i % j == 0) {
			isPrime = false;
		}
		
		
		
	}	
		
		if(isPrime == true) {
			System.out.println(i);
			
		}
		
	}
	
	
	
}	
	
	

}
