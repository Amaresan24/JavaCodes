package practicesquestions;

public class HomeAppliance {
//	. Home Appliance Class Program (Find Total Power Consumption)
//	   - Create a Java class named `HomeAppliance`.
//	   - Declare variables `name`, `powerRating`, `isEnergyEfficient`, and `quantity`.
//	   - Write a main method to create two instances of `HomeAppliance`.
//	   - Assign values to the attributes of each appliance and calculate the total power consumption.
	
public static void main(String args[]) {
	
	HomeAppliances Appliance1 = new  HomeAppliances();
	Appliance1.name = "fridge";
	Appliance1.powerRating = 200;
	Appliance1.isEnergyEfficient = true;
	Appliance1.quantity = 1;
	
	
	HomeAppliances Appliance2 = new  HomeAppliances();
	Appliance2.name = "Micro oven";
	Appliance2.powerRating = 300;
	Appliance2.isEnergyEfficient = true;
	Appliance2.quantity = 1;
	 
int val1 =  	Appliance1.powerRating * Appliance1.quantity;
int val2 =    Appliance2.powerRating * Appliance2.quantity;
System.out.println(val1 + val2);
	
	
}
	
	}
class HomeAppliances{
	String name;
	int  powerRating;
	boolean isEnergyEfficient;
	int  quantity;
	}