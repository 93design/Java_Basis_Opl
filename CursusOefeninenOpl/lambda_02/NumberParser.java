package lambda_02;

@FunctionalInterface
public interface NumberParser {
   public Double parse(String s);
}
