package app;


import garage.Cabriolet;
import garage.Car;
import garage.Color;
import garage.FamilyCar;

public class FamilyCarAppSmall {

	public static void main(String[] args) {

		
		System.out.println("--------------------------------");
		System.out.println("    Cabriolet setters");
		System.out.println("--------------------------------");
		FamilyCar familyCar1 = new FamilyCar(Color.BLACK); 
		FamilyCar familyCar2 = new FamilyCar(Color.BLACK); 
		
		
			System.out.println(familyCar1.equals(familyCar2));
		
		
	}

}
