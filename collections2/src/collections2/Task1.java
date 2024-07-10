package collections2;
import java.util.HashMap;
import java.util.Iterator;
public class Task1 {
	
	
	
	
public static void main(String args[]) {
	
Student s1 = new Student(54573569, "vijay" , "male" , true, 20, "Cse" );	
Student s2 = new Student(545883569, "surddh" , "male" , true, 24, "it" );	
Student s3 = new Student(545676569, "vijay" , "male" , false, 26, "Cse" );	
Student s4 = new Student(54555569, "priya" , "female" , true, 25, "Cse" );	
Student s5 = new Student(545743569, "vijay" , "male" , false, 27, "it" );	
Student s6 = new Student(545733269, "vijaya" , "female" , true, 34, "Cse" );	
Student s7 = new Student(545734569, "vijay" , "male" , false, 26, "Cse" );	
Student s8 = new Student(545735429, "vijay" , "female" , false, 27, "Cse" );	
	
HashMap<Long , Student> students = new HashMap<>();
students.put(s1.getRegNumber() , s1);
students.put(s2.getRegNumber() , s2);
students.put(s3.getRegNumber() , s3);
students.put(s4.getRegNumber() , s4);
students.put(s5.getRegNumber() , s5);
students.put(s6.getRegNumber() , s6);
students.put(s7.getRegNumber() , s7);
students.put(s8.getRegNumber() , s8);
	
//students.keySet().forEach(g -> System.out.println(g));

Student min = s1;

for(Long X : students.keySet()) {
	//System.out.println(X +" " + students.get(X));
	
//}
//if( students.get(X).getGender().equals("female")) {
//   //System.out.println(students.get(X));
//		
//	}

if( students.get(X).getAge() < min.getAge()) {
min = students.get(X);
	
}
	}


System.out.println(min);


//HashMap<Long ,Student> AbstentStudent = new HashMap<>();
//for(Long Z : students.keySet() ) {
//	if(students.get(Z).isPresent() == false) {
//		AbstentStudent.put(Z , students.get(Z));
//		}
//	
//}

	
//for(Long E : AbstentStudent.keySet()) {
//	
//	//System.out.println(E +" "+ AbstentStudent.get(E));
//}



Iterator<Student> itr = students.values().iterator();

while(itr.hasNext()) {
	if(itr.next().getDepart().equals("it")) {
		itr.remove();
		
	}
}
students.forEach((d ,c ) -> System.out.println(d+"" + c));


//Iterator<Student> itr = students.values().iterator();
//
//while(itr.hasNext()) {
//	if(itr.next().getAge() > 27 && itr.next().getDepart().equals("cse")) {
//		itr.remove();
//		
//	}
//	
//	}
//
//students.forEach((d ,c ) -> System.out.println(d+"" + c));

}
}

