package graphics;
public class NegativeSizeException extends
   IllegalArgumentException {
   public NegativeSizeException() {
      super();
   }

   public NegativeSizeException(String message, Throwable cause) {
      super(message, cause);
   }

   public NegativeSizeException(String s) {
      super(s);
   }

   public NegativeSizeException(Throwable cause) {
      super(cause);
   }
}
