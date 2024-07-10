package Final_keywords;

public class Static_KeyWords {

	static int a = 10; /// -----------------> static variable used

	public static void getName() {/// --------------> method // =========> static Method

		System.out.println("Amaresh");

	}

	static {
		System.out.println("Iam is static"); /// --------------> executed before running main method is called static
												/// variable .
	}

	public static void main(String[] args) {

		Static_KeyWords.getName();/// -----------------> method calling

	}

}
