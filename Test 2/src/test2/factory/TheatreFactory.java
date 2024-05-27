package test2.factory;

import java.util.List;

public class TheatreFactory implements IShowFactory {

	@Override
	public IShow createShow(String title, String location, String dateTime, List<String> list) {
		String regizor = list.get(0);
		List<String> actors = list.subList(1, list.size());
		return new Theatre(title, location, dateTime, regizor, actors);
	}
	
}
