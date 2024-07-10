package Interface;

public class abst1 {
public static void main(String args[]) {
	
	
	Teacher e  = new Teacher();
	System.out.println(e.add(4, 5));
	System.out.println(e.mark("hello"));
	
	
}	

}

abstract class Student {

	abstract int  sub(int a , int b);
	
public String mark(String n1) {
	return n1;
	}
}


 class Teacher extends Student { 
	
public int add(int c, int d) {
       return c + d;
	}	
}
