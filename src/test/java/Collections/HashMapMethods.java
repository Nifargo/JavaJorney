package Collections;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapMethods {

    public static void main(String[] args) {

        HashMap<String, Integer> team = new HashMap<>();

        team.put("Andrii", 30);
        team.put("Anna", 29);
        team.put("Petro", 40);

        System.out.println(team);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть назву книги для пошуку: ");
        String userName = scanner.nextLine();

        Integer user = team.get(userName);

        if(user != null){
            System.out.println("His name is " + userName + " " + user);
        }
        scanner.close();

    }
}
