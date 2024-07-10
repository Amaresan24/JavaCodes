package funcations;

public class objectfun {
public static void main (String args[]) {
	
	
Car c1 = new Car();
c1.brand = "honda";
c1.color = "black" ;
c1.price = 50000;
c1.model = 2021;
c1.netPrice = c1.getNetPrice(10);
//System.out.println(c1.getNetPrice(10));
c1.show();
	
	
//Car c2 = new Car();
//c2.brand = "suzuki";
//c2.color = "black" ;
//c2.price = 10000;
//c2.model = 2022;
//c2.netPrice = c2.getNetPrice(5);

	
}	

}
class Car {
	
	String brand;
    int price;
    int model;
    String color;
    int netPrice;

    
public int getNetPrice(int taxpercentage) {
	return (price * taxpercentage/100) + price;
	
}

public void show() {
	
	System.out.println(brand +" "+ price +" "+ model +" "+ color +" "+ netPrice);
	
}
    
    
    
}