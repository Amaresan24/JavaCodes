package practicesquestions;

public class ques8 {
	 public static void main(String[] args) {
	       // int n = 10; // Number of terms
	        int first = 0; 
	        int second = 1;
	        int total = 0;
System.out.println(first);
System.out.println(second);

for (int i = 0; i <= 10; i++) {
	  total = first + second;
	   first = second;
	   second = total;
	            
System.out.print(total +" ");
	       }

	    }
}
