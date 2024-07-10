package Day3Task;

public class LmsTask4 {
  public static void main(String args[]) { ///20,90,70,60,50,25
	  String num1 = args[0];
	 String [] arr = num1.split(","); //"20" "90" "70" "60" "50" "25"
	 int val1  = Integer.parseInt(arr[0]);
	 int val2  = Integer.parseInt(arr[1]);
	 int val3  = Integer.parseInt(arr[2]);
	 int val4  = Integer.parseInt(arr[3]);
	 int val5  = Integer.parseInt(arr[4]);
	 int val6  = Integer.parseInt(arr[5]);
	 int total = val1 + val2 + val3 + val4 + val5 + val6;
	 System.out.println(total);
	  
	  
  }
	
	
}
