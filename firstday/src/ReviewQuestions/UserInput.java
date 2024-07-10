package ReviewQuestions;
import  java.util.Scanner;
public class UserInput {
public static void main(String args[]){
	
Scanner UserInput = new Scanner(System.in);
System.out.println(" 'Enter your Name' " +" 'age' "+" 'Phone Number' "+" 'DOB' ");
String name = UserInput.nextLine();
int value = UserInput.nextInt();
long Number = UserInput.nextLong();

System.out.println("Your name is = " +name);
System.out.println("Your Age is =" + value);
System.out.println("Your phoneNumber is =" + Number);
	
	
	
}	
}
