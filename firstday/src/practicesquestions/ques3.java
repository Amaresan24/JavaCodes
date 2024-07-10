package practicesquestions;

public class ques3 {
	   public static void main(String[] args) {
		   
///3. Implement a Java program to find the factorial of a given number using recursion.
		   
	        int number = 10; // The number whose factorial we want to find
	        
	        // Calculate the factorial of the input number
	        long factorial = calculateFactorial(number);
	        
	        // Display the result
	        System.out.println("Factorial of " + number + " is: " + factorial);
	    }
	    
	    // Recursive method to calculate the factorial of a number
	    public static long calculateFactorial(int n) {
	        return n == 0 ? 1 : n * calculateFactorial(n - 1);
	    }
 
}

