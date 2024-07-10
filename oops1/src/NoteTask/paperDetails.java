package NoteTask;

 class paperDetails {
	 
// composition .......Start
	 
//	  String  brand;
//	  String thickNess;
//	   int price;
	   
// composition ....... End
	   
	//  Encapsulation .......  start   
	   
	   
	private String  brand;
	private  String thickNess;
	private   int price;
	
public void  setBrand(String brand) {
	this.brand = brand;
}

public String  getBrand() {
	return brand;
	
}
	
public void  setThickNess(String thickNess) {
	this.thickNess = thickNess;
	
}

public String getThickNess() {
	return thickNess;
}

public void  setPrice(int price) {
	this.price = price;
}

public int getPrice() {
	return price;
}

	
	   
	//  Encapsulation .......  End
	   
	   
	   
	   
	   
	   
	   
	   
}