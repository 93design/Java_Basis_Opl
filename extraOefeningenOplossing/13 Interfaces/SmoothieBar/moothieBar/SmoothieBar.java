package moothieBar;

public class SmoothieBar {

	public void makeSmoothies() {
		Smoothie bananaSlide = new Smoothie(SmoothieTypes.BANANA_SLIDE);
		bananaSlide.mixSmoothie();
		
		System.out.println();
		Smoothie vegieSlurry = new Smoothie(SmoothieTypes.VEGIE_SLURRY);
		vegieSlurry.mixSmoothie();
		
		
		Mixable[] special = new Mixable[] {new Orange(), new Lemon(),new Spinache(), new Apple()};
		System.out.println();
		Smoothie specialSmoothie = new Smoothie(special);
		specialSmoothie.mixSmoothie();
		
	}
	
	
	

}
