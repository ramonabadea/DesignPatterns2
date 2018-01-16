package structural.patterns;

public class ImagineProxy extends AbstractElem{
	private String fileN;
	private Imagine realImg = null;
	public ImagineProxy(String fn) {
		this.fileN = fn;
	}
	public void print() {
		if(realImg == null){
			realImg = new Imagine(fileN);
		}
		realImg.print();
	}
}

