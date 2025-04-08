package Collections.maps;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public class MoreMaps {

    public static void main(String[] args) {
//        Створи метод, який приймає рядок тексту і повертає Map<String, Integer>, де ключ — слово, а значення — скільки разів воно зустрічається у тексті.
        String text = "Java is cool and Java is powerful";
        System.out.println("How often : " + wordNumber(text));
        ArrayList<Objects>list = new ArrayList<>();

//        Напиши метод, який приймає Map<Integer, String> і повертає Map<String, Integer>, де ключами стануть значення вхідної мапи, а значеннями — ключі (припустимо, що значення унікальні).
        Map<Integer, String> map = new HashMap<>();
        map.put(10, "Apple");
        map.put(20, "Banana");
        map.put(15, "Orange");
        System.out.println("Reverted map is: " + revertedMap(map));

//        Створи метод, який приймає дві Map<String, Integer> і повертає одну Map<String, Integer>, де значення однакових ключів додаються.
        Map<String, Integer> map1 = Map.of("A", 10, "B", 20, "C", 30);
        Map<String, Integer> map2 = Map.of("B", 5, "C", 15, "D", 40);
        System.out.println("Sum of the maps : " + addMap(map1, map2));

//        Напиши метод, який приймає рядок тексту та знаходить слово, яке зустрічається найчастіше.
        System.out.println("get the most frequency: " + getBest(text));

//        Напиши метод, який отримує Map<String, Integer> та повертає нову мапу, що містить тільки ті пари, де значення більше 10.
        System.out.println("Bigger than 10 :" + biggerMap(map2));
        System.out.println("Bigger than 10 :" + bigMap(map2));

//        Створи метод, який приймає дві Map<String, Integer> та повертає Map<String, Integer>, що містить тільки ті пари, які є в обох мапах з однаковими значеннями.
        Map<String, Integer> map3 = Map.of("A", 10, "B", 20, "C", 30);
        Map<String, Integer> map4 = Map.of("B", 20, "C", 30, "D", 40);
        System.out.println("All the same :" + sameMap(map3, map4));

//        Напиши метод, який приймає Map<String, Integer> та повертає LinkedHashMap<String, Integer>, де елементи відсортовані за значенням у спадаючому порядку.
            Map<String, Integer> data = Map.of(
                    "apple", 15,
                    "banana", 5,
                    "orange", 25
            );

        System.out.println("LinkedMap :" + linkedMap(data));

//        Створи метод, який приймає List<String> та повертає Map<String, Integer>, де ключ — це слово, а значення — його довжина.
        List<String>list123 = new ArrayList<>(List.of("Java", "Js", "GoLand", "C++"));
        System.out.println("How long all word in the map :" + strMap(list123));

    }

    public static Map<String, Integer> wordNumber(String words){
        Map<String, Integer>newMap = new HashMap<>();
        for (String str : words.split("\\s+")){
            newMap.put(str, newMap.getOrDefault(str, 0) + 1);
        }
        return newMap;
    }

    public static Map<String, Integer> revertedMap(Map<Integer, String> map){
        Map<String, Integer>newMap = new HashMap<>();
        for (Map.Entry<Integer, String> nMap : map.entrySet()){
            newMap.put(nMap.getValue(), nMap.getKey());
        }
        return newMap;
    }

    public static Map<String, Integer>addMap(Map<String, Integer>map1, Map<String, Integer>map2){
        Map<String, Integer> newMap = new HashMap<>(map1);
        for (Map.Entry<String, Integer> nMap : map2.entrySet()){
            newMap.merge(nMap.getKey(), nMap.getValue(), Integer::sum);
        }
        return newMap;
    }

    public static Map<String, Integer>getBest(String sentens){
        Map<String, Integer>newMap = new HashMap<>();
        for (String word : sentens.split("\\s+")) {
            newMap.put(word, newMap.getOrDefault(word, 0) + 1);
        }
        return newMap.entrySet().stream().max(Comparator.comparingInt(Map.Entry::getValue)).map(entry ->Map.of(entry.getKey(), entry.getValue())).orElseGet(Collections::emptyMap);
    }

    public static Map<String, Integer> biggerMap(Map<String, Integer> map){
        Map<String, Integer> biggerMap = new HashMap<>();
        for (Map.Entry<String, Integer> nMap : map.entrySet()){
            if(nMap.getValue() > 10){
                biggerMap.put(nMap.getKey(), nMap.getValue());
            }
        }
        return biggerMap;
    }

    public static Map<String, Integer> bigMap(Map<String, Integer> map){
        return map.entrySet().stream().filter(entry -> entry.getValue() > 10).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }

    public static Map<String, Integer> sameMap(Map<String, Integer> map1, Map<String, Integer>map2){
        Map<String, Integer>newMap = new HashMap<>();

        for (Map.Entry<String, Integer> nMap : map1.entrySet()){
            String key = nMap.getKey();
            Integer value = nMap.getValue();

            if(map2.containsKey(key) && map2.get(key).equals(value)){
                newMap.put(key, value);
            }
        }
        return newMap;
    }

    public static LinkedHashMap<String, Integer> linkedMap(Map<String, Integer> map){
        Map<String, Integer> newMpa = new LinkedHashMap<String, Integer>();
        return map.entrySet().stream().sorted(Map.Entry.<String, Integer>comparingByValue().reversed()).collect(Collectors.toMap(Map.Entry::getKey,
                Map.Entry::getValue,
                (e1, e2) -> e1,LinkedHashMap::new));
    }

    public static Map<String, Integer> strMap(List<String> list){
        Map<String, Integer>newMap = new HashMap<>();
        for (String str : list){
            newMap.put(str, str.length());
        }
        return newMap;
    }
}
