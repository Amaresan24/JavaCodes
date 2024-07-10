package composition;


class Engine {
	
//String brand;
//int    CC;
	
 private  String brand;
 private  int    CC;

public void setBrand(String brand) {
   this.brand = brand;
}

public String getBrand() {
	return brand;	
}

public void setCC(int CC) {
	this.CC = CC;
}
public int getCC() {
 return CC;
}



// constructor

//public Engine(String brand , int CC) {
//	this.brand = brand;
//	this.CC = CC;
//	
//}



public  String toString() {
	
return brand + " " + CC;

}


//public String  toString() {
//return brand +" "+ CC;
//}


	
}