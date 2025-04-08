package Strings;

public class StringsLessons {

    public static void main(String[] args) {

        String str = "01011110001100111";

        for (int i = 0; i < str.length(); i++){
            int digit = str.charAt(i) < 5? 0 : 1;
            System.out.println(digit);
            }

    }
}
