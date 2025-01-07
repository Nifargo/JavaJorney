package sixthLesson.arraysList;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lessons {
    public static void main (String[] args) {

//        From Array from ArrayList
        ArrayList<String> arrayList = new ArrayList<> (List.of("hello", "world"));
        String[] array = arrayList.toArray (new String[0]);
        System.out.println(Arrays.toString (array));

//        ArrayList from Array

        String[] array1 = new String[] {"hello", "world"};
        ArrayList<String> arrayList1 = new ArrayList<> (Arrays.asList (array1));

        ArrayList<String> objectList = new ArrayList<> ();
        objectList.add ("Hello");
        objectList.add ("123");

        System.out.println (objectList);

    }


}
