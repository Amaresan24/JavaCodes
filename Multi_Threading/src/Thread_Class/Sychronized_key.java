package Thread_Class;

public class Sychronized_key {
	public static void main(String args[]) {
		CakeCounter counter = new CakeCounter();
		Thread team1 = new Thread(new Team(counter));
		Thread team2 = new Thread(new Team(counter));

		team1.start(); /// there are starting multi - threading //
		team2.start();   /// there are starting multi - threading //

		try {
			team1.join(); // two  team are joining  that  time is used in syc keyword
			team2.join();  // two  team are joining  that  time is used in syc keyword
		} catch (Exception E) {

		}

		System.out.println(counter.cakeCount);
	}
}

class CakeCounter {
	int cakeCount = 0;

	public void increment() {
		cakeCount++;
	}

}

//// when come shared variable that is used syc keyword
class Team implements Runnable {
	CakeCounter counter;

	Team(CakeCounter counter) {
		this.counter = counter;
	}

	public void run() {
		for (int i = 0; i < 1000; i++) {
			counter.increment();
		}
	}
}