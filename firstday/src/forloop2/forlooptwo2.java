package forloop2;

public class forlooptwo2 {
public static void main(String args[]) {
	
String [] arr = {"red", "yellow", "orange", "blue", "Grey","oven" , "spee", "gyfy","ttytyty"};	
int count = 0;

for(int i = 0; i<=arr.length-1; i++){
	
//int check = arr[i].length();	
	
if(arr[i].contains("a") || arr[i].contains("e") || arr[i].contains("i") || arr[i].contains("o") || arr[i].contains("u") ) {
	continue;
	}
else {
		
		count = count +1;
	}
}	
System.out.print(count);	
	
}

}

//if(arr[i].length() % 2 == 0) {
//System.out.println(arr[i]);	
//	
//}	
