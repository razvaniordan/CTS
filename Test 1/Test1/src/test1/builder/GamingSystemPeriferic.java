package test1.builder;

public class GamingSystemPeriferic implements IGamingSystem {
	
	private String motherboard;
	private String memoryRAM;
	private String memorySSD;
	private String videoCard;
	
	private String mouse;
	private String keyboard;
	private String cameraWeb;
	private String headphones;
	private String gamingChair;

	@Override
	public void setMotherboard(String motherboard) {
		this.motherboard = motherboard;
	}
	@Override
	public void setMemoryRAM(String memoryRAM) {
		this.memoryRAM = memoryRAM;
	}
	@Override
	public void setMemorySSD(String memorySSD) {
		this.memorySSD = memorySSD;
	}
	@Override
	public void setVideoCard(String videoCard) {
		this.videoCard = videoCard;
	}
	public void setMouse(String mouse) {
		this.mouse = mouse;
	}
	public void setKeyboard(String keyboard) {
		this.keyboard = keyboard;
	}
	public void setCameraWeb(String cameraWeb) {
		this.cameraWeb = cameraWeb;
	}
	public void setHeadphones(String headphones) {
		this.headphones = headphones;
	}
	public void setGamingChair(String gamingChair) {
		this.gamingChair = gamingChair;
	}
	@Override
	public void printConfiguration() {
		System.out.println("GamingSystemPeriferic [motherboard=" + motherboard + ", memoryRAM=" + memoryRAM + ", memorySSD="
				+ memorySSD + ", videoCard=" + videoCard + ", mouse=" + mouse + ", keyboard=" + keyboard
				+ ", cameraWeb=" + cameraWeb + ", headphones=" + headphones + ", gamingChair=" + gamingChair + "]");
	}

}
