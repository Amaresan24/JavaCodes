package Final_keywords;

public class OverAll_final_keyword {

	public static void main(String[] args) {
		
		
		FinalClass finalClass = new FinalClass();

		// Access the final variable and final method
		finalClass.display();

		// Trying to modify the final variable will result in a compilation error
		// finalClass.CONSTANT_VALUE = 200; // Uncommenting this line will cause a
		// compilation error

		// Final method cannot be overridden, so calling the method will work as
		// expected
		finalClass.display();

	}

}

final class FinalClass {
	// Final variable
	final int num = 100;

	// Final method
	public final void display() {
		System.out.println("This is a final method in a final class.");
		System.out.println("Value is : " + num);
	}
}
