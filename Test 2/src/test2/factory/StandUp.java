package test2.factory;

import java.util.ArrayList;
import java.util.List;

public class StandUp implements IShow {
	
	public String title;
	public String location;
	public String dateTime;
	public boolean licentiousLanguage;
	public List<String> comediants;
	
	public StandUp(String title, String location, String dateTime, boolean licentiousLanguage, List<String> comediants) {
		this.title = title;
		this.location = location;
		this.dateTime = dateTime;
		this.licentiousLanguage = licentiousLanguage;
		this.comediants = new ArrayList<>(comediants);
	}
	
	@Override
	public void printDetails() {
		System.out.println("StandUp [title=" + title + ", location=" + location + ", dateTime=" + dateTime + ", licentiousLanguage="
				+ licentiousLanguage + ", comediants=" + comediants + "]");
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
