package oop;

public class RBC implements IRate{

	@Override
	public void setRate() {
		System.out.println("Set rate to 0.5");
		
	}

	@Override
	public void increaseRate() {
		System.out.println("Increse rate");	
		
	}
	public void setTerm(int term) {
		System.out.println("Setting the term to: "+ term + " years.");
	}
	
	public void setAmortSchedule() {
		System.out.println("Amortization Schedule");	
	}

}
