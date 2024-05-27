package test2.factory;

import java.util.HashMap;
import java.util.Map;

public class Client {
	private Map<String, IPoster> posters = new HashMap<>();
	
	public Client() throws InterruptedException {
		posters.put("Theatre", new TheatreLogo());
		posters.put("Concert", new ConcertLogo());
		posters.put("StandUp", new StandUpLogo());
	}
	
	public IPoster create(String type) {
		return posters.get(type).clone();
	}
}
