package main;

import behavioral.patterns.*;

public class Main {

	public static void main(String[] args) {
		//Memento ex
		
		Carte Iona = new Carte();
		Originator originator = new Originator();
		CareTaker careTaker = new CareTaker();
		
		originator.setState(10,"green");
		careTaker.add(originator.saveStateToMemento());
		
		originator.setState(60, "purple");
		careTaker.add(originator.saveStateToMemento());
		
		originator.setState(764, "red");
		careTaker.add(originator.saveStateToMemento());
		
		System.out.println(careTaker.get(1).getState());
		
		careTaker.get(2).getState();
		
		//Observer ex
		CarteSubject subject = new CarteSubject();
	      new ColourObserver(subject);
	      new NumberObserver(subject);
	      subject.setState(155);
	    
	      System.out.println("First state change: 15");	
	      subject.setState(15);
	      System.out.println("Second state change: 10");	
	      subject.setState(10);
		
	      
	      
		//Visitor
		visitorOne Ana = new visitorOne();
		visitorTwo Bogdan = new visitorTwo();
		Iona.printOut();
		Iona.accept(Ana);
		Iona.printOut();
	}

}
