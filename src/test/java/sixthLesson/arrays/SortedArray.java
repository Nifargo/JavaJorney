package sixthLesson.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SortedArray {
    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);
        int[] array = new int[ 3 ];

        System.out.println ("Add number 1");
        array[ 0 ] = scanner.nextInt ();

        System.out.println ("Add number 2");
        array[ 1 ] = scanner.nextInt ();

        System.out.println ("Add number 2");
        array[ 2 ] = scanner.nextInt ();

        System.out.println (Arrays.toString (array));

        boolean flag = true;
        int temp;
        while (flag) {
            flag = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[ i ] < array[ i + 1 ]) {
                    temp = array[ i ];
                    array[ i ] = array[ i + 1 ];
                    array[ i + 1 ] = temp;
                    flag = true;
                }
            }
        }
        System.out.println (Arrays.toString (array));
    }
}
