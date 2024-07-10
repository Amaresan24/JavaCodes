package Interface;

public class Task1 {
public static void main(String args[]) {
ComputerStudent c = new ComputerStudent();
System.out.println(c.getMark(100));
System.out.println(c.getName("Suresh"));


System.out.println(c.getEMail("Sama @gmail.com"));
//System.out.println(c.englishMark(78));




}
}
interface Student1 {
public String getName();
public String getEmail();
	
}

abstract class EnginerStudent extends Student1 {
	public int getMark(int a);
	
  public int englishMark(int b) {
	  return b;
	  
  }
	
}

class ComputerStudent extends EnginerStudent {
	
public String getName(String name) {
return name;
	
}	
public String getEMail(String mail) {
	
	return mail;
	
}	
public int getMark(int c) {
	return c;
	
}
}
