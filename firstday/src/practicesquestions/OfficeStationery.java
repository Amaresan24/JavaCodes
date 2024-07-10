package practicesquestions;

public class OfficeStationery {
public static void main(String args[]) {
	
//	18. Office Stationery Class Program
//	   - Create a Java class named `OfficeStationery`.
//	   - Declare variables `name`, `type`, `price`, and `isEcoFriendly`.
//	   - Write a main method to create two instances of `OfficeStationery`.
//	   - Assign values to the attributes of each office stationery and print out their details.

	Stationery item1 = new Stationery();
	item1 .name = "pencil";
	item1.type = "Writing instruments";
	item1.price = 45;
	item1.isEcoFriendly= true;
	
	Stationery item2 = new Stationery();
	item2 .name = "stapler";
	item2.type = "Desk  Accesorices";
	item2.price = 145;
	item2.isEcoFriendly= false;
	
System.out.println("OfficeStationery1="+item1 .name+","+item1.type+", "+item1.price +", "+item1.isEcoFriendly);	
System.out.println("OfficeStationery2="+item2 .name+","+item2.type+", "+item2.price +", "+item2.isEcoFriendly);	
	
	
}

}
class Stationery{
	String name ;
	String type;
	int price;
	boolean isEcoFriendly;
}