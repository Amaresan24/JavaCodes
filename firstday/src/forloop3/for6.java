package forloop3;

public class for6 {
public static void main(String args[]) {
	
int [] value = {2, 4, 4, 7, 8, 6, 4, 2, 8, 3, 2, 6};	

for(int i = 0 ; i<value.length; i++) {
	int count = 0; 
	for(int j = i+1; j<value.length; j++) {
		if(value[i] + value[j] == 8) {
			count++;
			//value[i] = '#';
		System.out.println(value[i]+" "+ value[j]);	
		}
		
		
		
	}
	
	
	
}

	
	
	
	
	
}	
	
	

}
