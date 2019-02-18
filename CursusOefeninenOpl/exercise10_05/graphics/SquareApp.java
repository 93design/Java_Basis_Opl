package exercise10_05.graphics;

public class SquareApp {
	public static void main(String[] args) {
		Square square1 = new Square();
		Square square2 = new Square(5);
		Square square3 = new Square(4,6,3);
		Square square4 = new Square(square3);
				
		square1.setSide(6);
		square1.setHeight(5);
		square1.setWidth(7);
		square1.setPosition(10,30);
		
		printSquare(square1);		
		printSquare(square2);		
		printSquare(square3);		
		printSquare(square4);			
	}

	private static void printSquare(Square square) {
		System.out.println("X: " + square.getX());
		System.out.println("Y: " + square.getY());
		System.out.println("Side: " + square.getSide());		
		System.out.println("Area: " + square.getArea());
		System.out.println("Perimeter: " + square.getPerimeter());
	}
}
