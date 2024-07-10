package Final_keywords;

public class Final_Words {
	
	/// using final words
	
	public void finalize() {  /// -----------------------> finalize method
		
		System.out.println("collected");
		
	}
	
public static void main(String args[]) {
		
//	Final_Words s1 = new Final_Words();
	final int age = 18;//-------------------------------------1
   // age = 15;  -----> cannot  be override  major difference b/w static 
	
	
//	finally {// ---------------2
//		
//		System.out.println("it is used to try and catch ");
//	}
	
//System.out.println(age);
	
	Final_Words s1 = new Final_Words();
	System.out.println(s1.hashCode());
	s1 = new Final_Words();
	System.out.println(s1.hashCode());
	System.gc();
	
	
	
		
}
}
