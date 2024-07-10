package Excep1;

public class Multiple_catch {

	public static void main(String args[]) {

		String str = null;

		try {
			System.out.println(str.toUpperCase());

		} catch (ArithmeticException a) {
			System.out.println("This is Arthimetic pointer Exception ");
			// a.printStackTrace();
		} catch (NullPointerException n) {
			System.out.println("This is Null  pointer Exception ");

		} catch (Exception e) {
			System.out.println("Somthing pointer Exception");
		}

	}

}
