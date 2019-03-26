package generics_05;

public class DuoUtilityApp {

   public static void main(String[] args) {
      Duo<String> ds = new Duo<>("Hello","World");
      Duo<Integer> di = new Duo<>(4,7);
      Duo<Number> dn = new Duo<Number>(5,8);
      
      DuoUtility.printUpper(ds);
      DuoUtility.printDuo(ds);     
      DuoUtility.printDuo(di);
      
      DuoUtility.printSum(di);
      DuoUtility.printSum(dn);
      
      DuoUtility.method(dn);
   }

}
