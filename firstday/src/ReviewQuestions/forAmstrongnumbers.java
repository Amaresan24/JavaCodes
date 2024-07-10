package ReviewQuestions;

public class forAmstrongnumbers {
public static void main(String args[]) {
	Amstrong a1 = new Amstrong();
	a1.getAmstrong(100, 500);
	
	
	
}	
}
class Amstrong {
	
public void getAmstrong(int a , int b) {
	for(int i = a; i<b;  i++) {
		int num = i;
		int original = num;
         int temp = 0;
         int result = 0;
         
 for( ; num>0 ;) {
	 temp = num % 10;
	 result = result+(temp * temp * temp);
	 num  = num /10;
	 } 
 
 if(result == original) {
	 System.out.println("Amstrongs numbers are = " + result);
 }
		
		
		
	}
	
	
	
}	
	
	
}
