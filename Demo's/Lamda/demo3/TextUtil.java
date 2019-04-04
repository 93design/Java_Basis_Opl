package org.rastalion.chapter18_lambda_expressions.demo3;

public interface TextUtil {
    public static String quote(String s) {
        return String.format("<<%s>>", s);
    }

}
