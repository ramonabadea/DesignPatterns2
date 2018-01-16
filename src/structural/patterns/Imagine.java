package structural.patterns;

public class Imagine extends AbstractElem {
	private String fileName;
	private Imagine newImg;
	
	Imagine(String fileN)
	{
		fileName = fileN;
		newImg = loadFromFile(fileN);
	}
	public void print() {
		System.out.println("File :"+fileName);
	}
	public Imagine loadFromFile(String path)
	{
		
		return null;
	}
}
 
