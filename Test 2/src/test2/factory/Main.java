package test2.factory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		
		IShowFactory theatreFactory = new TheatreFactory();
		List<String> list = Arrays.asList("Ionut Niculae", "Iordan Razvan", "Chirita Laura", "Lupului Stefan", "Opritescu Alexandra");
		IShow theatre = theatreFactory.createShow("Pijamale", "Sala Luceafarul", "22 aprilie ora 20:00", list);
		System.out.println(theatre.getName());
		theatre.printDetails();
		
		IShowFactory standupFactory = new StandUpFactory();
		list = Arrays.asList("Bordea", "Micutzu", "Geanina");
		IShow standup = standupFactory.createShow("Viata la tara", "Centru", "5 mai ora 21:00", list);
		standup.printDetails();
		
		IShowFactory concertFactory = new ConcertFactory();
		list = Arrays.asList("Rap", "BUG Mafia", "Dragonu", "Jonel");
		IShow concert = concertFactory.createShow("Festival", "Constanta", "2024", list);
		concert.printDetails();
		
		Client client = new Client();
		IPoster posterTheatre = (TheatreLogo) client.create("Theatre");
		posterTheatre.print();
		IPoster clonedTheatre = posterTheatre.clone();
		clonedTheatre.print();
		
	}

}
