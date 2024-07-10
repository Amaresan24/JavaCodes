package Methods_practices;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.*;

public class Employee {
private int id;
private String name;
private int salary;
private  String desgination;
private String gender;




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
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
public String getDesgination() {
	return desgination;
}
public void setDesgination(String desgination) {
	this.desgination = desgination;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}

public Employee(int id, String name, int salary, String desgination, String gender) {
	//super();
	this.id = id;
	this.name = name;
	this.salary = salary;
	this.desgination = desgination;
	this.gender = gender;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", desgination=" + desgination + ", gender="
			+ gender + "]";
}


public static List<Employee> getMinisalry(ArrayList<Employee> sal) {
	List<Employee>  minsal  = sal.stream().sorted(Comparator.comparing(Employee::getSalary)).limit(1).collect(Collectors.toList());
	return   minsal;
			


}
}
