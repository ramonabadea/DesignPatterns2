package behavioral.patterns;

public class visitorOne implements IVisitor{
	public void visit(IElement element) {
		Carte carte = (Carte) element;
		carte.bookmarkColour = "pink";
	}
}
