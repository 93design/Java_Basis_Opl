package be.intecbrussel.basis.exercise08_04.graphics;

public class Rectangle {
	public int width;
	public int height;
	public int x;
	public int y;
		
	public void setWidth(int width){
		this.width = width;
	}
	
	public void setHeight(int height){
		this.height = height;
	}
		
	public void setPosition(int x, int y) {
		this.x = x;
		this.y = y;
	}
		
	public void grow(int d) {
		width+=d;
		height+=d;
	}	
}
