package org.rastalion.chapter7_arrays.demo1;

/**
 * Created by Mr Robot on 15/10/2017 array.
 */
public class Demo1 {


    static void endExcercise () {
        System.out.println("----------------------------------------");
    }

    public static void main (String[] args) {

        //FIRST WAY TO MAKE ARRAY
        int[] numbers;
        numbers = new int[]{12, 34, 34, 56};

        for (int index = 0; index < numbers.length; index++) {
            if (numbers[index] > 50) {
                numbers[index] = 50;
            }
            System.out.println(numbers[index]);
        }

        Demo1.endExcercise();

        //SECOND WAY TO MAKE ARRAY
        String text = "This sentence will be converted to array";
        String[] diffWords = text.split(" ");

        for (String s : diffWords) {
            System.out.println(s);
        }

        //THIRD WAY TO MAKE ARRAY
        char[] charCollection = text.toCharArray();
        for (char c : charCollection) {
            System.out.println(c);
        }

        Demo1.endExcercise();

        //FOURTH WAY TO MAKE ARRAY
        byte number3[] = new byte[10];

        number3[0] = 67;
        number3[1] = 15;
        number3[2] = 22;
        number3[3] = 33;
        number3[4] = 54;
        number3[5] = 78;
        number3[6] = 5;
        number3[7] = 1;
        number3[8] = 42;
        number3[9] = 34;

        for (byte b : number3) {
            System.out.println(b);
        }

    }


}
