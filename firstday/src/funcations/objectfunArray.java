package funcations;

public class objectfunArray {
public static void main(String args[]) {

	Ccar c1 = new Ccar();
	c1.brand = "honda";
	c1.color = "black" ;
	c1.price = 50000;
	c1.model = 2021;
	c1.netPrice = c1.getNetPrice(10);
	//c1.show();
		
		
	Ccar c2 = new Ccar();
	c2.brand = "suzuki";
	c2.color = "black" ;
	c2.price = 10000;
	c2.model = 2022;
	c2.netPrice = c2.getNetPrice(3);
	//c2.show();
	
	Ccar c3 = new Ccar();
	c3.brand = "benz";
	c3.color = "black" ;
	c3.price = 2000000;
	c3.model = 2022;
	c3.netPrice = c3.getNetPrice(2);
	//c3.show();
	
	Ccar c4 = new Ccar();
	c4.brand = "BmW";
	c4.color = "black" ;
	c4.price = 50000;
	c4.model = 2022;
	c4.netPrice = c4.getNetPrice(3);
	//c4.show();

	Ccar c5 = new Ccar();
	c5.brand = "jagur";
	c5.color = "black" ;
	c5.price = 5000000;
	c5.model = 2022;
	c5.netPrice = c5.getNetPrice(6);
	//c5.show();
	
Ccar[] cars = {c1, c2, c3, c4, c5};

Ccar maxCar = c1.findCostlyCar(cars);
maxCar.show();
	}	

}
class Ccar {
/// That is blue print of object.		
		String brand;
	    int price;
	    int model;
	    String color;
	    int netPrice;
	    
// calculate  the netPrice.
	    public int getNetPrice(int taxpercentage) {
		return (price * taxpercentage/100) + price;
		}
	    
	// calculate the maxPrice of cars.
	    
 public  Ccar findCostlyCar(Ccar[] cars) {
		 Ccar max = cars[0];
		for(int i=0; i<cars.length; i++) {
			if(cars[i].netPrice > max.netPrice ) {
			   max = cars[i];
				}
			}
		return max;
}
	    
 
 // this show off outPut.
public void show() {
System.out.println(brand +" "+ price +" "+ model +" "+ color +" "+ netPrice);
  }
}