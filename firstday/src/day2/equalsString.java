package day2;

public class equalsString {
	
	
	public static void main(String args[]) {
		
// equals-------------------------------1		
////   use to  check equals  on String
///    Case Sensitive
		
		String a = "COMPUTER";
	   boolean b = a.equals("COMPUTER");
	   System.out.println(b);
	   
 // equalsIgnoreCase-------------------------2
 // use to ignore the case sensitive.
	   
	   String c = "mouse";
	   String d = "MOUSE";
	   boolean e = c.equalsIgnoreCase(d);
	   System.out.println(e);
	   
 /// startswith()----------------------3
  // use to Check String Starting or Not.
 // Checking in Forward Method
  /// Case Sensitive.	   
	   
	   String f = "Keyboard";
	   String g = "keyb";
	   boolean h = f.startsWith(g);
	   System.out.println(h);
	   
/// endsWith()-----------------------4
// use to check string in Ends of the String.	   
/// Case Sensitive.
// Checking in Forward method.	   
	   
String i = "printer";
String j = "ter";
boolean k = i.endsWith(j);
System.out.println(k);


///contains()----------------5
// use to check String Have or not 
//Case Sensitive
//Forward Method.


String l = "waterbottle";
String m = "ter";
boolean n = l.contains(m);
System.out.println(n);
	  
	   
}

}
