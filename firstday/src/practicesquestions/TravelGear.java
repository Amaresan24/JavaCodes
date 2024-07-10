package practicesquestions;

public class TravelGear {
public static void main(String args[]) {
//	20. Travel Gear Class Program
//	   - Create a Java class named `TravelGear`.
//	   - Declare variables `name`, `category`, `price`, and `iswaterproof`.
//	   - Write a main method to create four instances of `TravelGear`.
//	   - Assign values to the attributes of each travel gear and print out their details.
	
	TravelGears gears1 = new TravelGears();
	gears1.name = "Luggage";
    gears1.category = " Suitcases";
    gears1.price = 5600;
    gears1.iswaterproof = true;
    
    TravelGears gears2 = new TravelGears();
    gears2.name = "Travel Accessories";
    gears2.category = " pillows";
    gears2.price = 600;
    gears2.iswaterproof = false;
    
    TravelGears gears3 = new TravelGears();
    gears3.name = "Travel Electronics";
    gears3.category = " Travel adapters";
    gears3.price = 4600; 
    gears3.iswaterproof = false;
    
    TravelGears gears4 = new TravelGears();
    gears4.name = "Outdoor Gear";
    gears4.category = "  portable stoves";
    gears4.price = 5600;
    gears4.iswaterproof = false;
    
	System.out.println("TravelGears1 ="+gears1.name+", "+gears1.category+", "+gears1.price +", "+gears1.iswaterproof);
	System.out.println("TravelGears2 ="+gears2.name+", "+gears2.category+", "+gears2.price +", "+gears2.iswaterproof);
	System.out.println("TravelGears3 ="+gears3.name+", "+gears3.category+", "+gears3.price +", "+gears3.iswaterproof);
	System.out.println("TravelGears4 ="+gears4.name+", "+gears4.category+", "+gears4.price +", "+gears4.iswaterproof);
	
	
}

}
class TravelGears {
	String name ;
	 String category;
	 int price;
	 boolean iswaterproof;
	
	
	
	
}