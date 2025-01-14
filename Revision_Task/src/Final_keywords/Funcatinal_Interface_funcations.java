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

	}

}


