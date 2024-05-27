package test2.factory;

import java.util.List;

public interface IShowFactory {
	IShow createShow(String title, String location, String dateTime, List<String> list);
}
