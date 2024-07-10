package polymorphsim;

public class methodoverriding {
public static void main(String args[]) {
	
	AxisBank a1 = new AxisBank();
	//a1.netInterset(500);
	
	System.out.println(a1.netInterset(20000));
	
}
}


class Bank {
	public int netInterset(int a) {
		
		return a + ((a/100) * 10);
		
	}
}

class AxisBank extends Bank {
	
	public int netInterset(int n ) {
		
		return n + ((n/100) * 20);
		
	}
	
	
}