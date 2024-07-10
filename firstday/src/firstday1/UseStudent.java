package firstday1;

public class UseStudent {
	public static void main(String[] args) {
		Student s1=new Student();
		s1.studentname="raja";
		s1.cgpa=9.6f;
		s1.section='a';
		s1.studentid=42;
		System.out.println(s1.cgpa);
		
	}

}
class Student {
	int studentid;
	String studentname;
	char section;
	float cgpa;
}