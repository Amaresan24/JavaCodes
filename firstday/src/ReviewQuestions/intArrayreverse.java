package ReviewQuestions;

public class intArrayreverse {
public static void main(String args[]) {
	
	Reserve v1 = new Reserve();
	int [] val = {12, 34, 56, 67, 78, 45,67};
	v1.getReserve(val);
}	

}

class  Reserve {
public void getReserve(int[] num) {
	
//int [] temp ;
	int count = 0;
for(int i=num.length-1; i>0; i-- ){
 
	 //System.out.print(num[i] + " ");
	 if(num[i] % 2 == 0){
		System.out.print(num[i] + " ");
		 
		 //count++;
	
	 }
}
System.out.print(count);
	
}	
	
	
	
	
}