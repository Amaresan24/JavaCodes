package forloop2;

public class forlooptwo7 {
public static void main(String args[]) {
	
Student student1 = new Student();	
student1.name = "Vijayfyrdtrdtxt";
student1.age = 23;
student1.gender = "male";
student1.fees = 34000;
student1.standard = "b";

Student student2 = new Student();	
student2.name = "ramesh";
student2.age = 28;
student2.gender = "male";
student2.fees = 134000;
student2.standard = "b";

Student student3 = new Student();	
student3.name = "priya";
student3.age = 24;
student3.gender = "female";
student3.fees = 45000;
student3.standard = "a";

Student student4 = new Student();	
student4.name = "maran";
student4.age = 33;
student4.gender = "male";
student4.fees = 3000;
student4.standard = "c";

Student student5 = new Student();	
student5.name = "sriVijay";
student5.age = 26;
student5.gender = "male";
student5.fees = 54000;
student5.standard = "b";

Student student6 = new Student();	
student6.name = "divya";
student6.age = 26;
student6.gender = "female";
student6.fees = 34000;
student6.standard = "a";

Student student7 = new Student();	
student7.name = "sanjay";
student7.age = 23;
student7.gender = "male";
student7.fees = 400000;
student7.standard = "a";

Student student8 = new Student();	
student8.name = "kamal";
student8.age = 25;
student8.gender = "male";
student8.fees = 7000;
student8.standard = "b";

Student student9 = new Student();	
student9.name = "Ajith";
student9.age = 23;
student9.gender = "male";
student9.fees = 34000;
student9.standard = "b";

Student student10 = new Student();	
student10.name = "mani";
student10.age = 26;
student10.gender = "male";
student10.fees = 34000000;
student10.standard = "b";


Student [] students = {student1,student2,student3,student4,student5,student6,student7,student8,student9,student10};

Student  maxFees = students[0];

//Student  longName = students[0];

for(int i = 0; i<students.length; i++) {
if(students[i].fees > maxFees.fees){
maxFees = students[i];
}
}

System.out.println(maxFees.fees);
	}	
}
class Student {
String  name;
int age;
String gender;
int fees;
String standard;
	
}
