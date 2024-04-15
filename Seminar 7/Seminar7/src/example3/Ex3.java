package example3;

public class Ex3 {

	public static void main(String[] args) {
		CustomLogging adapter = new ThirdPartyLogger(new ApplicationInterface());
		adapter.translateCall();
	}

}
