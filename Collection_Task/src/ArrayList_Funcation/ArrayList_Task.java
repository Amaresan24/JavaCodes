package ArrayList_Funcation;
import java.util.*;
public class ArrayList_Task {
	
public static void fun_Array(ArrayList<String> str) {

//	for(String X : str) {
//		System.out.println(X);
//		
//	}

str.forEach(System.out::println);
	
}	
	
public static void main(String args[]) {
ArrayList<String> names = new ArrayList<>();

names.add("Ajith");
names.add("Rajani");
names.add("kamal");
names.add("Sethupathi");


fun_Array(names);
	
}	
}
