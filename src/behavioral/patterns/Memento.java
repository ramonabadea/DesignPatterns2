package behavioral.patterns;

public class Memento {
	int bookmarkNumber;
	String bookmarkColour;
	
	   public Memento(int bookmarkNumber, String bookmarkColour){
		      this.bookmarkNumber = bookmarkNumber;
		      this.bookmarkColour = bookmarkColour;
	   }

	   public String getState(){
	      return bookmarkNumber + ";" + bookmarkColour;
	   }	
}
