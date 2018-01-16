package structural.patterns;

public class Sectiune {
	private String text;
	
	Sectiune(String n)
	{
		text = n;
	}
	public void print() {
		System.out.println("Sectiune: "+text);
	}
}
