package loops;

public class forloopcon2 {
public static void main(String args[]) {
	
//String name = "education";
Word w1 = new Word();
String name1 = "education";
w1.getVowels(name1);

	
}
	
}


class Word {
	
public void getVowels(String name) {
	for(int i = 0 ; i<name.length(); i++) {
		char check = name.charAt(i);
	if(check == 'a' || check == 'e' || check =='i' || check =='o' || check == 'u') {
		continue;	
		//System.out.println( i + " Vowels  = "+ check);
	}else {
		
		System.out.println( i +" consonats = "+check);
	}
		}
	
}	
	
	
}
	


