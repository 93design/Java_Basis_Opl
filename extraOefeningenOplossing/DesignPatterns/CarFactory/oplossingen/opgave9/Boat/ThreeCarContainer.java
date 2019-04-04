package Boat;

import garage.Car;

public class ThreeCarContainer<T extends Car, T2 extends Car, T3 extends Car> {

	T car1;
	T car2;
	T car3;

	public ThreeCarContainer(T in, T in2, T in3) {
		super();
		car1 = in;
		car2 = in2;
		car3 = in3;
	}

}
