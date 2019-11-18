package be.intecBrussel.brasserieApp;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Mrrobot on 5/10/2017 Brasserie de Koekoek.
 *
 */

public class BrasserieDeKoekoek {

    public static void main(String[] args) {

        //DECLARING & INITIALISING SCANNER OBJECT FOR USER INPUT
        Scanner kbd = new Scanner(System.in);

        //DECLARING THE INPUT VARIABLES
        int startHour = 0;
        int startMin = 0;
        int stopHour = 0;
        int stopMin = 0;
        int startDay = 0;

        //DECLARING VARIABLES FOR HOLDING TIME WORKED
        int resultHour;
        int resultMin;
        int totalResultMin;
        int minTillMidnight;
        int minAfterMidnight;

        //DECLARING FINAL VARIABLES FOR HOLDING PAYDAY INFO
        final int MINUTES_IN_HOUR = 60;
        final int HOURS_IN_DAY = 24;
        final int HUNDRED = 100;
        final double SALARY_PM_IN_CENT = ((11.5 * HUNDRED) / MINUTES_IN_HOUR);
        final double SATURDAY_BONUS = 1.25;
        final double SUNDAY_BONUS = 1.5;
        final int ZERO = 0;
        final int UPPER_LIMIT_HOURS = 23;
        final int UPPER_LIMIT_MINUTES = 59;

        double earnedPay;

        //DECLARING A VARIABLE FOR USER FEEDBACK
        String userFeedback = "Sorry, but the input given was not correct! \nPlease try again.";
        String messagePay = "You have earned: %.2f Euro.";

        //METHOD FOR INPUT START HOUR
        do {
            //Try catch is used to catch an exception when given wrong input
            try {
                System.out.println("Fill in the hour you started working. [0-23]");
                startHour = kbd.nextInt();
                //If true asked minutes started working otherwise ask new input
                System.out.println((startHour >= ZERO && startHour <= UPPER_LIMIT_HOURS) ? "Fill in the minutes you started working. [0-59]" :
                        userFeedback);
            } catch (InputMismatchException ime) {
                System.out.println(userFeedback);
                kbd.nextLine();     //this is used to clear buffer of the scanner object
            }
        } while (startHour < ZERO | startHour > UPPER_LIMIT_HOURS);

        //METHOD FOR INPUT START MINUTES
        do {
            try {
                startMin = kbd.nextInt();
                System.out.println((startMin >= ZERO && startMin <= UPPER_LIMIT_MINUTES) ? "Fill in the hour you stopped working. [0-23]" :
                        userFeedback);
            } catch (InputMismatchException ime) {
                System.out.println(userFeedback);
                kbd.nextLine();
            }
        } while (startMin < ZERO | startMin > UPPER_LIMIT_MINUTES);

        //METHOD FOR INPUT STOP HOUR
        do {
            try {
                stopHour = kbd.nextInt();
                System.out.println((stopHour >= ZERO && stopHour <= UPPER_LIMIT_HOURS) ? "Fill in the minutes you stopped working. [0-59]" :
                        userFeedback);
            } catch (InputMismatchException ime) {
                System.out.println(userFeedback);
                kbd.nextLine();
            }
        } while (stopHour < ZERO | stopHour > UPPER_LIMIT_HOURS);

        //METHOD FOR INPUT STOP MINUTES
        do {
            try {
                stopMin = kbd.nextInt();
                System.out.println((stopMin >= ZERO && stopMin <= UPPER_LIMIT_MINUTES) ? "\nThanks, I will commence the calculation.\n" +
                        "...\nBleep bloop bleep bleep." : userFeedback);
            } catch (InputMismatchException ime) {
                System.out.println(userFeedback);
                kbd.nextLine();
            }
        } while (stopMin < ZERO | stopMin > UPPER_LIMIT_MINUTES);

        //CALCULATING RESULT OF HOURS & MINUTES WORKED.

        //Check to see if you worked over midnight and calculate resultHour accordingly
        resultHour = (stopHour - startHour < ZERO) ? (stopHour - startHour) + HOURS_IN_DAY : stopHour - startHour;

        //Calculation total minutes worked.                                         EXAMPLES
        if (stopMin < startMin) {                                               // 22.15 | 2.00
            resultMin = (stopMin - startMin) + MINUTES_IN_HOUR;
            totalResultMin = (--resultHour * MINUTES_IN_HOUR) + resultMin;
        } else if (stopMin == startMin) {                                       // 22.00 | 2.00
            totalResultMin = resultHour * MINUTES_IN_HOUR;
            resultMin = ZERO;
        } else {                                                                // 22.00 | 2.15
            resultMin = stopMin - startMin;
            totalResultMin = resultMin;
        }

        //PRINT OUTCOME TO CONSOLE
        System.out.format("You have worked: %d hours and %d minutes\n", resultHour, resultMin);

        //METHOD TO DETERMINE DAY THAT USER STARTED WORKING
        do {
            try {
                System.out.println("\nPlease fill in the number of the day you started working\n" +
                        "Monday [1]\nTuesday [2]\nWednesday[3]\n...\nSunday[7]");
                startDay = kbd.nextInt();
            } catch (InputMismatchException ime) {
                System.out.println(userFeedback);
                kbd.nextLine();
            }
        } while (startDay <= ZERO | startDay > 7);

        //SWITCH STATEMENT TO CALCULATE HOW MUCH THE TOTAL SALARY OF USER IS
        switch (startDay) {
            case 1:
            case 2:
            case 3:
            case 4:
                earnedPay = (SALARY_PM_IN_CENT * totalResultMin) / HUNDRED;
                System.out.format(messagePay, earnedPay);
                break;
            case 5:
                if (startHour - stopHour <= ZERO) {
                    earnedPay = (SALARY_PM_IN_CENT * totalResultMin) / HUNDRED;
                    System.out.format(messagePay, earnedPay);
                } else {
                    minTillMidnight = (startMin != ZERO) ? ((HOURS_IN_DAY - startHour) * MINUTES_IN_HOUR) - startMin : (HOURS_IN_DAY - startHour) * MINUTES_IN_HOUR;
                    minAfterMidnight = (stopHour * MINUTES_IN_HOUR) + stopMin;
                    earnedPay = (SALARY_PM_IN_CENT * minTillMidnight);
                    earnedPay += ((SALARY_PM_IN_CENT * minAfterMidnight) * SATURDAY_BONUS);
                    earnedPay /= HUNDRED;
                    System.out.format(messagePay, earnedPay);
                }
                break;
            case 6:
                if (startHour - stopHour <= ZERO) {
                    earnedPay = ((SALARY_PM_IN_CENT * totalResultMin) * SATURDAY_BONUS) / HUNDRED;
                    System.out.format(messagePay, earnedPay);
                } else {
                    minTillMidnight = (startMin != ZERO) ? ((HOURS_IN_DAY - startHour) * MINUTES_IN_HOUR) - startMin : (HOURS_IN_DAY - startHour) * MINUTES_IN_HOUR;
                    minAfterMidnight = (stopHour * MINUTES_IN_HOUR) + stopMin;
                    earnedPay = (SALARY_PM_IN_CENT * minTillMidnight) * SATURDAY_BONUS;
                    earnedPay += ((SALARY_PM_IN_CENT * minAfterMidnight) * SUNDAY_BONUS);
                    earnedPay /= HUNDRED;
                    System.out.format(messagePay, earnedPay);
                }
                break;
            case 7:
                if (startHour - stopHour <= ZERO) {
                    earnedPay = ((SALARY_PM_IN_CENT * totalResultMin) * SUNDAY_BONUS) / HUNDRED;
                    System.out.format(messagePay, earnedPay);
                } else {
                    minTillMidnight = (startMin != ZERO) ? ((HOURS_IN_DAY - startHour) * MINUTES_IN_HOUR) - startMin : (HOURS_IN_DAY - startHour) * MINUTES_IN_HOUR;
                    minAfterMidnight = (stopHour * MINUTES_IN_HOUR) + stopMin;
                    earnedPay = (SALARY_PM_IN_CENT * minTillMidnight) * SUNDAY_BONUS;
                    earnedPay += (SALARY_PM_IN_CENT * minAfterMidnight);
                    earnedPay /= HUNDRED;
                    System.out.format(messagePay, earnedPay);
                }
                break;
        }
    }

}
