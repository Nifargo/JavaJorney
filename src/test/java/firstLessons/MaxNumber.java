package firstLessons;

import java.util.Scanner;

public class MaxNumber {

    public static int maxNumberMethod(int first, int second) {
        if(first >second){
            return first;
        } else if(second > first){
            return second;
        } throw new IllegalArgumentException("Both numbers are equal");
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number");
        int firstNumber = scanner.nextInt();

        System.out.println("Enter second number");
        int secondNumber = scanner.nextInt();

        try{
            System.out.println("Max number is " + maxNumberMethod(firstNumber, secondNumber));
        } catch (IllegalArgumentException e){
            System.out.println("Error: " + e.getMessage());
        }


    }
}
