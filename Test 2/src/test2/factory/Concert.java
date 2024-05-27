package test2.factory;

import java.util.ArrayList;
import java.util.List;

public class Concert implements IShow {
	
	public String title;
	public String location;
	public String dateTime;
	public String genre;
	public List<String> artists;
	
	public Concert(String title, String location, String dateTime, String genre, List<String> artists) {
		this.title = title;
		this.location = location;
		this.dateTime = dateTime;
		this.genre = genre;
		this.artists = new ArrayList<>(artists);
	}
	
	@Override
	public void printDetails() {
		System.out.println("Concert [title=" + title + ", location=" + location + ", dateTime=" + dateTime + ", genre=" + genre
				+ ", artists=" + artists + "]");
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
