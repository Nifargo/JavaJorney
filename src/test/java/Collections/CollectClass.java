package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectClass {

    public static void main(String[] args) {


        List<String> names = new ArrayList<>(Arrays.asList("Andrii", "Anna", "Petro"));

        Collections.fill(names, "Andrii");
        System.out.println("names " + names);

        List<String> newNames = Collections.nCopies(2, "Andrii");
        System.out.println("newNames " + newNames);

        List<String> names1 = new ArrayList<>(3);
        Collections.addAll(names1, "Andrii", "Anna", "Petro");
        System.out.println("names1 " + names1);

        Collections.copy(names1, names);
        System.out.println("names1 " + names1);

        List<String> live = List.copyOf(newNames);
        System.out.println("live " + live);
    }
}
