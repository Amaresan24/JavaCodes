package Methods_practices;

import java.util.ArrayList;
import java.util.*;



public class Use_Employee {
public  static void main(String args[]) {
	
	
	
	
ArrayList<Employee> empDetails = new ArrayList<>();

empDetails.add(new Employee( 45, "Suresh" , 45000, "Manger", "male"));
empDetails.add(new Employee( 34, "kamesh" , 4000, "developer", "male"));
empDetails.add(new Employee( 25, "priya" , 56000, "tester", "femal"));
empDetails.add(new Employee( 35, "Suresh" , 5600, "Manger", "male"));
empDetails.add(new Employee( 26, "Suresh" , 45000, "Manger", "male"));
empDetails.add(new Employee( 27, "selva" , 45000, "Manger", "male"));
empDetails.add(new Employee( 28, "ajith" , 45000, "Manger", "male"));
empDetails.add(new Employee( 31, "vijay" , 45000, "Manger", "male"));
empDetails.add(new Employee( 20, "kamla" , 45000, "Manger", "male"));
empDetails.add(new Employee( 21, "karthik" ,45000, "Manger", "male"));
empDetails.add(new Employee( 22, "dhumu" , 45000, "Manger", "male"));
empDetails.add(new Employee( 23, "selvi" , 45000, "Manger", "female"));
empDetails.add(new Employee( 23, "mari" , 45000, "Manger", "male"));
empDetails.add(new Employee( 34, "mari" , 45000, "Manger", "male"));
empDetails.add(new Employee( 21, "mari" , 45000, "Manger", "male"));
empDetails.add(new Employee( 22, "kamali" , 45000, "Manger","female"));
empDetails.add(new Employee( 23, "mari" , 45000, "Manger", "male"));
empDetails.add(new Employee( 24, "mari" , 45000, "Manger", "male"));
empDetails.add(new Employee( 25, "swathi" , 45000, "Manger", "female"));
empDetails.add(new Employee( 26, "mari" , 500, "Manger", "male"));
empDetails.add(new Employee( 27, "mari" , 45000, "Manger", "male"));	
	
System.out.println(Employee.getMinisalry(empDetails));
	
	
	
	
	
	
	
	
}	

}
