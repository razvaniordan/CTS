package proxy;

public class Main {

	public static void main(String[] args) {
		Payment payment = new CreditCardProxy("1234");
		
		payment.pay(1000);
		
		payment.pay(1500);
	}

}
