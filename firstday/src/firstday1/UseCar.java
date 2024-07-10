package firstday1;

public class UseCar {
	
	public static void main(String args[]) {
		Cars  CarDetails = new Cars();
		/// Declare the same class already store object data.
		CarDetails.carNumber = "TN23X2345";
		CarDetails.OwnerName = "Selva";
		CarDetails.CarModel = "2024";
		CarDetails.CarWidth = 45.5f;
		System.out.println(CarDetails.OwnerName);
	}

}

/// Bean Class first of all set class types.
class Cars {
	String carNumber;
	String OwnerName;
	String CarModel;
	float CarWidth;
	}
