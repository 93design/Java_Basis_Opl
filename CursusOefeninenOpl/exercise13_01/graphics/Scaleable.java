package be.intecbrussel.basis.exercise13_01.graphics;

public interface Scaleable {
   public static final int QUARTER = 25;
   public static final int HALF = 50;
   public static final int DOUBLE = 200;
   
   public abstract void scale(int factor);
	
}
