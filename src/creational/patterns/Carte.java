package creational.patterns;

public class Carte {
	public bookCover coperta;
	public bookCover getCoperta() {
		return coperta;
	}
	public void setCoperta(bookCover coperta) {
		this.coperta = coperta;
	}
	public bookNoPages getPagina() {
		return pagina;
	}
	public void setPagina(bookNoPages pagina) {
		this.pagina = pagina;
	}
	public bookNoPages pagina;

	public void printOut2() {
		System.out.print(coperta.title + " " + pagina.noPages);
}
	
}