package creational.patterns;

public class Asamblator {

	public static void main(String[] args) {
		bookBuilder bBuilder = new bookBuilder();
		bookCover bCover = bBuilder.buildCover("It");
		bookNoPages bNPages = bBuilder.buildPages(1200);
		Carte IT = new Carte();
		IT.setCoperta(bCover);
		IT.setPagina(bNPages); 
		IT.printOut2();
	}

}
