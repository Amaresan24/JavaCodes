package practicesquestions;

public class MusicInstrument {
public static void main(String args[]) {
	
//	16. Music Instrument Class Program
//	   - Create a Java class named `MusicInstrument`.
//	   - Declare variables `type`, `brand`, `price`, and `isAcoustic`.
//	   - Write a main method to create two instances of `MusicInstrument`.
//	   - Assign values to the attributes of each music instrument and print out their details	
	
	MusicInstruments music1  = new 	MusicInstruments();
	music1.type = "Guitar";
	music1.brand = "Yamaha";
	music1.price = 45000;
	music1.isAcoustic = false;
	
	MusicInstruments music2  = new 	MusicInstruments();
	music2.type = "Piano";
	music2.brand = "Kawai";
	music2.price = 235000;
	music2.isAcoustic = true;
System.out.println("MusicInstruments1 = "+music1.type+","+music1.brand+","+music1.price+","+music1.isAcoustic);
System.out.println("MusicInstruments2 = "+music2.type+","+music2.brand+","+music2.price+","+music2.isAcoustic);
	
}

}
class MusicInstruments{
  String type;
  String brand;
  int price;
  boolean isAcoustic;
	
	
}
