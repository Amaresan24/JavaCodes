package oops2;

public class multilevel {
public static void main(String args[]) {
	
	
	
	SoftWare s = new SoftWare();
	s.name = "vijay";
	s.age = 25;
	s.collageName = "NIT";
	s.phone = 75655623557L;
	s.address = "Chennai";
	
	System.out.println(s.phone);
	
	
	
	
}	
	

}

class Human1 {
	String name;
	int age; 
	}
class Engineer extends Human1 {
	long phone;
	String collageName;
}
class SoftWare extends Engineer {
	int id;
    String address;
	
	
}
