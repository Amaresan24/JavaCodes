package composition;

public class opps1 {
public static void main(String args[]) {
	
	
	
//Engine e1 = new Engine();
//e1.brand = "Ford";
//e1.CC = 200;
//	
//Car c1 = new Car();	
//c1.brand = "BMW";
//c1.price = 34456564;
//c1.color = "Black";
//c1.isQuality = true;
//c1.engine = e1;

	
	Engine e1 = new Engine();
    e1.setBrand("bajaj");
    e1.setCC(200);
		
	Car c1 = new Car();	
	c1.setBrand( "BMW");
	c1.setPrice(34456564);
	c1.setColor( "Black");
	c1.setisQuality( true);
	c1.setEngine(e1);

	
	

//System.out.println(c1.brand +" " + c1.price +" "+ c1.color+" "+c1.isQuality+" "+ c1.engine.brand +" "+ c1.engine.CC);
//System.out.println(c1);


System.out.println(c1.getBrand() +" "+c1.getPrice()+""+ c1.getColor()+" "+c1.getisQuality()+" "+ c1.getEngine().getBrand()+" "+ c1.getEngine().getCC());

	
}	

}

//class Engine {
//	
//	String brand;
//	int    CC;
//	}

//class  Car {
//	
//	String brand;
//	int price;
//	String color;
//	boolean isQuality;
//	Engine engine;
//	
//	
//}