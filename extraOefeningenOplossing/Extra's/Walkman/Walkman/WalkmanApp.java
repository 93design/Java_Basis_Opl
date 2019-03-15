package Walkman;

public class WalkmanApp {

	public static void main(String[] args) {
		
		WalkMan walk = new WalkMan("Panasonic");
		
		Casette casette = new Casette("Jhonny holiday", "Franse Chanson");
		
		walk.setCassette(casette);
		walk.play();

	}

}
