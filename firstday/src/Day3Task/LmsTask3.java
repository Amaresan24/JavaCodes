package Day3Task;

public class LmsTask3 {
	public static void main(String args[]) { //Kamal#960#true#93.3f#false
		String val1 = args[0];
        String  [] arr1 = val1.split("#");// "kamal" "960" "true" "93.3f" "false"
        int num1  = Integer.parseInt(arr1[1]); 
        boolean var1 = Boolean.parseBoolean(arr1[2]);
        float  dec1 = Float.parseFloat(arr1[3]);
        
        
         
         System.out.println(num1);
         System.out.println(var1);
         System.out.println(dec1);
	}

}
 