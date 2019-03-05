package bigPersonUML;

public class HobbyRoom {
	
	private  Hobby hobby;
	
	public HobbyRoom() {
		this(new Hobby());
	}
	
	public HobbyRoom(Hobby hobby) {
		this.hobby = hobby;
	}

	public Hobby getHobby() {
		return hobby;
	}

	public void setHobby(Hobby hobby) {
		this.hobby = hobby;
	}

	@Override
	public String toString() {
		return "HobbyRoom [hobby=" + hobby + "]";
	}
	
	
	
	
	
	

}
