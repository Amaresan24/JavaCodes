package forloop3;

public class for5 {
public static void main (String args[]) {
	
	
String name  = "this is my name and this is my house";

String [] name1 = name.split("");

for(int i = 0; i<name1.length; i++) {
	
	int count = 0;
	for(int j = i+1; j<name1.length; j++) {
		
		if(name1[i].equals(name1[j])) {
			count++;
			name1[i] = "$";
			
		}
		
	}
	
	if(count < 0 && name1[i] != "$") {
		System.out.println(name1[i]);
		
	}
	
}


	
	
	
}	

}
