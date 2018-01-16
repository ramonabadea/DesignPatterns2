package behavioral.patterns;

public class Carte implements IElement{
	public void accept(IVisitor visitor) {
		visitor.visit(this);
	}
	
	int bookmarkNumber;
	String bookmarkColour;
	
	public Carte() {
		bookmarkNumber = 1;
		bookmarkColour = "black";
	}
	
	public void printOut() {
		System.out.print(bookmarkNumber + " " + bookmarkColour);
}
	
}
