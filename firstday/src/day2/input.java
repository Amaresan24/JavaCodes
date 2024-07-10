package day2;

import java.util.Scanner;
// import for to buy input from user
public class input {
public static void main(String args[]) {
	
Scanner val = new Scanner(System.in);
// create object get input from user
String  check = val.nextLine();
//  user give input is String that why nextline().

if(check.equals("dead")) {
	
	System.out.println("Surya meets Ramya");
	
}	
else {
	
	System.out.println("Surya weds meghna");
}
	
}
}
