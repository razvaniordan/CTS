package test1.builder;

public class GamingSystem implements IGamingSystem {
	
	private String motherboard;
	private String memoryRAM;
	private String memorySSD;
	private String videoCard;


	public void setMotherboard(String motherboard) {
		this.motherboard = motherboard;
	}
	public void setMemoryRAM(String memoryRAM) {
		this.memoryRAM = memoryRAM;
	}
	public void setMemorySSD(String memorySSD) {
		this.memorySSD = memorySSD;
	}
	public void setVideoCard(String videoCard) {
		this.videoCard = videoCard;
	}

	@Override
	public void printConfiguration() {
		System.out.println("GamingSystem [motherboard=" + motherboard + ", memoryRAM=" + memoryRAM + ", memorySSD=" + memorySSD
				+ ", videoCard=" + videoCard + "]");
	}

	
	
	
}
