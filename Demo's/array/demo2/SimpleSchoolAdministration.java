package org.rastalion.chapter7_arrays.demo2;

import java.util.Scanner;

/**
 * Created by Mrrobot on 6/04/2018 javabasics-workspace.
 */
public class SimpleSchoolAdministration {

    private static Scanner kbd = new Scanner(System.in);
    private static String studentName;
    private static String answerIsSattified;
    private static String yess = "Yess";
    private static String no = "No";
    private static int lengthList = 25;

    private static String[] listOfStudents = new String[lengthList];
    private static int[] gradesStundents = new int[lengthList];

    public static void main (String[] args) {

        for (int i = 0; i <= lengthList; i++) {
            isEmpty(gradesStundents[i]);
            setGrade(i);
            isEmpty(listOfStudents[i]);
            setStudent(i);
        }

    }

    private static boolean isEmpty (String s) {
        return s == null;
    }

    private static boolean isEmpty (int i) {
        return gradesStundents[i] == 0;
    }

    private static void setStudent (int index) {
        boolean condition = false;
        System.out.println("Please fill in the name of your student");
        do {
            studentName = kbd.next();
            condition = isSattisfied("Do you want to fill in another student");
        } while (isEmpty(studentName) || !condition);

    }

    private static void setGrade (int index) {
        do {
            System.out.println("Please fill in the grade of the student");
            gradesStundents[index] = kbd.nextInt();
        } while (gradesStundents[index] <= 0 || gradesStundents[index] > 10);
    }

    private static boolean isSattisfied (String message) {
        do {
            System.out.println(message);
            System.out.println("[ " + yess + " / " + no + " ]");
            answerIsSattified = kbd.next();
        } while (!answerIsSattified.equalsIgnoreCase(yess) || !answerIsSattified.equalsIgnoreCase(no));
        return answerIsSattified.equalsIgnoreCase(yess);
    }
}
