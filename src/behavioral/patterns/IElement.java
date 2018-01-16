package behavioral.patterns;

public interface IElement {
	public void accept(IVisitor visitor);
	public void printOut();
}
