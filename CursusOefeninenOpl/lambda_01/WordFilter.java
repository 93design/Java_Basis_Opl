package lambda_01;
@FunctionalInterface
public interface WordFilter {
   public boolean isValid(String s);
}
