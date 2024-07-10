package funcations;

public class f4 {
public static void main(String args[]) {
	
	Retriment r1 = new  Retriment();
	System.out.println(r1.findRetriment(66));
	}	
}

/// Retriment Eligile

class Retriment {
	
	public String findRetriment(int age) {
		if(age >=65) {
			return "Eligiable for retriment";
			}else {
			return  "not Eligiable retriment";
			}
		}	
	
	
}
