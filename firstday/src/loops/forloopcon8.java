package loops;

public class forloopcon8 {
public static void main(String args[]) {
String  name = "madam";
String resName = "";
for(int i = name.length()-1; i>=0 ; i--) {
	resName = resName + name.charAt(i);
}
//System.out.println(resName);
if(name.equals(resName)) {
	System.out.println("Givien  Name is Plandrom");
}

else {
	System.out.println("Given Name is Not Plandrom");
	
	
}	
	
	
	
	
	
}	

}
