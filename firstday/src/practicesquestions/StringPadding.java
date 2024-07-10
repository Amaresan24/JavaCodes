package practicesquestions;

public class StringPadding {
public static void main(String args[]) {
	
	String str = "hello";
    int paddinglen = 10;
    
    // Left padding
    String leftPad = String.format("%-" + paddinglen + "s", str);
    System.out.println("Left Padded String: '" + leftPad + "'");
    
    // Right padding
    String rightPad = String.format("%" + paddinglen + "s", str);
    System.out.println("Right Padded String: '" + rightPad + "'");
	
	
}

}
