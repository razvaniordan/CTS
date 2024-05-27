package ro.ase.cts.decorator;

public class LoggingDecorator implements DataService {
	private DataService wrappee;
	
	LoggingDecorator (DataService wrappee){
		this.wrappee = wrappee;
	}

	@Override
	public String fetchData() {
		System.out.println("Fetching data...");
		return wrappee.fetchData();
	}
}
