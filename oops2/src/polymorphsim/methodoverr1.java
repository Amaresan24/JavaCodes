package polymorphsim;

public class methodoverr1 {
public static void main(String args[]) {
	
	
	ActionMovie a = new ActionMovie();
	//a.getFight(2);
	System.out.println(a.getFight(4));
	
	
}	
	
}

class Movie {
	
public String getFight(int a) {
 return  "good movie";
}	
}
  class ActionMovie extends Movie {
	  
	  public String getFight(int b) {
		  if(b ==3) {
      return "Normal Movie";
		  }else if(b == 4) {
			  return "Good Action Movie";
			  
		  }else if(b==5) {
			  return "Full";
		  }else {
			  return "Invalid";
		  }
		  
		  
		  
	  }
	  
  } 
