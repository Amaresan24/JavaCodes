package ReviewQuestions;

public class PrimeNumberfor3 {
public static void main (String args[]) {
	
	/// input name = java;
    // output = va;
	
	Letter v1 = new Letter();
	v1.Checkprime(70);
	
	
}

}

class Letter {
	public void Checkprime(int num) {
	for(int i=1; i<num; i++) {
		int	isPrime = 0;
		for(int j=2; j<i; j++) {
			if(i % 2 == 0) {
				isPrime++;
	}
			
		}
		
		if(isPrime == 0){
			System.out.println(i);
		}
		
		
	}
		
		
	}
	
	
	
}
