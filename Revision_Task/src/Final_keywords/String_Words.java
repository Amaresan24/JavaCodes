package Final_keywords;

import java.util.Scanner;

public class String_Words {

	public static void main(String[] args) {

		Scanner sq = new Scanner(System.in);

		System.out.println("Please  Enter some Words a : ");

		// String Lateral create in string pool memory
		String a = sq.nextLine();
		System.out.println("Please  Enter some Words b  : ");

		// String object creating in Heap Memory
		String b = new String(sq.nextLine());

		System.out.println( "String Lateral : "+ a.hashCode());
		System.out.println( "String object creating : "  + b.hashCode());
		
	System.out.println(a == b );
	System.out.println(a.equals(b));
	
		// System.out.println("Given input : " + input);

	}

}
