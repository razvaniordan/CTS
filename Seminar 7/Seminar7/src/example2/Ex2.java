package example2;

public class Ex2 {

	public static void main(String[] args) {
		PaymentProcessor paypalAdapter = new PayPalAdapter(new PayPal());
		PaymentProcessor stripeAdapter = new StripeAdapter(new Stripe());
		paypalAdapter.processPayment(3000);
		stripeAdapter.processPayment(2500);
	}

}
