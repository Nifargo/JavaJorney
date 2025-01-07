package sixthLesson.arrays;

import java.util.Arrays;
import java.util.Random;

public class ArrayChallenge {
    int[] arr = new int[] { 50, 25, 80, 15 };

    public static void main (String[] args) {

        int[] arr = new int[] { 50, 25, 80, 15 };
        System.out.println (Arrays.toString (arr));
        Arrays.sort (arr);
        System.out.println (Arrays.toString (arr));


        int[] sorted = sortedArr (5);
        System.out.println (Arrays.toString (sorted));
        int[] sort = Arrays.copyOf (sorted, 5);
        Arrays.sort (sort);
        System.out.println (Arrays.toString (sort));

        System.out.println ("Sorted array " + Arrays.toString (sortIntegers (arr)));

    }

    private static int[] sortedArr (int len) {
        Random random = new Random ();
        int[] randomArray = new int[ len ];
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[ i ] = random.nextInt (1000);
        }
        return randomArray;
    }

    public static int[] sortIntegers (int[] array) {
        int[] sortedArray = Arrays.copyOf (array, array.length);
        boolean flag = true;
        int temp;
        while (flag) {
            flag = false;
            for (int i = 0; i < sortedArray.length - 1; i++) {
                if (sortedArray[ i ] < sortedArray[ i + 1 ]) {
                    temp = sortedArray[ i ];
                    sortedArray[ i ] = sortedArray[ i + 1 ];
                    sortedArray[ i + 1 ] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }
}
