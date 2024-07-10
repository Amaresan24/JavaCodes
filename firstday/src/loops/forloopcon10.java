package loops;

public class forloopcon10 {
public static void main(String args[]) {
String name = "AmArEsH";
String capName = name.toUpperCase();
int count = 0;
for(int i = 0; i<=name.length()-1; i++) {
  char  check = name.charAt(i);
if(check == capName.charAt(i)){
		count = count + 1;
	  }
}
System.out.println(count);	
	
	
}	

}
