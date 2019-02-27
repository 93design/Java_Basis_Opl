package carEnum;

public enum BrandType {
	
	BMW(1800),PEUGOT(1200),PORSCHE(1200),TESLA(3000);
	
	private double weight;

	private BrandType(double weight) {
		this.weight = weight;
	}
	
	

}
