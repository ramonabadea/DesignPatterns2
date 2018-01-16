package behavioral.patterns;

public class visitorTwo implements IVisitor{
	public void visit(IElement element) {
		Carte carte = (Carte) element;
		carte.bookmarkNumber = 15;
	}

}
