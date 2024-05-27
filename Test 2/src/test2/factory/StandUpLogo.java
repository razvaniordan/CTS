package test2.factory;

public class StandUpLogo implements IPoster {
	private String poster;
	
	public StandUpLogo() throws InterruptedException {
		System.out.println("Poster initiating..");
		Thread.sleep(3000);
		System.out.println("Poster initiated");
		this.poster = "Stand Up";
	}
	
	public StandUpLogo(String poster) {
		this.poster = poster;
	}

	@Override
	public void print() {
		System.out.println("Poster: " + poster);
	}
	
	@Override
	public IPoster clone() {
		StandUpLogo copy = null;
		try {
			copy = new StandUpLogo();
			copy.poster = this.poster;
			return copy;
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
	}
}
