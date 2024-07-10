package Excep1;

public class costmExecp {
	public static void main(String args[]) throws AgeExcepation {

//System.out.println("Hello Voters");

//    int age = 12;
//	
//	if(age > 18) {
//      System.out.println("Eligiable for Voters");
//}else {
//	
//	throw new AgeExcepation("Your Not Eligiable for Voting!!!");
//	
//}


		int age = 12;

		try {

			// if(age > 18) {
			System.out.println(age / 0);

//		else {
//		
//		throw new AgeExcepation("Your Not Eligiable for Voting!!!");
//		
//	}

		} catch (Exception e) {
			// System.out.println(e.getMessage());;
			System.out.println("This Error Code ");

			// e.printStackTrace();
			// System.out.println(e.getMessage());
		}

	}

}
