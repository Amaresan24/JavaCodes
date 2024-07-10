package forloop3;

public class whileAmstrong {
public static void main(String args[]) {
	
int num = 153;
int original = num ;
int result = 0; 
int temp = 0;

while (num >0) {
	
	int a = num % 10;
	temp = a * a * a;
	result = result + temp;
	num = num /10;
}
	if( result == original) {
		
		
		System.out.println("Given number is AmStrong");
		
	}else {
		
		System.out.println("Given number is  Not AmStrong");
		
	}
	
	
	
	
	
	
	
	
}	

}
