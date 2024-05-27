package test1.builder;

public interface IGamingSystemBuilder {

	public void buildMotherboard();
	public void buildMemoryRAM();
	public void buildMemorySSD();
	public void buildVideoCard();
	
	public IGamingSystem getIGamingSystem();
}
