package behavioral.patterns;

public class ColourObserver extends Observer{
	
	   public ColourObserver(CarteSubject subject){
		      this.subject = subject;
		      this.subject.attach(this);
		   }

		   @Override
		   public void update() {
		      System.out.println( "Colour String: " +  subject.getState() ); 
		   }
		}


