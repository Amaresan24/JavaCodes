package day4conditionsSwitchCase;

public class switchCase3 {
public static void main(String args[]) {

int time = 16;
	
if(time < 11) {
	System.out.println("Good Morning");
 }
else if(time < 17) {
	System.out.println("Good AfterNoon");
}
	else if (time < 21) {
	System.out.println("Good Evening");	
}
	
else if(time < 24) {
		System.out.println("Good Night");
		}
else {
	
	System.out.println("Invalid time");
}	
}
}

