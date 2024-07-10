package Task1;

public class Car {
private String model;
private int price;
private String color;
private  String  company;




public String getModel() {
	return model;
}
public void setModel(String model) {
	this.model = model;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public String getCompany() {
	return company;
}
public void setCompany(String company) {
	this.company = company;
}


public Car(String model, int price, String color, String company) {
	super();
	this.model = model;
	this.price = price;
	this.color = color;
	this.company = company;
}
	
@Override
public String toString() {
	return "Car [model=" + model + ", price=" + price + ", color=" + color + ", company=" + company + "]";
}
	

}
