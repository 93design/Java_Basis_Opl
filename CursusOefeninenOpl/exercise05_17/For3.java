package exercise05_17;

public class For3 {
    public static void main(String[] args) {
        for (int power = 11; power < 100000; power *= 11) {
            System.out.println(power);
        }
        
        System.out.println("The end");
        
    }
}