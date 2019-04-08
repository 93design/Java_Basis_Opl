package collections.collections_05;

import java.util.*;

public class BurgerApp {

   public static void main(String[] args) {
      Queue<BurgerOrder> orderQueue = new LinkedList<>();
      //Queue<BurgerOrder> orderQueue = new PriorityQueue<>();
      orderQueue.offer(new BurgerOrder("Homer",6));
      orderQueue.offer(new BurgerOrder("Bart",3));
      orderQueue.offer(new BurgerOrder("Marge",2));
      orderQueue.offer(new BurgerOrder("Lisa",1));
      
      BurgerOrder order = orderQueue.peek();
      
      while(order != null) {
         System.out.println("About to prepare order for " + order.getName());
         order = orderQueue.poll();
         System.out.printf("Peraring order for %s : %d burgers.%n",order.getName(),order.getNumber());
         order = orderQueue.peek();
      }
   }
}
