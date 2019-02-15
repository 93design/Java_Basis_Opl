package be.intecbrussel.basis.exercise09_CarUml2;

public class FuelTank {

	private float litersFuel;
	private final float MAX_FUEL_CAPACITY = 60;
	
	public FuelTank(int amountFuel) {
		this.litersFuel = amountFuel;
	}
	
	public void addFuel(int fuel) {
		this.litersFuel =+ fuel;
		if(this.litersFuel > MAX_FUEL_CAPACITY) {
			System.out.println("Watch out with fire, fuel has been spilled");
			this.litersFuel = 60;
		}
	}
	
	public void removeFuel(int amount) {
		this.litersFuel -=amount;		
	}
	
	public boolean isEmpty() {
		boolean empty = false;
		if (litersFuel == 0) {
			empty = true;
		} else {
			empty = false;
		}
		
		return empty;
	}
	
	public boolean isFull() {
		boolean empty = false;
		if (litersFuel == MAX_FUEL_CAPACITY) {
			empty = true;
		} else {
			empty = false;
		}
		
		return empty;
	}

	public float getLitersFuel() {
		return litersFuel;
	}

	public void setLitersFuel(float litersFuel) {
		this.litersFuel = litersFuel;
	}

	public float getMAX_FUEL_CAPACITY() {
		return MAX_FUEL_CAPACITY;
	}
	
	
	
	

}
