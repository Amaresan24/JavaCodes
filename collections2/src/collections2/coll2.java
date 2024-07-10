package collections2;
import java.util.HashMap;
public class coll2 {
	

	
public static void main(String args[]) {
	
	
	HashMap<Integer,String> lms = new HashMap<>();
	lms.put(689, "Amaresh");
	lms.put(589, "vijsy");
	lms.put(289, "kamesh");
	lms.put(189, "Suresh");
   //lms.put(null, "karin");
	lms.put(889, "priya");
	lms.put(389, "mari");
	
	
//for(Integer x : lms.keySet()) {
	//if(x % 5 == 0) {
//System.out.println(x);
	//}
	
	
	
	
//}	

for(String y : lms.values()) {
	System.out.println(y);
}
	
for(Integer K : lms.keySet()) {
//System.out.println(K +" "+ lms.get(K));
}	
	
	



// for Each
//lms.forEach((a , b) -> System.out.println(a+" "+ b));
//lms.keySet().forEach(g -> System.out.println(g));
//lms.values().forEach(s -> System.out.println(s));



/// create new hashMap.


//HashMap<Integer,String> student1 = new HashMap<>();
//
//for(Integer g : lms.keySet()) {
//if(lms.get(g).endsWith("a")) {
//student1.put( g, lms.get(g));
//		}
//	}
//
//for(Integer d : student1.keySet()) {
//	System.out.println(d +" "+ student1.get(d));
//	
//}	
//


}
}
