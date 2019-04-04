package lambda_02;

@FunctionalInterface
public interface WordFilter {
   public boolean isValid(String s);
}
