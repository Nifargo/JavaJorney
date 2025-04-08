package Collections.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Random;

public class ArraysAndCollections {
    public static void main (String[] args) {

        int capacity = 1;
        ArrayList<String> elements = new ArrayList<>(capacity);
        elements.add("Hello");
        elements.add("World");
        System.out.println("Look here" + Arrays.toString(elements.toArray()));

        int[] arr = new int[ 5 ];
        arr[ 0 ] = 10;
        arr[ 1 ] = 20;
        arr[ 2 ] = 30;
        arr[ 3 ] = 40;
        arr[ 4 ] = 50;

        System.out.println (Arrays.stream (arr).toArray());

        int[] arr1 = { 10, 20, 30, 40, 50 };

        System.out.println ("old array " + Arrays.toString (arr1));

        for (int i = 0; i < arr.length; i++) {
            System.out.println (arr[ i ]);
        }
        for (int element : arr1) {
            System.out.println ("new loop " + element);
        }

        Object object = arr;
        if(object instanceof  int[]){
            System.out.println ("array");
        }

        int[]firstArray = getrandomArray (5);

        System.out.println (Arrays.toString (firstArray));

        Arrays.sort (firstArray);
        System.out.println (Arrays.toString (firstArray));

        String [] strings = new String[]{"Hello", "Mark", "Andrii"};
        System.out.println ("Binary array - " + Arrays.binarySearch (strings, "Andrii"));
    }

    private static int[] getrandomArray(int len){
        Random random = new Random ();
        int[] newInt = new int[len];
        for (int i = 0; i < len; i++){
            newInt[i] = random.nextInt (100);
        }
        return newInt;
    }
}
