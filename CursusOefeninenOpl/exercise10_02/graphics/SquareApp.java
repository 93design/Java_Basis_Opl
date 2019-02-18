package be.intecbrussel.basis.exercise10_02.graphics;

public class SquareApp {
	public static void main(String[] args) {
		Square square = new Square();
		square.setPosition(10,30);	
		System.out.println("X: " + square.getX());
		System.out.println("Y: " + square.getY());
		System.out.println("Area: " + square.getArea());
		System.out.println("Perimeter: " + square.getPerimeter());		
	}
}
