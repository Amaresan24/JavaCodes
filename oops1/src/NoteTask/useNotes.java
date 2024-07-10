package NoteTask;

public class useNotes {
public static void main(String args[]) {
	///  composition.....start
	
	paperDetails  paper  = new paperDetails();	
	paper.brand = "camlin";
	paper.price = 56;
	paper.thickNess = "22MM";
	
	noteDetails  note = new  noteDetails();
	note.brand = "ClassMate";
	note.pages =  "192 pages";
	note.price =  150;
	note.isQuality = true;
	note.paperDetails1 = paper;
	
	System.out.println(note.brand +" "+ note.pages +" "+ note.price +" "+note.isQuality +"  "+ note.paperDetails1.brand +"  "
	+ note.paperDetails1.thickNess +"  "+ note.paperDetails1.price );
	
	/// composition.........End	
	
	
	
	
	
	
}	
}
