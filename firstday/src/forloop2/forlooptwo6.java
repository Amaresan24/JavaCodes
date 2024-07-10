package forloop2;

public class forlooptwo6 {
public static void main(String args[]) {
	
String [] arr = {"ol","red", "yellow", "orange", "blue", "Grey","oven" , "spee", "Education","Engineering"};

String max = arr[0];
String min = arr[0];

for(int i = 0; i<=arr.length-1; i++) {
	
if(arr[i].length() > max.length()) {
	   
   max = arr[i];
}else if(arr[i].length() < min.length()) {
	min = arr[i];
	
}	
}

//for(int i = 0; i<=arr.length-1; i++) {
//if(arr[i].length() < min.length()) {
//   min = arr[i];
//}	
//}
	
System.out.println("Given String Maxmimum value = "+ max);
System.out.println("Given String Minimum value  = "+ min);
	
}

}
