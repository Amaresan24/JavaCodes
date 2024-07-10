package composition;

//public class carParts {
//
//}
class  Car {
	
//	String brand;
//	int price;
//	String color;
//	boolean isQuality;
//	Engine engine;
	
  private String brand;
  private int price;
  private String color;
  private boolean isQuality;
  private Engine engine;
	
public void setBrand(String brand) {
	this.brand = brand;
}

public String getBrand() {
	return brand;
}

public void setPrice(int price) {
	this.price = price;
}

public int getPrice() {
	return price;
}

public void setColor(String color) {
	this.color = color;
	
}
public String getColor() {
	
	return color;
}
	
public void setisQuality(boolean isQuality) {
	this.isQuality = isQuality;
}	
	
public boolean getisQuality() {
	return isQuality;
}


public void setEngine(Engine engine) {
	this.engine = engine;
}

public Engine getEngine() {
	return engine;
}

//Constructor


//public Engine(S){}




public String toString() {
	
return  brand +"  "+ price +"  "+ color + "  "+isQuality +"  "+ engine;

	}	
	
	
	
}