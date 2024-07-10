package funcations;

public class plaindromf6 {
public static void main(String args[]) {
	
	
	CheackPalindrom c1 = new CheackPalindrom();
	System.out.println(c1.getPalin("mam"));
	
	
	
}	

}

class CheackPalindrom {
	
public String getPalin(String name) {
	String temp = "";
	for(int i = name.length()-1; i>0; i--) {
		
		temp = temp+name.charAt(i);
	}
	if(name.equals(temp)) {
		return "palindrom";
	}else {
		
		return "Not Palindrom";
	}
	
	
}	
	
	
}


