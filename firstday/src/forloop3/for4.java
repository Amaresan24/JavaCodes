package forloop3;

public class for4 {
public static void main (String args[]) {
	
String name  = "banana";
char [] arr = name.toCharArray();

for(int i = 0; i<arr.length; i++) {
	int count = 0;
// using to check arr one by one letter 
	
for(int j = i+1; j<arr.length; j++) {
	if(arr[i] == arr[j]) {
		count++;
		arr[j] = '@';
		
	}
	
}	

if(count == 0 && arr[i] != '@') {
	
	System.out.println(arr[i]+"="+ count);
}
}




}	

}
