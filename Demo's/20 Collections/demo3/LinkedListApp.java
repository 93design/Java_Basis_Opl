package org.rastalion.chapter20_collections.demo3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Mrrobot on 27/11/2017 collections.
 *
 * Both ArrayList and LinkedList are
 * implementing the List interface, We will declare our
 * ref var as such. [polymorphism]
 *
 */
public class LinkedListApp {
    public static void main (String[] args) {

        //Use the ArrayList when only wanting to remove last
        //part of the ArrayList
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        //Otherwise use the LinkedList
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        
    

        //Here we use our static method. We can give
        //both lists as arguments to the method.
        //Thanks to polymorphism!
        doTimings("ArrayList", arrayList);
        doTimings("LinkedList", linkedList);
    }

    private static void doTimings (String type, List<Integer> list) {
        //1E5 = 100.000 [E5 == 00.000]
        long startTime = System.currentTimeMillis();



        for (int i =0; i < 1E5; i++) {
            //We are using the add method inherited
            //from the Collection interface
            list.add(i);
        }
  



//        for (int i =0; i < 1E5; i++) {
//            list.add(0, i);
//        }

        long endTime = System.currentTimeMillis();

        System.out.println("Time taken for adding: "
                + (endTime-startTime) + " ms for " + type);

        startTime = System.currentTimeMillis();

       /*
          Here you can show the difference

          The reason why we make use of giving List as dataType
          is because that way we can test our code and easily
          change the instance to be one or the other class
          [Optional]: Show the difference in remove implementation between Linked vs Array | List
        */

        for (int i = 0; i < list.size(); i++) {
            //Lets dive in the ArrayList class
            list.remove(i);
        }

//        for (int i =0; i < list.size(); i++){
//            //now you have the speed, mah boiiiii
//            list.remove(list.size() -1);
//        }

        endTime = System.currentTimeMillis();

        System.out.println("Time taken for removing: "
                + (endTime-startTime) + " ms for " + type);
    }

}
