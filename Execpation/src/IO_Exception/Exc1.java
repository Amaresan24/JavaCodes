package IO_Exception;
import java.io.*; 

public class Exc1 {
public static void main(String args[])throws IOException {
	File f = new File("C:/Users/ASUS/Desktop/Amaresh/Amaresh.txt");
	
	FileReader fr = new FileReader(f);
	int temp = 0;
	while((temp = fr.read()) !=-1) {
		System.out.print((char)temp);
		
			}
	
}
	
	
}
