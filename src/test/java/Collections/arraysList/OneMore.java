package Collections.arraysList;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class OneMore {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>(List.of(1,3,5,2,4));
        System.out.println(reCreate(numbers));

        numbers.removeIf(n -> n%2 ==0);
        System.out.println(numbers);

        ArrayList<Integer>number1 = new ArrayList<>(List.of(1,2,3,4,5));
        ArrayList<Integer>number2 = new ArrayList<>(List.of(3,4,5,6,7));

        ArrayList<Integer>sum = new ArrayList<>(number1);
        sum.addAll(number2);
        ArrayList<Integer>distinct = sum.stream().distinct().collect(Collectors.toCollection(ArrayList::new));

        System.out.println(distinct);

        System.out.println(revesed(number1));

        ArrayList<Integer>number3 = new ArrayList<>(List.of(1,2,3,4,5));
        ArrayList<Integer>number4 = new ArrayList<>(List.of(3,4,5,6,7));
        System.out.println(twins(number3, number4));

        ArrayList<Integer>pol = new ArrayList<>(List.of(1,2,3,2,1));
        System.out.println(isPolindrom(pol));

        List<Integer>setNumbers = new ArrayList<>(List.of(1,2,3,4,5,5,6,4,3,2));
        System.out.println(moreAndMore(setNumbers));
        System.out.println(moreAnd(setNumbers));

        List<String>languages = new ArrayList<>(List.of("Java", "JS", "Java", "Java", "PHP", "Go"));
        System.out.println(howMany(languages, "Java"));

        ArrayList<String> language = new ArrayList<>(List.of("12345","1", "12", "123", "1234"));
        System.out.println(howLong(language));

        List<Integer> numbersFilter = List.of(5, 15, 8, 3, 25);
        System.out.println(getTrue(numbersFilter));

        List<Integer> list1 = List.of(1, 2, 3, 4, 5);

        System.out.println(sortedTrue(list1));

        System.out.println(deleteList(numbersFilter));

        List<String> list = List.of("apple", "banana", "orange", "grape");
        System.out.println(swapIndexes(list, 1, 2));

    }

    public static Set<Integer> reCreate(List<Integer> list){
        Set<Integer> setList = new HashSet<>(list);
        return setList;
    }

    public static ArrayList<Integer>revesed(ArrayList<Integer>list){
        ArrayList<Integer>reversed = new ArrayList<>(list);
        Collections.reverse(reversed);
        return reversed;
    }

    public static ArrayList<Integer>twins(ArrayList<Integer>list1, ArrayList<Integer>list2){
        ArrayList<Integer>twin = new ArrayList<>();
        Iterator<Integer>iterator = list1.iterator();
        while(iterator.hasNext()){
            Integer num = iterator.next();
            if(list2.contains(num)){
                twin.add(num);
            }
        }
        return twin;
    }

    public static boolean isPolindrom(ArrayList<Integer>list){
        ArrayList<Integer>poli = new ArrayList<>(list);
        Collections.reverse(poli);
        return poli.equals(list);
    }

    public static Set<Integer>moreAndMore(List<Integer>list){
        Set<Integer>more = new TreeSet<>(list);
        more.stream().distinct().collect(Collectors.toSet());
        return more;
    }

    public static List<Integer>moreAnd(List<Integer>list){
        return list.stream().sorted().distinct().toList();
    }

    public static Integer howMany(List<String>list, String target){
        return Collections.frequency(list, target);
    }

    public static List<String>howLong(List<String>list){
        return list.stream().sorted().toList();

    }

    public static boolean getTrue(List<Integer>list){
        return list.stream().filter(e -> e >10).findFirst().isPresent();
    }

    public static List<String> addNewElement(List<String> list, String el) {
        List<String> newList = new ArrayList<>(list);
        int indexMid = newList.size() / 2;
        if(newList.size() % 2 == 0) {
            newList.add(indexMid, el);
        } else newList.add(indexMid, el);
        return newList;
    }

    public static boolean sortedTrue(List<Integer> list){
        List<Integer>newList = new ArrayList<>(list);
        Collections.sort(newList);

        return newList.equals(list);
    }

    public static List<Integer> deleteList(List<Integer> list){
        List<Integer> newList = new ArrayList<>(list);
        newList = list.stream().filter(e -> e % 2 == 0).collect(Collectors.toList());
        return newList;
    }

    public static List<String> swapIndexes(List<String>list, int i1, int i2){
        List<String> newList = new ArrayList<>(list);
        Collections.swap(newList, i1, i2);
        return newList;
    }
}
