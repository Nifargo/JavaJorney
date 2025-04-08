package Collections.sets;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSetMethods {

    public static void main(String[] args) {

        ArrayList<String>codeNames = new ArrayList<>();
        codeNames.add("Andrii");
        codeNames.add("Anna");

        System.out.println(codeNames);

        HashSet<String> names = new HashSet<>();

        names.add("Andrii");
        names.add("Anna");
        names.add("Petrol");

        System.out.println(names);

        names.add("Andrii");
        System.out.println(names);

        names.remove("Andrii");

        System.out.println(names);
    }
}
