package oops2;

public class singlePro {
public static void main(String args[]) {
	
	SportsCar s1 = new SportsCar("Bmw", 70000, 6.75684, 350);
	
	
	System.out.println(s1);
	
}	
}

class Car {
	private String name;
	private int price;
	
public Car (String name, int price) {
	this.name = name;
	this.price = price;
	}
public String toString() {
	return name +" "+ price; 
	
}

	
	
	
}

class SportsCar extends Car {
	
	private double weight;
	private  int   speed;
	
public SportsCar(String name, int price, double weight, int speed) {
	super( name,price);
	
	this.weight = weight;
	this.speed = speed;
	
	
}	

public String toString() {
	return  weight +" "+ speed+" "+ super.toString() ; 
	
}

}
