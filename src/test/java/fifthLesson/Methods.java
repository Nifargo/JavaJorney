package fifthLesson;

public class Methods {
    public static void main (String[] args) {
        System.out.println (sum (1, 2));
        System.out.println (isEven (3));
        int result = sumRecursive(5);
        System.out.println("Сума чисел від 1 до 5: " + result);
    }

    public static int sum (int x, int y) {
        return x + y;
    }

    public static int isEven (int x) {
        return x % 2 == 0 ? x : x+1;
    }

    public static int sumRecursive(int n){
        if(n == 0){
            return 0;
        } else{
            return n + sumRecursive ( n-1);
        }
    }
}
