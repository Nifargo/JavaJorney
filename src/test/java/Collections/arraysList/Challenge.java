package Collections.arraysList;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Challenge {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean flag = true;
        ArrayList<String> groceries = new ArrayList<>();
        while (flag) {
            printAction();
            int action;
            try {
                action = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
                continue;
            }

            switch (action) {
                case 1 -> addItems(groceries);
                case 2 -> removeItem(groceries);
                default -> flag = false;
            }
            groceries.sort(Comparator.naturalOrder());
            System.out.println(groceries);
        }
    }

    private static void addItems(ArrayList<String> groceries) {
        System.out.println("add items");
        String[] items = scanner.nextLine().split(",");
        for (String i : items) {
            String trimmed = i.trim();
            if(! groceries.contains(trimmed)) {
                groceries.add(trimmed);
            }
        }
    }

    private static void removeItem(ArrayList<String> groceries) {
        System.out.println("remove item");
        String[] items = scanner.nextLine().split(",");
        for (String i : items) {
            String trimmed = i.trim();
            groceries.remove(trimmed); // Видаляємо елемент зі списку
        }
    }

    private static void printAction() {
        String textBlock = """
                Available action:
                0 - to shut down
                1 - to add item(s) to list
                2 - to remove any items
                Enter a number for which action you want to do
                """;
        System.out.println(textBlock);
    }
}