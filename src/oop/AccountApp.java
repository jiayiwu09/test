package oop;

public class AccountApp {

	public static void main(String[] args) {
		RBC la = new RBC();
		la.increaseRate();
		la.setRate();
		la.setTerm(20);
		la.setAmortSchedule();
		
		IRate account1 =new RBC();
		account1.increaseRate();
		account1.setRate();

	}

}
