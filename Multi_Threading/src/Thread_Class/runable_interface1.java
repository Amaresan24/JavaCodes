package Thread_Class;

public class runable_interface1 {
	public static void main(String args[]) {
		
		//for (int i = 0; i < 4; i++) {
			Cake1 c = new Cake1();
			Thread th = new Thread(c);
			th.start();          /// Two Major Techniques doing process in multi-threading (1) thread class (2)
						        /// is runnable Interface
		//}
	}

}

class Cake1 implements Runnable {
	public void run() {
		System.out.println("Mixing  cake" + Thread.currentThread().getId());
		System.out.println("Baking Cake" + Thread.currentThread().getId());
		System.out.println("Decorating Cake " + Thread.currentThread().getId());
	}

}