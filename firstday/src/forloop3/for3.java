package forloop3;

public class for3 {
public static void main (String args[]) {
	
String  name = "pineApple  ";
int count = 0;

char [] arr = name .toCharArray();
for(int i = 0; i<arr.length; i++) {
	if(arr[i] == 'e' ||arr[i] == 'E' ) {
		
		count = count +1;
	}
	
	
	
}
	
	
	System.out.println(count);
	
}	
	

}
