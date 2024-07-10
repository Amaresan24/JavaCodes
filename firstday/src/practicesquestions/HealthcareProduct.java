package practicesquestions;

public class HealthcareProduct {
public static void main(String args[]) {

//15. Healthcare Product Class Program
//   - Create a Java class named `HealthcareProduct`.
//   - Declare variables `name`, `category`, `price`, and `isNatural`.
//   - Write a main method to create three instances of `HealthcareProduct`.
//   - Assign values to the attributes of each healthcare product and print out their details.
	
	HealthcareProducts product1 = new HealthcareProducts();
	product1.name= "Hair oil";
	product1.category = "liquid";
	product1.price = 45;
	product1.isNatural = true;
	
	HealthcareProducts product2 = new HealthcareProducts();
	product2.name= "Face Wash";
	product2.category = "Creamy";
	product2.price = 145;
	product2.isNatural = false;
	
	HealthcareProducts product3 = new HealthcareProducts();
	product3.name= "powder";
	product3.category = "Solid";
	product3.price = 245;
	product3.isNatural = true;
	
System.out.println("HealthcareProducts1="+product1.name+","+product1.category+","+product1.price+", "+product1.isNatural);	
System.out.println("HealthcareProducts2="+product2.name+","+product2.category+","+product2.price+", "+product2.isNatural);	
System.out.println("HealthcareProducts3="+product3.name+","+product3.category+","+product3.price+", "+product3.isNatural);	
	
	
}

}
class HealthcareProducts{
	String name;
    String category;
    int price;
    boolean isNatural;
	
}