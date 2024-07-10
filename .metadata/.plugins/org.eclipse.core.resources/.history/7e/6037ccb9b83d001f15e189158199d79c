package java_1;
public class functional_Task1 {
public  static void main(String args[]) {
	
	
int [] val1 = {56, -9, 67, 34, 78, -8, 5, -5, 4};

Maths find = (val) -> {
	int count1 = 0; 
	int count2 = 0;
	for(int i = 0; i<val.length; i++) {
        if(val[i] > 0) {
			count1++;
			}else{
			count2++;
			}
	}
	System.out.println("postive Count = " + count1 );
	System.out.println("Negative Count = "+ count2);
	return count2;
};
	
find.Check(val1);




//minCheck.Check(val1);


}	
}
@FunctionalInterface
interface  Maths {
	public int Check(int[] a);
	
}

class minNumber {
public int findminNumber(int [] a) {
	int minNumber = a[0];
		for(int i = 0; i<a.length; i++) {
			if(a[i] < minNumber) {
				minNumber = a[i];
			}
			
			
		}
		
	return minNumber;
	
}
	
	
}
