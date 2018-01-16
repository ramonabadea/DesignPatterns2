package creational.patterns;

public class bookBuilder implements IBuilder{
	public bookCover buildCover(String title) {
		return new bookCover(title);
	}
	
	public bookNoPages buildPages(int noPages) {
		return new bookNoPages(noPages);
	}
}
