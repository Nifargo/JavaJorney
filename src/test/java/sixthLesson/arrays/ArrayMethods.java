package sixthLesson.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayMethods {
    public static void main (String[] args) {
        String[] array = new String[] { "Hello",  "World", "Andrii"};
        List<String> filteredList = Arrays.stream(array)
                .filter(w -> w.contains ("A"))
                .collect(Collectors.toList());
        System.out.println(filteredList);

        ArrayList<String> arrayList = new ArrayList<> ();
        arrayList.add ("Apple");
        arrayList.add ("watermelon");
        arrayList.add ("cucumber");

        for (String fruits : arrayList){
            System.out.println (fruits);
        }
    }
}
