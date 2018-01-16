package behavioral.patterns;

public class Originator {
		int bookmarkNumber;
		String bookmarkColour;

	   public void setState(int bookmarkNumber, String bookmarkColour){
	      this.bookmarkNumber = bookmarkNumber;
	      this.bookmarkColour = bookmarkColour;
	   }

	   public String getState(){
	      return bookmarkNumber + ";" + bookmarkColour;
	   }

	   public Memento saveStateToMemento(){
	      return new Memento(bookmarkNumber, bookmarkColour);
	   }

	   public void getStateFromMemento(Memento memento){
	      bookmarkNumber = Integer.parseInt(memento.getState().split(";")[0]);
	      bookmarkColour = memento.getState().split(";")[1];
		  this.bookmarkNumber = bookmarkNumber;
		  this.bookmarkColour = bookmarkColour;
	   }
}