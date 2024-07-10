package funcations;

public class f3 {
public static void  main (String args[]) {
	
	
	Practices p1 = new Practices();
	System.out.println(p1.getVote(16));
	System.out.println(p1.findFactorial(4));
	}	
	
}

class Practices{
// find vote;	
public String  getVote(int age) {
	
	if(age >=18) {
		return "Eligiable";
	}else {
		return "Not Eligiable for Vote";
	}
}	
	
	// find factorial;
public int findFactorial(int num) {
	int fact = 1; 
	for(int i=1; i<=num; i++) {
		fact *=i;
		}
	return fact;
	
}


	
}
