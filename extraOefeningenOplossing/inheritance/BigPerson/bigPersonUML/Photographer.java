package bigPersonUML;

import java.util.Arrays;

public class Photographer extends Person {

	@Override
	public void showMyHobbies() {
		System.out.println(Arrays.toString(this.getHobbies()));

	}

}
