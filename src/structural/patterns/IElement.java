package structural.patterns;

public interface IElement {
	public void add(IElement elem) throws Exception;
	public void remove(IElement el) throws Exception;
	public IElement get(int i)throws Exception;
	public void print();
}	
