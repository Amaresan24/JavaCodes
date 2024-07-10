package ReviewQuestions;

public class ques3 {
public static void main(String args[]) {
	
	
Prime p1 = new Prime();
p1.checkprime(10);
	
}	
	

}

class Prime{
	
public void  checkprime(int num) {
boolean isPrime = true;
	for(int i=2; i<num; i++) {
		if(num % 2 == 0) {
			isPrime = false;
		//System.out.println(i);	
			
		}
		
		if( isPrime == true){
			
		System.out.println(i);		
		}
		
}	
	

}
}	
	


	

