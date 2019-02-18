package be.intecbrussel.basis.exercise10_03.graphics;

public class SquareApp {
	public static void main(String[] args) {
		Square square = new Square();
		square.setPosition(10,30);	
		square.setSide(5);
			
		System.out.println("X: " + square.getX());
		System.out.println("Y: " + square.getY());
      System.out.println("Width: " + square.getWidth());  
      System.out.println("Height: " + square.getHeight()); 
      System.out.println("Side: " + square.getSide());   
		System.out.println("Area: " + square.getArea());
		System.out.println("Perimeter: " + square.getPerimeter());	
	}
}
