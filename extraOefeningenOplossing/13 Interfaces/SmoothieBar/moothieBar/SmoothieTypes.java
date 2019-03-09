 package moothieBar;

public enum SmoothieTypes {
	
	STRAWBERRY_DREAM(new Mixable[] {new Orange(), new Banana(),new StrawBerry()}),
	BANANA_SLIDE(new Mixable[] {new Banana(), new Banana(),new StrawBerry(), new Orange()}),
	CITRUS(new Mixable[] {new Orange(), new Orange(),new Orange(), new Lemon()}),
	VEGIE_SLURRY(new Mixable[] {new Orange(), new Celery(),new Spinache(), new Apple()});

	Mixable[] ingredient;
	
	SmoothieTypes(Mixable[] mix) {
		this.ingredient = mix;
	}
		
	

}
