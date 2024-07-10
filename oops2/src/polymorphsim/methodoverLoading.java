package polymorphsim;

public class methodoverLoading {
public static void main(String args[]) {
	
	
	FindMax f1 = new FindMax();
System.out.println(f1.max(5, 6));
System.out.println(f1.max("hello", "hi"));
	
}	
}

class FindMax {
	
	public int max (int a , int b) {
		if(a > b) {
			return a;
			
		}else {
			return b;
		}
		
	}
	
	public String max(String a, String b) {
		if(a.length() > b.length()) {
			return a;
			
		}else {
			return b;
		}
}
}
