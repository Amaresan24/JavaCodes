package practicesquestions;

public class FashionAccessories {
public static void main(String args[]) {
	
//	19. Fashion Accessories Class Program
//	   - Create a Java class named `FashionAccessories`.
//	   - Declare variables `type`, `brand`, `price`, and `isDesignerLabel`.
//	   - Write a main method to create three instances of `FashionAccessories`.
//	   - Assign values to the attributes of each fashion accessory and print out their details.
	
	Accessories item1 = new Accessories();
	item1.type = "Handbags";
	item1.brand = "Allen solly";
	item1.price = 4500;
	item1.isDesignerLabel = true;
	
	Accessories item2 = new Accessories();
	item2.type = "Belts";
	item2.brand = "Allen solly";
	item2.price = 1500;
	item2.isDesignerLabel = false;
	
	Accessories item3 = new Accessories();
	item3.type = "Sunglasses";
	item3.brand = "Rooban";
	item3.price = 4500;
	item3.isDesignerLabel = true;
	
	
System.out.println("Accessories1 = "+item1.type+", " +item1.brand+", "+item1.price+", "+item1.isDesignerLabel);	
System.out.println("Accessories2 = "+item2.type +", "+item2.brand+", "+item2.price+", "+item2.isDesignerLabel);	
System.out.println("Accessories3 = "+item3.type +", "+item3.brand+", "+item3.price+",  "+item3.isDesignerLabel);	
	
	
	
}
}
class Accessories{
	String type;
	String brand;
	int price;
	boolean isDesignerLabel;
	
	
	
}
