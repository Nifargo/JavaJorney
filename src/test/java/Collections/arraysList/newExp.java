package Collections.arraysList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class newExp {
    public static void main(String[] args) {

        ArrayList<String> languages = new ArrayList<>(List.of("Java", "Python", "JS", "C++", "Kotlin"));
        System.out.println(languages);
        Iterator<String> iterator = languages.iterator();

        while (iterator.hasNext()){
            if(iterator.next()=="Java"){
                iterator.remove();
            }
        }
        System.out.println(languages);

        languages.remove(0);
        System.out.println(languages);

        languages.removeIf(n -> n.equals("JS"));
        System.out.println(languages);

        System.out.println(containsValue(languages, "C++"));

        ArrayList<Integer>numbers = new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9));
        System.out.println(Collections.max(numbers));

        String[] language = languages.toArray(new String[0]);
        System.out.println(Arrays.toString(language));

        Collections.sort(languages);
        System.out.println(languages);

        numbers.removeIf(n -> n%2 ==0);
        System.out.println(numbers);


        ArrayList<String> list = new ArrayList<>(List.of("Java", "Python", "Java", "C++", "Java"));
        Map<String, Integer> languageList = new HashMap<>();

        for (String i : list){
            languageList.put(i, languageList.getOrDefault(i, 0) + 1);
        }
        System.out.println(languageList);

        int listjava = Collections.frequency(list, "Java");
        System.out.println(listjava);

        ArrayList<Integer> numbers121 = new ArrayList<>(List.of(1, 2, 3, 2, 1));
        System.out.println(isPalindromeList(numbers121));

        ArrayList<Integer> numbers1 = new ArrayList<>(List.of(1, 2, 2, 3, 4, 4, 5));
        List<Integer>sortedNumbers = numbers1.stream().distinct().toList();
        System.out.println(sortedNumbers);

    }

    public static boolean containsValue(ArrayList<String> list, String value){
        return list.contains(value);
    }

    public static boolean isPalindromeList(List<Integer> list){
        ArrayList<Integer>reversed = new ArrayList<>(list);
        Collections.reverse(reversed);

        return reversed.equals(list);
    }
}
