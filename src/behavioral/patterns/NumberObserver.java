package behavioral.patterns;

public class NumberObserver extends Observer{
	
	   public NumberObserver(CarteSubject subject){
		      this.subject = subject;
		      this.subject.attach(this);
		   }

		   @Override
		   public void update() {
		      System.out.println( "Number String: " +  subject.getState()  ); 
		   }
		}


