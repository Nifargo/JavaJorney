package firstLessons;

import java.util.Scanner;

public class EvenOdd {
    public static String evenOdd(int firstNumber){
        if(firstNumber%2 == 0){
            return "The number is even";
        } else {
            return "The number is odd";

        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int firstNumber = scanner.nextInt();

        System.out.println(evenOdd(firstNumber));
    }
}
