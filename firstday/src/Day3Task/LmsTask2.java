package Day3Task;

import java.util.Arrays;

public class LmsTask2 {

public static void main(String args[]) { //raja,24,raja@gmail.com,8686305050	
	
String var1 = args[0];	
String [] var2 = var1.split(",");//["raja" "24" "raja@gmail.com" "8686305050"]

String var3 = var2[0];
int  num1 = Integer.parseInt(var2[1]);
int num2 = num1+100; 

System.out.println(var2[0]+" "+var2[1]+" "+var2[2]+" "+var2[3]);
System.out.println(num2);

		
	
}
}
