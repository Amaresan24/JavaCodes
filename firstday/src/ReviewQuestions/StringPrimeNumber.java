package ReviewQuestions;
import  java.util.Scanner;
public class StringPrimeNumber {
public static void main(String args[]) {	
	Scanner userInput = new Scanner(System.in);
	int num =  userInput.nextInt();
//int num = 7; 
int prime = 0; 
for(int i = 2; i<num; i++) {
	if(num % i == 0) {
		prime++;
		}
}
if(prime == 0) {
System.out.println("Given number is prime = " + num );
	
}else if(num == 0) {
	System.out.println("invalid Number =  "+ num);	
}
else {
System.out.println("Given number is Not Prime  = " + num);
}
}
}
