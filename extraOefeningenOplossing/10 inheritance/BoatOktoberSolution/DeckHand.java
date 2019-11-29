package BoatOktoberSolution;

public class DeckHand extends Person{
	public String nickName;
	

public DeckHand(String name, int age, String nickName) {
		super(name, age);
		this.nickName = nickName;
	}

	

	public String getNickName() {
	return nickName;
}



public void setNickName(String nickName) {
	this.nickName = nickName;
}



	@Override
	public String toString() {
	
		return super.toString();
	}

	
	
	

}
