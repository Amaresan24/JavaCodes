
package practicesquestions;

import java.util.Scanner; 

public class PalindromeChecking {
public static void main(String args[]) {
	
	 Scanner input1 = new Scanner(System.in);  
    String name = input1.nextLine();
	
	//String name = "mam";
    
	String reserveName = "" ;
	for(int i=name.length()-1; i>=0; i--) {
		reserveName = reserveName+name.charAt(i);
		}
	if(name.equals(reserveName)) {
	System.out.println("Given name is Palindrom");
}	else {
	System.out.println("Not a palindrom");
	
}
}
	
}	
	
	



