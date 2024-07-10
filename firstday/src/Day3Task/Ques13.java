package Day3Task;

public class Ques13 {

public static void main(String args[]) {

  Hospital UseHospital1 = new Hospital();
  UseHospital1.name = "Apollo";
  UseHospital1.location = "Chennai";
  UseHospital1.isAvail24 = true;
  
  Hospital UseHospital2 = new Hospital();
  UseHospital2.name = "kavuery";
  UseHospital2.location = "Madurai";
  UseHospital2.isAvail24 = false;
  
  Hospital UseHospital3 = new Hospital();
  UseHospital3.name = "sms";
  UseHospital3.location = "Hyderabad";
  UseHospital3.isAvail24 = true;
  
  
  String hospitalName1 = UseHospital1.name;
  String hospitalup1   = hospitalName1.toUpperCase();
//  System.out.println(hospitalup1);
  
  String hospitalName2 = UseHospital2.name;
  String hospitalup2   = hospitalName2.toUpperCase();
//  System.out.println(hospitalup2);
  
  String hospitalName3 = UseHospital3.name;
  String hospitalup3   = hospitalName3.toUpperCase();
//  System.out.println(hospitalup3);
  
  // Change the upperCase location.
  
  String hospitallocation1 = UseHospital1.location;
  String  locationup1   = hospitallocation1.toUpperCase();
//  System.out.println(locationup1);
  
  String hospitallocation2 = UseHospital2.location;
  String  locationup2   = hospitallocation2.toUpperCase();
//  System.out.println(locationup2);
  
  String hospitallocation3 = UseHospital3.location;
  String  locationup3   = hospitallocation3.toUpperCase();
//  System.out.println(locationup3);
  
  
  String lenthHost3 = UseHospital3.location;
  int totalLength = lenthHost3.length();
  System.out.println(totalLength);
  
  
  /// Check host1  and host2 name equal.
boolean equalName = hospitalName1.equals(hospitalName2);
System.out.println(equalName);
  
  
  
  
  
  System.out.println(hospitalup1 +""+ locationup1 + ""+UseHospital1.isAvail24 );
  System.out.println(hospitalup2 +""+ locationup2 + ""+UseHospital2.isAvail24 );
  System.out.println(hospitalup3 +""+ locationup3 + ""+UseHospital3.isAvail24 );
  
  
	
	
	
	
}

}
class Hospital{
	
	String name ;
	String  location ;
	boolean  isAvail24;
}
