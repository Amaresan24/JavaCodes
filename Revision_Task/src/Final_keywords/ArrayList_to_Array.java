package Final_keywords;

import java.util.ArrayList;

public class ArrayList_to_Array {

	public static void main(String[] args) {

// <-----------------Using to with InBulid Method ----------------------->
		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add("Apple");
		arrayList.add("Banana");
		arrayList.add("Cherry");

		/////////-----------------------1---------------------------
		String[] array = new String[arrayList.size()];

		array = arrayList.toArray(array);

		for (String element : array) {
			System.out.println(element);
		}
///////-----------------------------------------2----------------------
		Object[] obj = arrayList.toArray();
		 for(Object X : obj) {
			 System.out.println(X);
		 }
		
		 int[] arr1 = arrayList.stream().mapToInt(b -> b).toArray();
		
		
		
		//<------------------------------------- Using to With Out InBulid Method------------------------------->

		ArrayList<String> arrayList1 = new ArrayList<>();
		arrayList1.add("suresh");
		arrayList1.add("Magesh");
		arrayList1.add("Grish");

		String[] array2 = new String[arrayList1.size()];

		for (int i = 0; i < arrayList1.size(); i++) {
			array2[i] = arrayList1.get(i);

		}

		for (String X : array2) {
			System.out.println(X);
		}

	}

}
