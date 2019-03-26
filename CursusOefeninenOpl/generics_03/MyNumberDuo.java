package generics_03;

public class MyNumberDuo<E extends Number> extends Duo<E> {
   public MyNumberDuo(E first, E second) {
      super(first, second);
   }
}
