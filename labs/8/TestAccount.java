
public class TestAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account1 = new Account(1001,10000, 2.9);
		Account account2 = new SavingsAccount();
		Account account3 = new CheckingsAccount();
		account1.deposit(5000);
		account1.withdraw(4500);
		System.out.println("\nAccount ID: " + account1.getID());
		System.out.println("Balance: " + account1.getBalance());
		System.out.println("Monthly Interest Rate: " 
		+ account1.getMonthlyInterestRate());
		System.out.println("Date created: " + account1.getDate());
		System.out.println("toString: " + account1.toString());
		System.out.println("toString: " + account2.toString());
		System.out.println("toString: " + account3.toString());
	}

}
