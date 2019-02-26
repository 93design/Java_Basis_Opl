package be.intecbrussel.basis.exercise11_01;

public enum Planet {
	
	MERCURUIS(0.1, 57_910),VENUS(0.9,108_208_930),AARDE(1, 149_597_870),MARS(0.1,227_936_640), JUPITER(318,778_412_010),SATURNUS(95,1_426_725_400),URANUS(15,2870972200D),NEPTUNUS(17,4_498_252_900D);
	
	private double weigth = 0;
	private double distance = 0;
	
	Planet(double weigth, double distance) {
		this.weigth = weigth;
		this.distance = distance;
	}

	public double getWeigth() {
		return weigth;
	}
	
	public double getDistance() {
		return distance;
	}

	
}
