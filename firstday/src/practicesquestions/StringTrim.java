package practicesquestions;

public class StringTrim {
public static void main(String args[]) {
	String str = "    Hello java   program   ";
	int len = str.length();
	String str1 = str.trim();
	int len1 = str1.length();
	System.out.println("Before trim="+len);
	System.out.println("After trim="+len1);
	
	
}

}
