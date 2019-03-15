package Walkman;

public class WalkMan {
	
	public String type;
	public Casette cassette = new Casette();

	public WalkMan(String type) {
		this.type = type;
	}

	public void play() {
		System.out.println("playing " + cassette.name);
	}
	
	public void stop() {
		
	}
	
	public void eject( ) {
		this.cassette = null;
	}
	
	public void record() {
		
	}
	
	//todo print hier de naam van de casette omgekeerd af
	void reverse() {
		
	}

	public Casette getCassette() {
		return cassette;
	}

	public void setCassette(Casette cassette) {
		this.cassette = cassette;
	}
	
	
}
