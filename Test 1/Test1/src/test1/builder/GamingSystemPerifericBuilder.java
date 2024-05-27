package test1.builder;

public class GamingSystemPerifericBuilder implements IGamingSystemBuilder {
	
	private IGamingSystem g2;
	GamingSystemPerifericBuilder() { this.g2 = new GamingSystemPeriferic(); }
	@Override
	public void buildMotherboard() {
		this.g2.setMotherboard("Placa de baza gaming 2");
	}
	@Override
	public void buildMemoryRAM() {
		this.g2.setMemoryRAM("Altceva 32GB");
	}
	@Override
	public void buildMemorySSD() {
		this.g2.setMemorySSD("Altceva 500GB");
	}
	@Override
	public void buildVideoCard() {
		this.g2.setVideoCard("AMD");
	}
	public void buildMouse() { ((GamingSystemPeriferic) g2).setMouse("Logitech"); }
	public void buildKeyboard() { ((GamingSystemPeriferic) g2).setKeyboard("RedDragon"); }
	public void buildHeadphones() { ((GamingSystemPeriferic) g2).setHeadphones("HyperX"); }
	public void buildCameraWeb() { ((GamingSystemPeriferic) g2).setCameraWeb("4K"); }
	public void buildGamingChair() { ((GamingSystemPeriferic) g2).setGamingChair("Blueline"); }
	@Override
	public IGamingSystem getIGamingSystem() {
		return this.g2;
	}
	
	
	
}
