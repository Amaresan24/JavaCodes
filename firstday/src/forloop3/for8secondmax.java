package forloop3;

public class for8secondmax {
public static void main(String args[]) {
	
int [] value =  {67, 91, 45, 34, 78, 90};
int max = value[0];
int secMax = max;

for(int i=0; i<value.length; i++) {
	if(value[i] > max ) {
		secMax = max;
	    max = value[i];
}
	
	 if(value[i] > secMax && value[i] != max) {
       secMax = value[i];
	}
	
}
     System.out.println(max);
	System.out.println(secMax);
	
	
	
}
}
