package forloop3;

public class whilepalindrom {
public static void main (String args[]) {
	int num = 161; 
	int original = num;
	int result = 0;
	
	
while (num > 0) {
	int a = num % 10;
    result = (result * 10 ) + a;
    num = num / 10;
	}
if(result == original) {
	System.out.println("this Palindrom");
	
}else {
	
	System.out.println("this not Palindrom");
	
}

	
	
	
	
	
	
}	
	
	

}
