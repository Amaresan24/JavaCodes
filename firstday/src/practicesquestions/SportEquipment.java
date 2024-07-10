package practicesquestions;

public class SportEquipment {
public static void main(String args[]) {
//	17. Sport Equipment Class Program
//	   - Create a Java class named `SportEquipment`.
//	   - Declare variables `name`, `category`, `price`, and `isProfessionalGrade`.
//	   - Write a main method to create four instances of `SportEquipment`.
//	   - Assign values to the attributes of each sport equipment and print out their details.
	
	SportEquipments sport1 = new SportEquipments();
	sport1.name = "Football";
    sport1.category = "Ball sports";
    sport1.price = 5000;
    sport1.isProfessionalGrade = true;
    
    SportEquipments sport2 = new SportEquipments();
    sport2.name = "basketball";
    sport2.category = "Ball sports";
    sport2.price = 15000;
    sport2.isProfessionalGrade = false;
    
    SportEquipments sport3 = new SportEquipments();
    sport3.name = "Swimming Goggles";
    sport3.category = "Water sports";
    sport3.price = 4000;
    sport3.isProfessionalGrade = false;
    
    SportEquipments sport4 = new SportEquipments();
    sport4.name = "Running Shoes";
    sport4.category = "Athletics";
    sport4.price = 6000;
    sport4.isProfessionalGrade = true;
    
 System.out.println("SportEquipment1= "+sport1.name+","+sport1.category+","+sport1.price+","+sport1.isProfessionalGrade);   
 System.out.println("SportEquipment2= "+sport2.name+","+sport2.category+","+sport2.price+","+sport2.isProfessionalGrade);   
 System.out.println("SportEquipment3= "+sport3.name+","+sport3.category+","+sport3.price+","+sport3.isProfessionalGrade);   
 System.out.println("SportEquipment4= "+sport4.name+","+sport4.category+","+sport4.price+","+sport4.isProfessionalGrade);   
    
   
}

}
class SportEquipments{
String name ;
String category;
int price;
boolean isProfessionalGrade;
	
	
}
