package Boat;

import garage.Car;

public class ThreeContainer<T,T2,T3> extends Container<T> {
	
	private T content2;
	private T content3;
	
	public ThreeContainer(T in, T in2, T in3) {
		super(in);
		this.content2= in2;
		this.content3 = in3;
		
	}

}
