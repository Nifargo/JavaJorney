package Collections.arraysList;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MoreExp {

    public static void main(String[] args) {

        ArrayList<String> objectList = new ArrayList<>(List.of("apple", "banana", "apple", "orange", "banana", "apple"));
        Map<String, Integer> mapObjectList = new HashMap<>();

        for (String i : objectList) {
            mapObjectList.put(i, mapObjectList.getOrDefault(i, 0) + 1);
        }
        System.out.println(mapObjectList);

        ArrayList<Integer> numbers = new ArrayList<>(List.of(10, 5, 8, 20, 15, 20));
        TreeSet<Integer> setNumber = new TreeSet<>(numbers);
        System.out.println(setNumber);

        System.out.println(setNumber.lower(setNumber.last()));

        ArrayList<String> listOne = new ArrayList<>(List.of("apple", "banana", "apple", "orange", "banana", "apple"));
        ArrayList<String> listTwo = new ArrayList<>(List.of("apple", "banana", "apple", "orange", "banana", "apple", "Andrii123"));

        List<String> sumList = Stream.concat(listOne.stream(), listTwo.stream())
                .distinct()
                .collect(Collectors.toList());

        System.out.println(sumList);

//        listOne.removeIf(n -> n.contains("e"));
//        System.out.println(listOne);

        Collections.sort(listTwo, Comparator.comparingInt(String::length));
        ArrayList<String>sortedWords = listTwo.stream().sorted((s1, s2) -> Integer.compare(s1.length(), s2.length())).collect(Collectors.toCollection(ArrayList :: new));

        System.out.println(listTwo);
        System.out.println(sortedWords);

        Collections.rotate(numbers, 1);
        System.out.println(numbers);

    }
}
