package proxy;

public class CreditCardProxy implements Payment {
	private CreditCard creditCard;
	private String accountNumber;
	
	public CreditCardProxy(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	@Override
	public void pay(int amount) {
		
		if (amount > 5000) {
			System.out.println("Amount is too high. No access.");
			return;
		}
		
		int hour = java.time.LocalTime.now().getHour();
		if (hour < 8 || hour > 20) {
			System.out.println("Time exceeded");
			return;
		}
		
		if (creditCard == null) {
			creditCard = new CreditCard(accountNumber);
		}
		creditCard.pay(amount);
	}
	
}
