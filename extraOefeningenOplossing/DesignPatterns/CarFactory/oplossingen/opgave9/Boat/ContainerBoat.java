package Boat;

import garage.Car;

public class ContainerBoat extends Boat {

	Container<Object> container1;
	ThreeContainer<Object, Object, Object> container2;
	AnimalContainer<Animal> container3;
	ThreeCarContainer<Car, Car, Car> container4;

	public ContainerBoat() {
		
	}

	public void setContainerOne(Object in) {
		container1 = new Container(in);
	}

	public void setContainerTwo() {

	}

	public void setContainerThree() {

	}

	public void setContainerFour() {

	}

}
