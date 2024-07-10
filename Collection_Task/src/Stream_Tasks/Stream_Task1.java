package Stream_Tasks;
import  java.util.*;
import java.util.stream.Collectors;

public class Stream_Task1 {
public static void main(String args[]) {
ArrayList<String> str = new ArrayList<>();

str.add("java");
str.add("python");
str.add("Html");
str.add("JavaScript");
str.add("Angular");
		
///----------------------------------------------filter ----------------------------		
List<String> arr = str.stream().filter(X -> X.startsWith("p")).collect(Collectors.toList());
//arr.forEach(System.out::println);		
///----------------------------------------------filter ----------------------------	

/// ----------------------------------------------sorted	-----------------

List<Integer> mark=Arrays.asList(40,35,65,19,75,85,30,24,47);
 
	//mark.stream().sorted((a,b) -> b-a).limit(3).skip(2).forEach(System.out::println);	
	
List<String> name=Arrays.asList("rajesh", "hemant", "debarjit", "srinivas","ziya" , "aaaaaaaaaaaa" , "zxgfdgfs" , "hi");
///  ----------------------------ato Aplhapatical order --------------

	//List<String> name_sort = name.stream().sorted((a,b) -> b.compareTo(a)).collect(Collectors.toList());

 /// -------------------------------Compare to  String length Wise --------------  way -----------1

	List<String> sortedString = name.stream().sorted((a,b)->Integer.compare(a.length(),b.length())).collect(Collectors.toList()); 
	//System.out.println(sortedString);
	
	 /// -------------------------------Compare to  String length Wise --------------  way -----------2
	
	List<String> sortedString1 = name.stream().sorted(Comparator.comparingInt(String :: length)).collect(Collectors.toList());
	//System.out.println(sortedString1);
	

///////////////    Compare  Max Number in given Array -------------------
	
List<Integer> list = Arrays.asList(10,20,50,54,12,11,94);
	Integer min = list.stream().min((a,b)->Integer.compare(a,b)).get();
	 Integer max= list.stream().max((a,b)->Integer.compare(a,b)).get();
	 
	// System.out.println( "Minimum Number = "+ min + " " +"Maxmimum  Number = "+ max);


	  
	  String var = "automobileeyyyyy11111";
	  Map<Character,Long> each = var.chars()
			.mapToObj(C ->(char) C)
			  .collect(Collectors.groupingBy( X -> X, Collectors.counting())); 
	  
	  each.entrySet().stream().filter(X -> X.getValue() >  1).map(Y -> Y.getKey()).forEach(G -> System.out.print( " ->  "+ G));
	  
	 
	 
	 
	  
	  
}

}
