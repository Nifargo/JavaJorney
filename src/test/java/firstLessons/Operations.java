package firstLessons;

import java.util.Scanner;

public class Operations {

    public static int calculate(int firstNumber, int secondNumber, String operation) {
        return switch (operation) {
            case "+" -> firstNumber + secondNumber;
            case "-" -> firstNumber - secondNumber;
            case "*" -> firstNumber * secondNumber;
            case "/" -> firstNumber / secondNumber;
            default -> throw new IllegalArgumentException ("Invalid operation");
        };
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");

        int firstNumber = scanner.nextInt();
        System.out.println("Enter the second number: ");

        int secondNumber = scanner.nextInt();
        System.out.println("Enter the operation: ");

        System.out.println("The result is: " + calculate(firstNumber, secondNumber, scanner.next()));
    }


}
