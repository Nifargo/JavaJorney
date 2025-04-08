package Collections.maps;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class mapMethods {

    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("Apple", 10);
        map.put("Banana", 20);
        map.put("Orange", 15);

        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        System.out.println(entries);

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        String text = "Java is cool and Java is powerful";

        Map<String, Integer> words = new HashMap<>();
        for (String word : text.split("\\s+")) {
            words.put(word, words.getOrDefault(word, 0) + 1);
        }
        System.out.println(words);


        Map<String, Integer> wordCount = new HashMap<>();

        for (String word : text.split("\\s+")) {
            if(wordCount.containsKey(word)) {
                wordCount.put(word, wordCount.get(word) + 1);
            } else {
                wordCount.put(word, 1);
            }
        }
        System.out.println(wordCount);

        String newWord = "hello world";

        Map<Character, Integer> letters = new TreeMap<>();

        for (char letter : newWord.toCharArray()) {
            if(letters.containsKey(letter)) {
                letters.put(letter, letters.get(letter) + 1);
            } else {
                letters.put(letter, 1);
            }
        }
        System.out.println(letters);

        String unix = "Java is great and Java is powerful";
        Map<String, Integer> unixWord = new HashMap<>();

        for (String word : unix.split("\\s+")) {
            if(unixWord.containsKey(word)) {
                unixWord.put(word, unixWord.get(word) + 1);
            } else {
                unixWord.put(word, 1);
            }
        }
        Collection<String> keys = unixWord.entrySet().stream().filter(entry -> entry.getValue() == 1).map(Map.Entry :: getKey).toList();
        System.out.println(keys);

        List<Integer> numbers = Arrays.asList(5, 3, 5, 4, 2, 3, 5, 4, 2, 5);

        Map<Integer, Integer> mapNumbers = new HashMap<>();
        for (int number : numbers) {
            mapNumbers.put(number, mapNumbers.getOrDefault(number, 0) + 1);
        }
        System.out.println(mapNumbers);

        String sentens = "apple banana apple orange banana apple";

        String[] wordsentens = sentens.toLowerCase().split("\\s+");

        Map<String, Integer> wordCountSentens = new HashMap<>();

        for (String word : wordsentens) {
            wordCountSentens.put(word, wordCountSentens.getOrDefault(word, 0) + 1);
        }
        System.out.println(wordCountSentens);

        String mostFrequentWord = null;
        int maxCount = 0;

        for (Map.Entry<String, Integer> entry : wordCountSentens.entrySet()) {
            if (entry.getValue() > maxCount) {
                mostFrequentWord = entry.getKey();
                maxCount = entry.getValue();
            }
        }
        System.out.println("most frequent is:" + mostFrequentWord + "," + "with value:" + maxCount);

        Map<Integer, String> maps = new HashMap<>();

        maps.put(1, "Java");
        maps.put(2, "Python");
        maps.put(3, "C++");

        Set<Map.Entry<Integer, String>> entries2 = maps.entrySet();
        System.out.println(entries2);

        for (Map.Entry<Integer, String> m : maps.entrySet()){
            System.out.println(m);
        }

        ArrayList<String> fruits = new ArrayList<>(List.of("apple", "banana", "apple", "orange", "banana", "apple"));

        Map<String, Integer>NumberFruits = new TreeMap<>();

        for (String fruit : fruits){
            NumberFruits.put(fruit, NumberFruits.getOrDefault(fruit, 0) + 1);
        }
        System.out.println(NumberFruits);


        String language = "hello";
        Map<Character, Integer> NumberString = new HashMap<>();
        for (char i : language.toCharArray()){
            NumberString.put(i, NumberString.getOrDefault(i, 0) + 1);
        }
        System.out.println(NumberString);

        Map<Integer, Integer>map1 = new HashMap<>(Map.of(1, 10, 2, 20, 3, 30));
        Map<Integer, Integer>map2 = Map.of(2, 5, 3, 15, 4, 40);

        Map<Integer, Integer> result = new HashMap<>(map2);
//        Map<Integer, Integer> result2 = new HashMap<>(map1);


        for (Map.Entry<Integer, Integer> entry : map1.entrySet()){
          result.merge(entry.getKey(), entry.getValue(), Integer::sum);
            }
        System.out.println(result);

        Map<Integer, Integer> result2 = new HashMap<>();

        for (Integer key : map1.keySet()) {
            if (map2.containsKey(key)) {
                result2.put(key + key, map1.get(key)); // Якщо ключ є в обох, додаємо його
            } else {
                result2.put(key, map1.get(key)); // Якщо ключ є тільки в map1, залишаємо його
            }
        }

        for (Integer key : map2.keySet()) {
            if (!map1.containsKey(key)) {
                result2.put(key, map2.get(key)); // Додаємо ключі, які є тільки в map2
            }
        }

        System.out.println(result2);

        Map<Integer, String> languages = new HashMap<>();
        languages.put(1, "Java");
        languages.put(2, "Python");

        languages.computeIfAbsent(3, k ->  "C");
        String hello = "Hello World!";
        String h2 = replaceHello(hello);
        System.out.println(h2);

    }
    public static String replaceHello(String h) {
        return h.replace("!", "");
    }
}
