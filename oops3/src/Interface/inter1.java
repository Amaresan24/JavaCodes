package Interface;

public class inter1 {
public static void main(String args[]) {
	
	
	
	
	Sample n = new Sample();
	System.out.println(n.run(3, 5));
	System.out.println(n.name("Hello"));
	n.Add(10, 5);
	
}	
}

  interface Car{
	  // unImpleted
	
	public int run (int c , int b );
	public String name(String n1);
	public void    Add(int num1 , int num2);
}

class Sample implements Car {
	
public int run(int c ,int b) {
	return c + b;
}

public String name(String n1) {
	return n1;
}

public void Add(int num1 , int num2) {
System.out.println(num1 + num2);
	}


}