package practicesquestions;

public class Pet {
public static void main(String args[]) {
//	13. Pet Class Program
//	   - Create a Java class named `Pet`.
//	   - Declare variables `name`, `species`, `age`, and `isFriendly`.
//	   - Write a main method to create four instances of `Pet`.
//	   - Assign values to the attributes of each pet and print out their details.
	
Pets pet1  = new Pets();
pet1.name  = "cat";
pet1.species = "Jumping";
pet1.age = 2;
pet1.isFriendly = false;

Pets pet2  = new Pets();
pet2.name  = "dog";
pet2.species = "running";
pet2.age = 4;
pet2.isFriendly = true;

Pets pet3  = new Pets();
pet3.name  = "Rabbit";
pet3.species = "ears";
pet3.age = 3;
pet3.isFriendly = false;


Pets pet4  = new Pets();
pet4.name  = "LoveBirds";
pet4.species = "Sounds";
pet4.age = 2;
pet4.isFriendly = false;

System.out.println("First pet:"+pet1.name+","+pet1.species+","+pet1.age+","+pet1.isFriendly);	
System.out.println("Second pet:"+pet2.name+","+pet2.species+","+pet2.age+","+pet2.isFriendly);	
System.out.println("Third pet:"+pet3.name+","+pet3.species+","+pet3.age+","+pet3.isFriendly);	
System.out.println("Fourth pet:"+pet4.name+","+pet4.species+","+pet4.age+","+pet4.isFriendly);	
	
	
}	
}
class Pets {
	
	String name;
    String species;
    int age;
    boolean isFriendly;
}