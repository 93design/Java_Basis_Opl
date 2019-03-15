package Walkman;

public class Casette {

	public String name;
	public String music;
	
	public Casette(String name, String music) {
		super();
		this.name = name;
		this.music = music;
	}

	public Casette(String name) {
		this(name, "");
	}

	public Casette() {
		this("", "");
	}
	
	
	
	
}
