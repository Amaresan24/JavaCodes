package collections1;
import java.util.ArrayList;

public class Task1 {
public static void main(String args[]) {
	
	
	
	Employee n1 = new Employee (45 , "vijay"  , "Developer" , "male" ,true  , 89000 );
	Employee n2 = new Employee (45 , "vijay"  , "tester" , "male" ,true  , 50000);
	Employee n3 = new Employee (45 , "vijay"  , "Engineer" , "female" ,false  , 15000);
	Employee n4 = new Employee (45 , "vijay"  , "QA" , "female" ,false  , 5000);
	

	
	
ArrayList<Employee> m = new ArrayList<>();	
	
m.add(n1);
m.add(n2);
m.add(n3);
m.add(n4);


//m.forEach( x -> System.out.println(m));
	
//for(int i = 0; i<m.size(); i++) {
//	
//	
//	if(m.get(i).isDeveloper() == true && m.get(i).getGender().equals("female")) {
//		
//		continue;
//		
//	}else {
//		
//		System.out.println(m.get(i));
//	}
//	
//}	
//	



//for(Employee x : m) {
//Employee  min = m.get(0) ;
//	if(x.getSalary() < min.getSalary() ) {
//		min = m.(x);
//		
//	}
//	
//}




m.forEach( x -> {
	if(x.getName().length() >  4  && x.getGender().equals("female")) {
		
		//System.out.println(x);
		
	}});



ArrayList<Employee> emp = new ArrayList<>();


for(Employee X : m) {
	if(X.getRole().equals("Developer") && X.getSalary() > 50000) {
		
		emp.add(X);
	}
}




//for(Employee Y : emp) {
	//System.out.println(Y);
//}

	

for(int i = 0 ; i<m.size(); i++) {
	Employee max = m.get(0);
	if(m.get(i).getSalary() > max.getSalary()) {
		max = m.get(i);
		
		System.out.println(max);
	}
	
}


}
}

class  Employee {
private int id;
private String name;
private String role;
private String   gender;
private int salary;
private boolean  isDeveloper;



public int getSalary() {
	return salary;
}

public void setSalary(int salary) {
	this.salary = salary;
}

public class Person {
    private String name;
    private int age;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getRole() {
	return role;
}

public void setRole(String role) {
	this.role = role;
}

public String getGender() {
	return gender;
}

public void setGender(String gender) {
	this.gender = gender;
}

public boolean isDeveloper() {
	return isDeveloper;
}

public void setDeveloper(boolean isDeveloper) {
	this.isDeveloper = isDeveloper;
}






/// constactor


public Employee(int id, String name, String role, String gender, boolean isDeveloper , int salary  ) {
	
	this.id = id;
	this.name = name;
	this.role = role;
	this.gender = gender;
	this.isDeveloper = isDeveloper;
	this.salary = salary;
}

@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", role=" + role + ", gender=" + gender + ", isDeveloper="
			+ isDeveloper +  ",salary" +  salary  + "]";
}
}




