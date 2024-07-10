package firstday1;

public class Pratices {
	
       public static void main(String args[]) {
		
// Rule of Declare Class  -----------------2;
		
		model phoneDetails = new model();
		
		phoneDetails.phoneModel   = 34;
		phoneDetails.phoneColor   = "NavyBlue";
		phoneDetails.phonebattery = "7000MAH";
		phoneDetails.phonePrice   = 39999;
		
		System.out.println(phoneDetails.phoneColor);
		
		
		model phoneDetails1 = new model();
		phoneDetails1.phoneColor = "Matalic Gray";
		System.out.println(phoneDetails1.phoneColor);
		
		}
}


// Bean  Class-------------------------1

class model{
	int     phoneModel;
	String  phoneColor;
	String  phonebattery;
	int     phonePrice;
}
