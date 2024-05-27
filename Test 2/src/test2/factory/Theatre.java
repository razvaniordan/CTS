package test2.factory;

import java.util.ArrayList;
import java.util.List;

public class Theatre implements IShow {

	public String title;
	public String location;
	public String dateTime;
	public String regizor;
	public List<String> actors;
	
	public Theatre(String title, String location, String dateTime, String regizor, List<String> actors) {
		this.title = title;
		this.location = location;
		this.dateTime = dateTime;
		this.regizor = regizor;
		this.actors = new ArrayList<>(actors);
	}
	
	@Override
	public void printDetails() {
		System.out.println("Theatre [title=" + title + ", location=" + location + ", date=" + dateTime + ", regizor=" + regizor
				+ ", actors=" + String.join(", ", actors) + "]");
	}

	@Override
	public String getName() {
		return title;
	}

	@Override
	public String getLocation() {
		return location;
	}

	@Override
	public String getDateTime() {
		return dateTime;
	}
	
}
