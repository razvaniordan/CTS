package example3;

public class ThirdPartyLogger implements CustomLogging {
	private ApplicationInterface app;
	
	public ThirdPartyLogger(ApplicationInterface app) {
		this.app = app;
	}

	@Override
	public void translateCall() {
		app.logger();
	}
}
