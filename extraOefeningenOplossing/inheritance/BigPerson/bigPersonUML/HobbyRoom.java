package bigPersonUML;

public class HobbyRoom {
	
	private final Hobby hobby;
	
	public HobbyRoom() {
		this(new Hobby());
	}
	
	public HobbyRoom(Hobby hobby) {
		this.hobby = hobby;
	}

	public Hobby getHobby() {
		return hobby;
	}
	
	
	

}
