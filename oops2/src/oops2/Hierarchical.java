package oops2;

public class Hierarchical {
public static void main(String args[]) {
	
Apple a1 = new Apple();
a1.color ="red";
a1.price = 56;
a1.name = "Apples";
a1.count  = 6;
	
	
Banana b1 = new Banana();
b1.count = 9; 
b1.name = "Green Banana";
b1.names = "Furits";
b1.type = 5;


System.out.println(b1.count +","+ a1.count);
System.out.println(a1.color);
	
}	
}

class Furit {
	String name;
	 int  count;
	
}
class Apple extends Furit {
	String color;
    int price;
	
}
class Banana extends Furit {
	String names;
    int type;
}
