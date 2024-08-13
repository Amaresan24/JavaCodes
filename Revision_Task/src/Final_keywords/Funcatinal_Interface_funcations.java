package Final_keywords;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Funcatinal_Interface_funcations {

	public static void main(String[] args) {

		/// -------------------functions ---------------------------------1

		Function<String, Integer> stringToInteger = Integer::valueOf;
		System.out.println("String to Integer: " + stringToInteger.apply("5432"));

		/// -------------------- Predicate --------------------------------2

		Predicate<Integer> isPositive = num -> num > 0;
		System.out.println("Is 5 positive? " + isPositive.test(5));
		System.out.println("Is -5 positive? " + isPositive.test(-5));

		/// ---------------------- Consumer--------------------------------3

		Consumer<String> printMessage = System.out::println;
		printMessage.accept("Hello, World!");

		/// -----------------------Supplier---------------------------------4

		Supplier<String> messageSupplier = () -> "Hello from Supplier!";
		System.out.println(messageSupplier.get());
		
		
////---------------------------------------------------------------------------///-----------------------------------
		
		// Predicate Example
		Predicate<Integer> isEven = (n) -> n % 2 == 0;
		System.out.println("4 is even: " + isEven.test(4)); // Output: true
		System.out.println("5 is even: " + isEven.test(5)); // Output: false

		// Function Example
		Function<Integer, Integer> square = (n) -> n * n;
		System.out.println("Square of 5: " + square.apply(5)); // Output: 25
		System.out.println("Square of 7: " + square.apply(7)); // Output: 49

		// Consumer Example
		Consumer<String> printMessage1 = (message) -> System.out.println("Message: " + message);
		printMessage1.accept("Hello, World!"); // Output: Message: Hello, World!
		printMessage1.accept("Java is fun!"); // Output: Message: Java is fun!

		// Supplier Example
		Supplier<Double> randomNumber = () -> Math.random();
		System.out.println("Random number: " + randomNumber.get()); // Output: Random number
		System.out.println("Random number: " + randomNumber.get()); // Output: Random number
	}

}
