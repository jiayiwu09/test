package oop;

public class BankAccount implements IRate{
	String accountNumber;
	private static final String rountingNumber="7824702398";
	String name;
	String ssn;
	String accountType;
	double balance;
	
	
	BankAccount(){
		System.out.println("NEW ACCOUNT CREATED");
	}
	BankAccount(String accountType){
		System.out.println("NEW ACCOUNT :"+ accountType);
	}
		BankAccount(String accountType, double initDeposit){
			System.out.println("NEW ACCOUNT :"+ accountType);
			System.out.println("Inital Deposit:$"+ initDeposit);
			String Msg=null;
			if (initDeposit<1000)
			{
				Msg="Error";
			}else {
				Msg ="Thank you for your initial depoist:$"+initDeposit;
			}
			System.out.println(Msg);
			balance=initDeposit;
			
		
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
		public String getSsn() {
			return ssn;
		}
		public void setSsn(String ssn) {
			this.ssn = ssn;
		}
		public String getAccountType() {
			return accountType;
		}
		public void setAccountType(String accountType) {
			this.accountType = accountType;
		}
		public double getBalance() {
			return balance;
		}
		public void setBalance(double balance) {
			this.balance = balance;
		}
		
		
	void deposit(double amount) {
		balance=balance+amount;
		showActivity("Deposit");
		
	}
	void withdraw(double amount) {
		balance=balance+amount;
		showActivity("withdraw");
		
	}
	private void showActivity(String activity) {
		System.out.println("your recent transaction:"+ activity);
		System.out.println("your new balance is:"+ balance);
	}
	void checkbalance() {
		System.out.println("Balance: " + balance);
		
	}
	void getStatus() {
		
	}
	public String toString() {
		return "[NAME:" +name +".Accountnumber:" +accountNumber+". ROUTING#:"+rountingNumber+".Balance: $ "+ balance +"]";
		
		
	}
	@Override
	public void setRate() {
		System.out.println("SETTING RATE");
		// TODO Auto-generated method stub
		
	}
	@Override
	public void increaseRate() {
		System.out.println("Inceasing RATE");
		// TODO Auto-generated method stub
		
	}
}
