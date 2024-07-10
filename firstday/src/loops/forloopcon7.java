package loops;

public class forloopcon7 {
	
public static void main(String args[]) {
	/// This print name in reserve.
	
	String name = "Amaresh";
	String resName = "";
	
for(int i = name.length() -1; i>= 0 ; i--) {
	resName = resName  + name.charAt(i);
	
}	
System.out.println(resName);	
	
}	
	

}
