package bigPersonUML;

import java.util.Arrays;

public class Gamer extends Person{
	
	private String nickName;
	
	
	
	@Override
	public void showMyHobbies() {
		System.out.println(Arrays.toString(this.getHobbies()));
	}
	
	public String getNickName() {
		return nickName;
	}




	public void setNickName(String nickName) {
		this.nickName = nickName;
	}




	@Override
	public String toString() {
		return "Gamer [nickName=" + nickName + ", getWeigth()=" + getWeigth() + ", getAge()=" + getAge()
				+ ", getPets()=" + Arrays.toString(getPets()) + ", getHobbies()=" + Arrays.toString(getHobbies())
				+ ", getHouse()=" + getHouse() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

	
	
	
	
}
