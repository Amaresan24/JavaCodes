package NoteTask;

class noteDetails {
	// composition .......Start
	
//      String brand;
//	  int price;
//	  String pages;
//	  boolean isQuality;
//	  paperDetails paperDetails1;
	  
	// composition ....... End
	  
	//  Encapsulation .......  start  
	  
	private String brand;
	private  int price;
	private  String pages;
	private  boolean isQuality;
	
	
	
	
	public void getBrand(String brand) {
		this.brand = brand;
		}
	
	public String setBrand() {
		return brand;
	}
public void getPrice(int price) {
	this.price = price;
}

public int setPrice() {
	return price;
}

public void setPages(String pages) {
	this.pages = pages;
	
}
	
	
	
	
	//  Encapsulation .......  End 
	
	
	

}
