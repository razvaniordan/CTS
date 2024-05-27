package test2.factory;

import java.util.List;

public class ConcertFactory implements IShowFactory {

	@Override
	public IShow createShow(String title, String location, String dateTime, List<String> list) {
		String genre = list.get(0);
		List<String> artists = list.subList(1, list.size());
		return new Concert(title, location, dateTime, genre, artists);
	}

}
