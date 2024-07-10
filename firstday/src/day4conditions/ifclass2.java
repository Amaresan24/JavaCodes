package day4conditions;

public class ifclass2 {
	
public static void main(String args[]) {
	
String  str = "Automobile"; /// a,e,i,o,u

if(str.contains("a")|| (str.contains("e")) || (str.contains("A")) || 
		str.contains("E") || str.contains("i") || str.contains("I") || 
		str.contains("o")||str.contains("O") ||str.contains("u")||str.contains("U")  ){
System.out.println("Given String  is include vowels");
	
}
else {
System.out.println("Given String  is notinclude vowels");	
}
	}
}

