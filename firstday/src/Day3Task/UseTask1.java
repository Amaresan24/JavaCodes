package Day3Task;

public class UseTask1 {
	public static void main (String args[]) {//Dell,black,25.5f,true,50000,10
		Laptop2 lap = new Laptop2();
		String [] arr = args[0].split(",");//Dell black 25.5f true 50000 10
		lap.brand = arr[0];
		lap.color = arr[1];
		lap.size = Float.parseFloat(arr[2]);
		lap.isled =Boolean.parseBoolean(arr[3]);
		lap.price=Integer.parseInt(arr[4]);
		lap.tax=Integer.parseInt(arr[5]);
		
		/*int brand1en = lap.brand.length();
		int colorlen = lap.color.length();
		int totallen = brand1en +  colorlen;
		*/
		
		char firstlet = lap.brand.charAt(0);
		char lasttlet = lap.brand.charAt(lap.brand.length()-1);
		
		int totalcost=lap.price+((lap.price*10)/100);
		
		
		String lapDef = lap.brand.concat(" is good");
		
//	System.out.println("Brand = "+lap.brand+" "+"Color = "+lap.color+" "+"Size = "+lap.size+" "+" Led = "+lap.isled+"Totalcost of Laptop="+totalcost);
	
	System.out.println(lap.brand.length()+lap.color.length());
	
	System.out.println(firstlet);
	System.out.println(lasttlet);
	System.out.println(lapDef);
	}

}


class Laptop2{
	
	String brand;
	String color;
	float size;
	boolean isled;
	int price;
	int tax;
	
}