package creational.patterns;

public interface IBuilder {
	public bookCover buildCover(String title);
	public bookNoPages buildPages(int number);

}
