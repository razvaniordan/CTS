package test2.factory;

public class ConcertLogo implements IPoster {
	private String poster;
	
	public ConcertLogo() throws InterruptedException {
		System.out.println("Poster initiating..");
		Thread.sleep(3000);
		System.out.println("Poster initiated");
		this.poster = "Concert";
	}
	
	public ConcertLogo(String poster) {
		this.poster = poster;
	}

	@Override
	public void print() {
		System.out.println("Poster: " + poster);
	}
	
	@Override
	public IPoster clone() {
		ConcertLogo copy = null;
		try {
			copy = new ConcertLogo();
			copy.poster = this.poster;
			return copy;
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
		
	}
	
	
	
	
}
