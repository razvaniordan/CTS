package test2.factory;

import java.util.ArrayList;
import java.util.List;

public class StandUpFactory implements IShowFactory {

	@Override
	public IShow createShow(String title, String location, String dateTime, List<String> list) {
		List<String> comediants = new ArrayList<>(list);
		return new StandUp(title, location, dateTime, true, comediants);
	}
	
}
