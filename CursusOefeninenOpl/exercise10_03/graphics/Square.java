package be.intecbrussel.basis.exercise10_03.graphics;

public class Square extends Rectangle {
   public int getSide() {
      return getHeight();
   }

   public void setSide(int side) {
      setHeight(side);
      setWidth(side);
   }
}
