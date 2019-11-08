package Practical;

public class BankAccountApp {

	public static void main(String[] args) {
		BankAccount acc1 = new BankAccount("467799065",1000);
		BankAccount acc2 = new BankAccount("466884395",2000);
		BankAccount acc3 = new BankAccount("029374392",2500);
		
		acc1.setName("SBZMX");
		System.out.println(acc1.getName());
		acc1.makeDeposit(500);
		acc1.makeDeposit(600);
		acc1.paybill(1000);
		acc1.accrue();
		System.out.println(acc1.toString());
	}
		
	}


class BankAccount implements IInterest{
	//properties of bank account
	private String accountNumber; //id+2dig number+first 2 of ssn
	private static final String routingNumber = "005400675";
	private String name;
	private String SSN;
	private double balance;
	private static int ID = 1001; //internal ID
	
	//Constructor
	public BankAccount(String SSN,double initDeposit) {
		balance =initDeposit;
		this.SSN = SSN;
		ID++;	
		setAccountNumber();
		
	}
	private void setAccountNumber() {
		int random = (int)(Math.random() * 100);
		accountNumber = ID + random + SSN.substring(0,2);
		System.out.println("Your Accoun Number:" + accountNumber);
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSSN() {
		return SSN;
	}
	public void setSSN(String sSN) {
		SSN = sSN;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public static int getID() {
		return ID;
	}
	public static void setID(int iD) {
		ID = iD;
	}
	public static String getRoutingnumber() {
		return routingNumber;
	}
	public void paybill(double amount) {
		balance = balance - amount;
		System.out.println("paying bill:" + amount);
		showBalance();
	}
	public void makeDeposit(double amount) {
		balance = balance + amount;
		System.out.println("Making deposit:" + amount);
		showBalance();
	}
	public void showBalance() {
		System.out.println("Balance:" + balance);
	}
	@Override
	public void accrue() {
		balance = balance *(1+rate/100);
		showBalance();
	}
	@Override
	public String toString() {
		return "[Name:"+ name +"]\n[Account Number;" +"]\n" + "[RountingNumber:]" + routingNumber +"]\n" + "[Balance: " + balance +"]"; 
		
	}
}