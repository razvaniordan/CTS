package test2.factory;

public class TheatreLogo implements IPoster {
	private String poster;
	
	public TheatreLogo() throws InterruptedException {
		System.out.println("Poster initiating..");
		Thread.sleep(3000);
		System.out.println("Poster initiated");
		this.poster = "Theatre";
	}
	
	public TheatreLogo(String poster) {
		this.poster = poster;
	}

	@Override
	public void print() {
		System.out.println("Poster: " + poster);
	}
	
	public IPoster clone() {
		TheatreLogo copy = null;
		try {
			copy = new TheatreLogo();
			copy.poster = this.poster;
			return copy;
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
	}
}
