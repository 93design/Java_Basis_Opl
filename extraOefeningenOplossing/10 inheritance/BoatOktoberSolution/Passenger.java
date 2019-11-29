package BoatOktoberSolution;

public class Passenger extends Person{
public String destination;

public Passenger(String name, int age, String destination) {
	super(name, age);
	this.destination = destination;
}

@Override
public String toString() {
	return "Passenger [destination=" + destination + "]";
}

}
