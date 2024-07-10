package Day3Task;

public class UseLaptop {
	
	public static void main(String args[]) { ///Hp white 33.3f false
		
		Laptop firstproduct = new Laptop();
		firstproduct.brand= args[0];
		firstproduct.color = args[1];
		firstproduct.Size = Float .parseFloat(args[2]);
		firstproduct.isLed = Boolean.parseBoolean(args[3]);
		
		
		
		
		
	System.out.println(firstproduct.brand+" "+firstproduct.color+" "+firstproduct.Size+" "+ firstproduct.isLed);
		
	}

}

class Laptop{
	 String brand;
	 String color;
	 float Size;
	 boolean isLed;
	 
}
