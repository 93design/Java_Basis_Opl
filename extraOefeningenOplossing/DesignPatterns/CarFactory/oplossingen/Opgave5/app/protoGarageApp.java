package app;


import garage.Car;
import garage.Color;
import garage.Garage;
import garage.GarageFullException;
import garage.ProtoGarage;
import garage.VehicleAlreadyInGarageException;

public class protoGarageApp {
	
	

	public static void main(String[] args) {	

		ProtoGarage secret = new ProtoGarage();	
		System.out.println("--------------------------------");
		System.out.println("    10 protoype cars");
		System.out.println("--------------------------------");
		secret.protoCars(50);		
		secret.printGarage();
		System.out.println();
		System.out.println(secret.vehicles[0].toString());
	}

}
