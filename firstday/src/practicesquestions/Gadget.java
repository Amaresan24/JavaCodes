package practicesquestions;

public class Gadget {
public static void main (String args[]) {
	
//   	Gadget Class Program
//	   - Create a Java class named `Gadget`.
//	   - Declare variables `name`, `category`, `price`, and `isPortable`.
//	   - Write a main method to create three instances of `Gadget`.
//	   - Assign values to the attributes of each gadget and print out their detail
	
	
	Gadgets gadget1 = new Gadgets();
	gadget1.name = "Watch";
	gadget1.category = "smart watch";
	gadget1.price    = 4400;
	gadget1.isPortable = true;
	
	Gadgets gadget2 = new Gadgets();
	gadget2.name = "EarPhone";
	gadget2.category = "Audio";
	gadget2.price    = 1400;
	gadget2.isPortable = true;
	
	
	
	Gadgets gadget3 = new Gadgets();
	gadget3.name = "Powerbank";
	gadget3.category = "power";
	gadget3.price    = 3400;
	gadget3.isPortable = false;
	
	
	System.out.println("First gadget:" +gadget1.name+" ,"+gadget1.category+","+gadget1.price+","+gadget1.isPortable);
	
	System.out.println("Second gadget:" +gadget2.name+","+gadget2.category+","+gadget2.price+","+gadget2.isPortable);
	
	System.out.println("Third gadget:"+gadget3.name+","+gadget3.category+","+gadget3.price+","+gadget3.isPortable);
	
}	
	
	

}
class Gadgets{
	String name ;
	String category;
	int price ;
    boolean isPortable;
	
}