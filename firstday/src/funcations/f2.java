package funcations;

public class f2 {
public static void main (String arg[]) {
	
	
Addition a1 = new Addition();
	
	System.out.println(a1.add1());
	System.out.println(a1.add2(23,56));
	  a1.add3();
	  a1.add4( 34 , 67);
	  
	 /// subraction
	  
	  System.out.println( "Subration in parameter"+a1.sub1(34 , 56));
	  a1.sub2(34 , 67);
	  a1.sub3();

   // multi
	  
	  System.out.println( "Multiply for in parameter"+a1.multi1(45, 77));
	  a1.multi2(45, 67);
	
	// division
	  
	  System.out.println("division for in parameter"+a1.divi1(45, 56));
	  a1.divi2(78, 90);  
	  
}	
}


class Addition {
int val1 = 23;
int val2 = 45;

public int  add1() {
	return val1+val2;
} 
	
public int add2(int a , int b) {
	return a+b;
}	

public  void  add3() {
	System.out.println(val1 + val2);
	}
public void add4 (int a , int b) {
System.out.println(a+b);
}

/// subration 
public int sub1( int a , int b) {
	return  a-b;
}
public void sub2(int a , int b) {
	System.out.println(a-b+" subraction in parseing parameter");
}
public void sub3() {
	System.out.println(val1 - val2+" subration in void declare numbers");
	
}

/// multiply
public int multi1(int a , int b) {
	return a*b;
}

public void multi2(int a , int b) {
	
System.out.println( a*b + " multiply in parseing parameter");	
}

// division

public int divi1(int a , int b) {
	return a/b;
	
}

public void divi2(int a , int b) {
	
	System.out.println(a/b +"Multiply for in void  parameter");
	
}
}