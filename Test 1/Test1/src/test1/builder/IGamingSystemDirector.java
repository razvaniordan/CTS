package test1.builder;

public class IGamingSystemDirector {
	private IGamingSystemBuilder builder;
	
	IGamingSystemDirector(IGamingSystemBuilder builder)
	{
		this.builder = builder;
	}
	
	public void buildIGamingSystem()
	{
		builder.buildMemoryRAM();
		builder.buildMemorySSD();
		builder.buildMotherboard();
		builder.buildVideoCard();
		if(builder instanceof GamingSystemPerifericBuilder) {
			((GamingSystemPerifericBuilder) builder).buildCameraWeb();
			((GamingSystemPerifericBuilder) builder).buildGamingChair();;
			((GamingSystemPerifericBuilder) builder).buildHeadphones();
			((GamingSystemPerifericBuilder) builder).buildKeyboard();
			((GamingSystemPerifericBuilder) builder).buildMouse();
		}
	}
	
	public IGamingSystem getIGamingSystem() { return builder.getIGamingSystem(); }

}
