package fourthLesson;

public class Loops {

    public static void main (String[] args) {
//
//        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
//
//        for (int i = 0; i <= 20; i++) {
//            if (i % 2 == 0 && i != 0) {
//                System.out.println (i);
//            }
//        }
//
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[ i ] % 2 == 0) {
//                System.out.println (arr[ i ]);
//            }
//        }
//
//        int i = 1;
//        while (i <= 15) {
//            if (i % 2 != 0){
//                System.out.println (i);
//            }
//            i++;
//        }
//
//        Scanner scanner = new Scanner (System.in);
//        int firstNumber;
//        do {
//            System.out.println ("Enter your number please");
//            firstNumber = scanner.nextInt ();
//            if(firstNumber >=0){
//                System.out.println (firstNumber * firstNumber);
//            }
//        } while (firstNumber >= 0);


        int[] arr1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
        int max = arr1[0];
        for (int i = 0; i < arr1.length; i++) {

            if (arr1[i]> max) {
                max=arr1[i];
            }
        }
        System.out.println (max);
    }
}
