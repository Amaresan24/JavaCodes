package firstday1;

public class CarFeartures {
	
	public static void main(String args[]) {
		CarFeatures CarDetails = new CarFeatures();
		CarDetails.CarCompany = "TATA";
		CarDetails.CarColor = "Grey";
		CarDetails.CarHeight = "7.3Cm";
		CarDetails.CarWidth = "56Cm";
		CarDetails.CarModel = 2017;
		System.out.println(CarDetails.CarHeight);
		
		CarFeatures CarDetails2 = new CarFeatures();	
		CarDetails2.CarCompany= "Hyudai";
		CarDetails2.CarColor = "Black";
		CarDetails2.CarHeight = "5.4cm";
		CarDetails2.CarWidth = "56CM";
		CarDetails2.CarModel = 2023;
		System.out.println(CarDetails2.CarModel);
}
	
}
class CarFeatures{
	String CarCompany;
	String CarColor;
	String CarHeight;
	String CarWidth;
	int CarModel;
	
}