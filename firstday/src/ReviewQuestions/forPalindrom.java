package ReviewQuestions;

public class forPalindrom {
public static void main(String args[]) {
palindrom v1 = new palindrom(); 	
	v1.getPalindrom(100, 200);

}	
}
class palindrom {
public void getPalindrom( int a ,int b){
for(int i = a; i<=b; i++) {
	int num = i; 
	int original = num; 
	int result = 0;
	
for(;num>0 ;) {
	
	int temp = num%10;
	result = (result * 10) + temp;
	num = num/10;
	}

if(result == original) {
	System.out.println("palnidrom Numbers are = " + result);
	//continue;
}else {
	
	//System.out.println(" non palnidrom Numbers are = " + result);
	
}
	
}	
}	
	}