package practicesquestions;

public class LibraryBook {
public static void main(String args[]) {
	
//	14. Library Book Class Program
//	   - Create a Java class named `LibraryBook`.
//	   - Declare variables `title`, `author`, `genre`, and `isBorrowed`.
//	   - Write a main method to create two instances of `LibraryBook`.
//	   - Assign values to the attributes of each book and print out their details.
	
LibraryBooks book1 = new LibraryBooks();
  book1.name ="The Lord of the Rings";
  book1.author = "J.R.R.Tolkien";
  book1.genre = "Fantasy";
  book1.isBorrowed = true;
  
 LibraryBooks book2 = new LibraryBooks();
  book2.name ="To Kill a Mockingbird";
  book2.author = "Harper Lee";
  book2.genre = "drama";
  book2.isBorrowed = false;
  
 System.out.println("Book1="+book1.name +","+book1.author+ ","+book1.genre + ","+ book1.isBorrowed );
 System.out.println("Book2="+book2.name +","+book2.author+","+ book2.genre + ","+ book2.isBorrowed ); 
  
}

}
class LibraryBooks{
	String name;
	String author;
	String genre;
	boolean isBorrowed;
}
