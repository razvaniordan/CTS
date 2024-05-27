package test1.builder;

public class GamingSystemBuilder implements IGamingSystemBuilder {
	
	private IGamingSystem g;
	GamingSystemBuilder() { this.g = new GamingSystem(); }
	@Override
	public void buildMotherboard() {
		this.g.setMotherboard("Placa de baza gaming");
	}
	@Override
	public void buildMemoryRAM() {
		this.g.setMemoryRAM("Kingston Fury 16GB");
	}
	@Override
	public void buildMemorySSD() {
		this.g.setMemorySSD("Kingston 1TB");
	}
	@Override
	public void buildVideoCard() {
		this.g.setVideoCard("NVIDIA RTX 3080");
	}
	@Override
	public IGamingSystem getIGamingSystem() {
		return this.g;
	}
	
}
