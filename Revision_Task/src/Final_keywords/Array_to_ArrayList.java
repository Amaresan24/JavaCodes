package Final_keywords;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Array_to_ArrayList {

	//@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		///// create with out inBulid method ////////
		String[] array = { "Hai", "world", "kamal" };

		ArrayList<String> list = new ArrayList<>();

		for (String X : array) {
			list.add(X);
		}

		//System.out.println(list);
		
		

		/// create with inBulid method

		String[] array1 = { "Vijay", "kamla", "rajni" };

		List<String> list2 = Arrays.asList(array1);
		System.out.println(list2);
		
		 ///-------------------2 --------------
		
		List str = new ArrayList<>();
		Collections.addAll(str, array1);
		
		System.out.println(str);
		
		
		
		
	
		
		
		
		

	}
}