package firstday1;

public class TaxCaluation {
	
	public static void main (String args[]) {
		
		
/// Find Net Price Amount ???
		int Price = 3400;
		float TaxAmount = 25.5f;
       int NetPrice = (int) (Price + TaxAmount);
       System.out.println(NetPrice);
       
///   Find NetPrice Discount Amount ???
       
       int DisCountAmount = 79;
       int DisCountNetPrice = (int) (Price + DisCountAmount);
       System.out.println(DisCountNetPrice);
       
         
/// Find Tax PerCentage ??
       
      int TaxPercentage = 25;
      int Iamount = (int) (Price * TaxPercentage/100);
      System.out.println(Iamount);
      
      
///   Find Discount Percentage ??
      
      
      int DisCountPercentage = 45;
      int Discount = (int) (Price * DisCountPercentage/100);
      System.out.println(Discount);
       
       
 }
	
}
