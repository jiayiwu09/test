package oop;

public class BankAccountApp{
	
	public static void main(String[] args) {
		BankAccount acc1=new BankAccount();
		
		acc1.setName("Roger Hue");
		System.out.println(acc1.getName());
		
		
		acc1.accountNumber="973827432";
		//acc1.name="Roger";
		acc1.balance = 10000.0;
		
		acc1.setRate();
		acc1.increaseRate();
		
		acc1.deposit(1500);
		acc1.deposit(1500);
		acc1.deposit(1500);
		acc1.withdraw(2000);
		
		System.out.println(acc1.toString());
		/*
	
		BankAccount acc2=new BankAccount("Checking Account");
		acc2.accountNumber="977432";
		acc2.deposit(1000.0);
		
		BankAccount acc3=new BankAccount("Savings Account",5000);
		acc3.accountNumber="9738272";
		acc3.checkbalance();
		
		
		CDAccount cd1=new CDAccount();
		cd1.balance=3000.0;
		cd1.interestRate="4.5";
		cd1.name="Juan";
		cd1.accountType="CD Account";
		System.out.println(cd1.toString());
		cd1.compount();
	*/
	}
}
