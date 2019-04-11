package jamie;


public enum MenuKaart {
	
 

	SOURGREEN(new Mixable[] {new Apple(Apple.Type.SOUR),new Apple(Apple.Type.SOUR),new Orange()}),
	REDDELIGHT(new Mixable[] {new Apple(Apple.Type.SOUR),new Apple(Apple.Type.SOUR),new Orange()}),
	VEGISOUR(new Mixable[] {new Apple(Apple.Type.SOUR),new Apple(Apple.Type.SOUR),new Orange()});
	
	private Mixable[] mix;
	
	MenuKaart(Mixable[] smoothie) {
		this.mix = smoothie;
	}

	public Mixable[] getMix() {
		return mix;
	}

	public void setMix(Mixable[] mix) {
		this.mix = mix;
	}

	


}
