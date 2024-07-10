package Thread_Class;

public class Thread_class {
	public static void main(String args[]) {
	
		for (int i = 0; i < 4; i++) {
			// c.run();
			Cake c = new Cake();
			c.start(); ///  -> start is used to doing parllel process in thread  is called in thread class.
		}

	}

}

class Cake extends Thread {
	public void run() {

		System.out.println("Mixing  cake" + Cake.currentThread().getId());
		System.out.println("Baking Cake" + Cake.currentThread().getId());
		System.out.println("Decorating Cake " + Cake.currentThread().getId());
	}
}