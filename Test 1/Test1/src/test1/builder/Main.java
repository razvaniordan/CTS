package test1.builder;

public class Main {

	public static void main(String[] args) {
		IGamingSystemBuilder builder = new GamingSystemBuilder();
		IGamingSystemDirector director = new IGamingSystemDirector(builder);
		director.buildIGamingSystem();
		IGamingSystem PC = director.getIGamingSystem();
		PC.printConfiguration();
		
		builder = new GamingSystemPerifericBuilder();
		director = new IGamingSystemDirector(builder);
		director.buildIGamingSystem();
		PC = director.getIGamingSystem();
		PC.printConfiguration();
	}

}
