package ArrayList_Funcation;
import java.util.*;

public class HashMap_fun {
public static void fun_Hash(HashMap<Integer,String>  num) {
	
	 for(Map.Entry m : num.entrySet()){    
		    System.out.println(m.getKey()+" "+m.getValue());    
		   } 
	 
}	
	
public static void main(String args[]){  
		   HashMap<Integer,String> arr =new HashMap<Integer,String>();//Creating HashMap    
		   arr.put(1,"Mango");  //Put elements in Map  
		   arr.put(2,"Apple");    
		   arr.put(3,"Banana");   
		   arr.put(4,"Grapes");   
		   arr.put(4,"Grapes");   
		       
		  // System.out.println("Iterating Hashmap...");  
		   
		   fun_Hash(arr);
		   
		   
		}  
}
