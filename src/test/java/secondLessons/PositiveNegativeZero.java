package secondLessons;

import java.util.Scanner;

public class PositiveNegativeZero {

    public static String msgMethod (int number) {
        if (number < 0 && number != 0) {
            return "Number is negative";
        } else if (number > 0 && number != 0) {
            return "Number is positive";
        } else throw new IllegalArgumentException ("Number is 0");
    }

    public static void main (String[] args) {

        Scanner scanner = new Scanner (System.in);

        System.out.println ("Enter first number:");
        int firstNumber = scanner.nextInt ();

        try {
            System.out.println ("Message is :" + msgMethod (firstNumber));
        } catch (IllegalArgumentException e) {
            System.out.println (e.getMessage ());
        }

    }
}
