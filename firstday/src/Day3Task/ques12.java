package Day3Task;

public class ques12 {
	
	public static void main(String args[]) {
	 
	 Pen UsePen1 = new Pen()	;
	 UsePen1.brand ="cello";
	 UsePen1.price = 45;
	 UsePen1.color = "black";
	 
	 Pen UsePen2 = new Pen()	;
	 UsePen2.brand ="flair";
	 UsePen2.price = 35;
	 UsePen2.color = "blue";
	 
	 String penU = UsePen1.brand +  UsePen2.brand;
	 String penUpper = penU.toUpperCase();
	 System.out.println(penUpper);
	 
	 String penColor1 = UsePen1.color;
	 String penColor2 = UsePen2.color;
	 boolean equalspen = penColor1.equals(penColor2);
	 
char color1 = penColor2.charAt(2);
char color2 = penColor1.charAt(3);

System.out.println(color1);
System.out.println(color2);

	 
	 System.out.println(equalspen);
	 
	 
		
		
		
	}

}
class Pen{
	String  brand;
	int     price;
	String  color;
	
}