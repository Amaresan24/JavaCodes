package forloop2;

public class forlooptwo5 {
public static void main(String args[]) {
	
int [] num = {23, 45, 56, 67, 89, 67, 90, 200};
int max = num[0];
for(int i = 0; i<=num.length-1; i++) {
if(num[i]<max) {
 max = num[i];	

}	
}
System.out.println(max);
		
}
}
