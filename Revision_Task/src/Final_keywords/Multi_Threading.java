package Final_keywords;

public class Multi_Threading {

	public static void main(String[] args) {
		
		
/////-----------using class -------------
		
//		MultiThreading obj = new MultiThreading();
//		obj.start();

		
		
		//// -----------------Using Interface --------------

		MultiThreading1 obj = new MultiThreading1();
		Thread ob = new Thread(obj);
		ob.start();

	}

}




//// ------------------------------------< class >--------------//
//class MultiThreading extends Thread {
//
//	public void run() {
//		System.out.println("Iam  a super class  threading Runnig");
//	}
//}

/// ----------------------------------------< Interface>-------------------//

class MultiThreading1 implements Runnable {
	public void run() {
		System.out.println("Iam  a Interface  threading Runnig");
	}

}
