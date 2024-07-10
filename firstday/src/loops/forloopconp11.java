package loops;

public class forloopconp11 {
public static void main(String args[]) {
int num = 6;
boolean isPrime = true;

for(int i = 2;i<num ; i++ ) {
	if(num % i == 0) {
// condition will true change As false;
		
    isPrime = false;
    
	}
}
if(isPrime == true) {	
	System.out.println("Given Number is Prime");
}
else {
	System.out.println("Given Number is Not Prime");
}	
	
	
}
}
