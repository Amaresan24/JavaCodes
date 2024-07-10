package oops2;

public class SuperTask {
public static void main(String args[]) {
	
	MountainBike m1 = new MountainBike("Bmw", 67 , "hi");
	
	System.out.println(m1);
	
}	
}

class Bike {
	
	private String brand;
	private int price;
	private String model;
	
	
public Bike (String brand, int price, String model) {
   this.brand = brand;
   this.price = price;
   this.model = model;
   
}

public String toString() {
	return brand +" "+ price +" "+ model;
	
}
}


class MountainBike extends Bike {
	private int speed;
    private int weight; 	
    
    
 public MountainBike(String brand, int price, String model) {
	 super(brand , price, model);
	 
	 this.speed = speed;
	 this.weight = weight;
	 
 } 
 
 public String toString() {
	 return super.toString()+ ""+ speed + weight;
	 
	 
 }
	
}
