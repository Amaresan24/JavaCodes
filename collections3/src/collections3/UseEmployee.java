package collections3;
import java.util.*;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;
public class UseEmployee {
public static void main(String args[]) {
	
	
	
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
empDetails.add(new Employee( 26, "mari" , 45000, "Manger", "male"));
empDetails.add(new Employee( 27, "mari" , 45000, "Manger", "male"));
	


 List femaleEmp = empDetails.stream().filter(X -> X.getGender().equals("female")).collect(Collectors.toList());


 //femaleEmp.forEach(X -> System.out.println(X));

 
 
  Long maleEmpCount =  empDetails.stream().filter( X -> X.getGender().equals("male")).count();

  
  //maleEmpCount.forEach((Long) V -> System.out.println(V));
  

     List <String> empNames = empDetails.stream().map(X  -> X.getName()).collect(Collectors.toList());
     
     
    List <String> empDes = empDetails.stream().filter(A -> A.getSalary() > 30000).map(B -> B.getDesgination()).collect(Collectors.toList());
    		
    		

    
  List <Employee> newSalary = empDetails.stream().filter(C -> C.getDesgination().equals("Manger")).map(D ->{ 
	  int netSalary = D.getSalary() + (D.getSalary() * 10/100);
	D.setSalary(netSalary);
	return D;
  
  }).collect(Collectors.toList());
    
  
  
  
 //long ages = empDetails.stream().filter(h ->)
  
  
  
  
  
		  
    
//for(Employee S  : newSalary ) {
//	System.out.println(S);
//	
//} 
  
  //newSalary.forEach(F -> System.out.println(F));
  
  
  
  
 //////////////////////////////////////// 
  
  
  
  
  String var = "automobileeyyyyy11111";
  Map<Character,Long> each = var.chars().mapToObj(C ->(char) C).collect(Collectors.groupingBy( C -> C, Collectors.counting())); 
  
  each.entrySet().stream().filter(X -> X.getValue() >  1).map(Y -> Y.getKey()).forEach(G -> System.out.println(G));
  
  
  
  
  
  
  
  //.forEach(System.out::println);
  
  
  int [] nums = {45 , 4, 7, 4, 7, 8, 88, 8,10 , 10};
  
//List<Integer> repValues = Arrays.stream(nums).boxed().collect(Collectors.groupingBy(C->C,Collectors.counting()))
//  
//.entrySet().stream().filter(X -> X.getValue() > 1).map(y -> y.getKey()).toList();
//
//repValues.forEach(M -> System.out.println(M));


List<Integer> repValues = Arrays.stream(nums)
.boxed()
.collect(Collectors.groupingBy(c -> c, Collectors.counting()))
.entrySet()
.stream()
.filter(x -> x.getValue() > 1)
.map(Map.Entry::getKey)
.collect(Collectors.toList());

repValues.forEach(m -> System.out.println(m));


  

//.forEach(H -> System.out.println(H))
  
  //  checking Ascending Order and Descending order.............
  List<Integer>sh = Arrays.stream(nums).boxed().sorted((a ,b) -> b-a).collect(Collectors.toList());
  
 // sh.forEach(J -> System.out.print(J + " "));
  

/// find Second Max

 List<Integer>sh1 = Arrays.stream(nums).boxed().sorted((a ,b) -> b-a).limit(2).skip(1).collect(Collectors.toList());
  
  //sh1.forEach(J -> System.out.print(J + " "));
  
// find Max Value

 List<Integer>sh2 = Arrays.stream(nums).boxed().sorted((a ,b) -> b-a).limit(1).collect(Collectors.toList());
  
  //sh2.forEach(J -> System.out.print(J + " "));


/// compare to ojects.
  
  
//  
//Map<Employee , Employee> maxSalary = empDetails.stream().sorted(Comparator.
//		comparing(Employee::getSalary).reversed()).collect(Collectors.toList());
//
//maxSalary.forEach(X -> System.out.println(X));

//Map<Object ,Object> as = empDetails.stream().sorted(Comparator.comparing(Employee :: getSalary).reversed())
//.collect(Collectors.toMap(C -> C.getId(),d ->d.getSalary()));

//as.forEach((X,Y) -> System.out.println(X+""+Y));

  
 
 
 
 /// duplicate Character
 
 
 
 
 // find third  max number 
 int [] val = {10 , 23, 45, 56, 78, 9,};
 
 int thirdMax = Arrays.stream(val).boxed().sorted((a ,b) -> b-a).limit(3).skip(2).findFirst().get();
 System.out.println(thirdMax);
		 
 
 
 // 7.. 
 
 
//  find in  array  
 
 List<Integer> ll = Arrays.stream(val).boxed().filter( X -> X % 2 == 0).collect(Collectors.toList());
 
 System.out.println(ll);
 
 // find in list 
 
 List<Integer> lis = Arrays.asList( 12 , 45, 67, 89);
 List<Integer> va = lis.stream().filter(X -> (X % 2 == 0)).collect(Collectors.toList());
 System.out.println(va);
 
// 11.
  //int [] sk = {12 , 45, 7, 89, 78, 90};
   
  //int sum1 = Arrays.stream(sk).boxed().filter(C -> (C % 2==0)).mapToInt(i -> i.intValue()).sum();
 // System.out.println(sum);
  
  
  int [] sk = {12 , 45, 7, 89, 78, 90};
  Integer sum = Arrays.stream(sk).filter(c -> c % 2 == 0).sum();
   System.out.println(sum);

 
   //16 .
   
   
   
   
   
 
}	
	}
