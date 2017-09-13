
public class BankAccountTest
{
	public static void main(String[ ] args)
	{
		BankAccount myChecking = new BankAccount(1000.0);
		
		System.out.println("Initial balance: " + myChecking.getBalance( ));
		
		myChecking.addInterest(10);
		System.out.println("After 10% interest: " + myChecking.getBalance( ));

		myChecking.withdraw(100.0);
	
		myChecking.deposit(200.0);
		System.out.println("After a $200 deposit: " + myChecking.getBalance( ));
		
		myChecking.withdraw(500.0);
		System.out.println("After a $500 withdrawal: " + myChecking.getBalance( ));
		
		myChecking.withdraw(400.0);
		System.out.println("After a $400 withdrawal: " + myChecking.getBalance( ));
	
	}
}
