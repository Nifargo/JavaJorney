package Collections.sets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class setTasks {
    public static void main(String[] args) {

//        Опис: Дано список чисел. Знайди кількість унікальних чисел.
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 1, 2, 5, 6, 7, 8, 5);
        Set<Integer> setNumbers = new HashSet<>(numbers);
        System.out.println(setNumbers.size());

        //        Опис: Напиши програму, яка отримує рядок і виводить кількість унікальних слів у ньому.
        String text = "Java is cool and Java is powerful";
        ArrayList<String> arrayText = new ArrayList<>(Arrays.asList(text.split(" ")));

        Set<String>setText = new HashSet<>(arrayText);
        System.out.println(setText.size());

//        Опис: Дано два списки чисел. Знайди спільні елементи (перетин множин).
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 4, 5, 6, 7));

        Set<Integer> intersectSet = new HashSet<>(set1);
        intersectSet.retainAll(set2);

        System.out.println("common numbers: " +intersectSet);

    }
}
