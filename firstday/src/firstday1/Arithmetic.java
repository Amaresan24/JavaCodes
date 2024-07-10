package firstday1;

public class Arithmetic {
	public static void main(String args[]) {
		
	/// Arithmetic Operations ----------------------1	
		
		///Add
		int num1 = 34;
		int num2 = 37;
        //String Total = num1+num2;
		System.out.println(num1+num2);
		
	   // Sub 
		int num3 = 34;
		int num4 = 37;
		System.out.println(num3-num4);
		
		// multiply
		int num5 = 34;
		int num6 = 37;
		System.out.println(num5*num6);
		// Divide
		int num7 = 34;
		int num8 = 37;
		System.out.println(num7/num8);
		
		// modules
		int num9 = 34;
		int num10 = 7;
		System.out.println(num9%num10);
		
		
		/// Relational operators-------------------------------2
		
		
        /// Greather then
		int numb1 = 34;
		int numb2 = 7;
		System.out.println(numb1 > numb2);
		
	          /// Lesserthen
				int numb3 = 34;
				int numb4 = 7;
				System.out.println(numb3 < numb4);
				
				/// Greaterthen 0r Equal
				int numb5 = 34;
				int numb6 = 7;
				System.out.println(numb5 >= numb6);
				
				/// Lesserthen or Equal
				int numb7 = 34;
				int numb8 = 7;
				System.out.println(numb7 <= numb8);
				
				/// Equalarthen
				int numb9 = 34;
				int numb10 = 7;
				System.out.println(numb9 == numb10);
				
				/// Not Equal
				int numb11 = 34;
				int numb12 = 7;
				System.out.println(numb11 != numb12);
				
				
				/// Logical operators------------------------------3
				
				/// AND operator
				int numbe1 = 34;
				int numbe2 = 7;
				System.out.println(numbe1 & numbe2);
				
				/// OR Operator
				int numbe3 = 34;
				int numbe4 = 7;
				System.out.println(numbe3 | numbe4);
				
/// Find Net Price Amount ???-------------------------------------------------------------------------------
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
		       
		      
		      FinalResult  TotalMark = new FinalResult();
		      TotalMark.TamilMark    = 96;
		      TotalMark.EnglishMark  = 78;
		      TotalMark.MathsMark    = 67;
		      TotalMark.ScienceMark  = 100;
		      TotalMark.SocialMark   = 100;
		      int Finalmark = (TotalMark.TamilMark + TotalMark.EnglishMark + TotalMark.MathsMark + TotalMark.ScienceMark + TotalMark.SocialMark);
	          TotalMark.Result = true;
	          System.out.println(Finalmark);
	          System.out.println(TotalMark.Result);
	}

}

class FinalResult {
	int      TamilMark;
	int      EnglishMark;;
	int      MathsMark;
	int      ScienceMark;
	int      SocialMark;
	int      FinalMark;
	boolean  Result;
}
