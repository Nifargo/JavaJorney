package Collections.arraysList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class Lessons {
    public static void main(String[] args) {

//        From Array from ArrayList
        ArrayList<String> arrayList = new ArrayList<>(List.of("hello", "world"));
        String[] array = arrayList.toArray(new String[ 0 ]);
        System.out.println(Arrays.toString(array));

//        ArrayList from Array

        String[] array1 = new String[] { "hello", "world" };
        ArrayList<String> arrayList1 = new ArrayList<>(Arrays.asList(array1));

        ArrayList<String> objectList = new ArrayList<>();
        objectList.add("Hello");
        objectList.add("123");

        System.out.println(objectList);

        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>(20);
        List<String> list3 = new ArrayList<>();
        ArrayList<String> list4 = new ArrayList<>(List.of("Java", "Python", "C++"));
        ArrayList<String> copyList = new ArrayList<>(list1);
//        List<String> immutableList = Collections.unmodifiableList(new ArrayList<>(List.of("Java", "Python")));

        ArrayList<Integer> numbers = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9));
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            if(iterator.next() == 3) {
                iterator.remove();
            }
        }
        System.out.println(numbers);

        numbers.remove(1);
        System.out.println(numbers);

        System.out.println(Collections.max(numbers));

        ArrayList<String> languages = new ArrayList<>(List.of("Java", "Python", "C++", "JS", "TS", "Java", "Andras"));
        Collections.sort(languages);
        System.out.println(languages);

        String[] newlanguages = languages.toArray(new String[ 0 ]);
        System.out.println(Arrays.toString(newlanguages));

        numbers.removeIf(n -> n % 2 == 0);
        System.out.println(numbers);

        Set<Integer> newNumbers = new LinkedHashSet<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9));
        newNumbers.removeIf(n -> n % 2 == 0);
        System.out.println(newNumbers);

        Integer javaNumber = Collections.frequency(languages, "Java");
        System.out.println(javaNumber);
        Map<String, Integer> wordfreaquency = new HashMap<>();
        String word = null;
        int count = 0;
        for (String i : languages) {
            wordfreaquency.put(i, wordfreaquency.getOrDefault(i, 0) + 1);
            if(wordfreaquency.get(i) > count) {
                count = wordfreaquency.get(i);
                word = i;
            }
        }
        System.out.println(wordfreaquency);
        System.out.println(word);

        Optional lang = languages.stream().distinct().max(Comparator.comparing(el -> Collections.frequency(languages, el)));
        ArrayList<String> lang1 = new ArrayList<>(languages.stream().distinct().toList());
        ArrayList<String> lang2 = languages.stream().distinct().collect(Collectors.toCollection(ArrayList :: new));
        System.out.println(lang2);

        ArrayList<Integer> pol = new ArrayList<>(List.of(1, 2, 3, 2));
        System.out.println(polindromMethod(pol));

        ArrayList<String> listOne = new ArrayList<>(List.of("Java", "Python", "C++"));
        ArrayList<String> listTwo = new ArrayList<>(List.of("Java", "Python", "C++"));

        System.out.println(lists(listOne, listTwo));

        ArrayList<Integer> numbersTwo = new ArrayList<>(List.of(10, 5, 8, 20, 15));
        Iterator<Integer> iterator2 = numbersTwo.iterator();

        numbersTwo.removeIf(n -> n.equals(Collections.max(numbersTwo)));
        System.out.println(Collections.max(numbersTwo));

        numbersTwo.sort(Comparator.naturalOrder());
        System.out.println(numbersTwo);
        System.out.println(Collections.max(numbersTwo));

        Collections.rotate(numbersTwo, 2);
        System.out.println(numbersTwo);

        ArrayList<Integer> numberListOne = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        ArrayList<Integer> numberListTwo = new ArrayList<>(List.of(3, 4, 5, 6, 7, 8, 9));

        ArrayList<Integer> numberListTree = new ArrayList<>(numberListTwo);
        numberListTree.addAll(numberListOne);
        ArrayList<Integer> newLists = numberListTree.stream().distinct().sorted().collect(Collectors.toCollection(ArrayList :: new));
        System.out.println(newLists);

        String str = "Hello";
        String newStr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            newStr += str.charAt(i);
        }
        System.out.println(newStr);

        String str1 = new StringBuilder(str).reverse().toString();
        System.out.println(str1);

        int n = 123;
        char[] digitsArray = Integer.toString(n).toCharArray();
        System.out.println();
        String output = "";
        for (char digit : digitsArray) {
            n = Character.getNumericValue(digit);
            output += n * n;
        }

        System.out.println(output);


    }

    public static boolean polindromMethod(ArrayList<Integer> list) {
        ArrayList<Integer> reversed = new ArrayList<>(list);
        Collections.reverse(reversed);
        return reversed.equals(list);
    }

    public static ArrayList<String> lists(ArrayList<String> list1, ArrayList<String> list2) {
        for (String str : list2) {
            list1.add(str);
        }
        return list1.stream().distinct().collect(Collectors.toCollection(ArrayList :: new));
    }
}
