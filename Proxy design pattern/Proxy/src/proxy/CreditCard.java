package proxy;

public class CreditCard implements Payment {
	private String accountNumber;

	public CreditCard(String accountNumber) {
		this.accountNumber = accountNumber;
		validateAccount();
	}
	
	private void validateAccount() {
		System.out.println("Validating account: " + accountNumber);
	}
	
	@Override
	public void pay(int amount) {
		System.out.println("Processing payment of $" + amount + " from account: " + accountNumber);
	}
}
