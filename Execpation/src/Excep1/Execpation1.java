package Excep1;

public class Execpation1 {
public static void main(String args[]) {
	                                               //// Arithmetic Exception
	
//System.out.println("Welcome our page");

try {
int a = 8;
int b = 0;
int result = a/b;
//System.out.println(result);
}catch(ArithmeticException ae) {
	//System.out.println(" error on this  output");
	//ae.printStackTrace();
	//System.out.println(ae.getMessage());
	
}



//System.out.println("Thank for your Code");
	
	
                                                            /// Number Pointer  Exception;	
	
	
//System.out.println("Welcome our page");
//
//try {
//String a = "hai1";
//int b = Integer.parseInt(a);
//
////String b = "";
////String result = a.concat(b);
//System.out.println(b);
//}
//catch(NumberFormatException ne) {
//	System.out.println(" error on this  output");
//	ne.printStackTrace();
//	System.out.println(ne.getMessage());
//	
//}
//
//
//
//System.out.println("Thank for your Code");



                                                                      /// Array out Bound Exception;

//System.out.println("Welcome our page");
//
//try {
//int a [] = {45 , 56, 78 , 78 ,89};
//
//
//System.out.println(a[8]);
//}
//catch(ArrayIndexOutOfBoundsException  ai) {
//	System.out.println(" error on this  output");
//	ai.printStackTrace();
//	System.out.println(ai.getMessage());
//	
//}
//System.out.println("Thank for your Code");



                                                                       /// String index Exception;


//System.out.println("Welcome our page");
//
//try {
//String  a = "OneSoft";
////char [] b = a.toCharArray();
//
//
//System.out.println(a.substring(0, 56));
//}
//catch(StringIndexOutOfBoundsException  si) {
//	System.out.println(" error on this  output");
//	si.printStackTrace();
//	System.out.println(si.getMessage());
//	
//}
//System.out.println("Thank for your Code");




                                                                      // Null pointer Exception


System.out.println("Welcome our page");

try {
String  a = null;
System.out.println(a.toUpperCase());
}
catch(NullPointerException  np) {
	System.out.println(" error on this  output");
	np.printStackTrace();
	System.out.println(np.getMessage());
	
}
System.out.println("Thank for your Code");

                                                        ///// ClassNotFoundException and using finally key Word

//
//try {  
//    Class.forName("NonExistentClass");  
//    
//}
//catch (ClassNotFoundException e) { 
//	System.out.println("Error on this class");
//    e.printStackTrace();  
//}  
//
//finally {
//	
//	System.out.println("Error Thorwing");
//	
//}
//
//System.out.println("hello");






}	
}







