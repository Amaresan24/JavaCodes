package oops2;

public class single {
public static void main(String args[]) {
	
	Teacher t = new Teacher();
	t.name = "bharath";
	t.age = 56;
	t.isMale = true;
	t.country = "India";
//float n= t.getTempature(69.8f);
	
	
	System.out.println(t.isMale);
	System.out.println(t.country);
	//System.out.println(n);
	
	
}
}

class Human {
	String name;
    String country;
	
    
//public float getTempature(float a) {
	//return a;
	
//}    
    
	}

class Teacher extends Human {
	
	boolean isMale;
	int age;
}
