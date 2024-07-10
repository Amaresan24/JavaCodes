package practicesquestions;

public class ques4 {
public static void main(String args[]) {
///3. 4. Write a Java program to check if a given number is a prime number or not.

	
	int num = 6;
    boolean isPrime = isPrimeNumber(num);

     if (isPrime) {
         System.out.println(num + " is a prime number.");
     } else {
         System.out.println(num + " is not a prime number.");
     }
 }
 
 public static boolean isPrimeNumber(int n) {
     if (n <= 1) {
         return false; // Numbers less than or equal to 1 are not prime
     }
     
     // Iterate from 2 to the square root of the number
     for (int i = 2; i * i <= n; i++) {
         if (n % i == 0) {
             return false; // If the number is divisible by any number in this range, it's not prime
         }
     }
     
     return true; // If no number divides the given number evenly, then it's prime


 }


}

