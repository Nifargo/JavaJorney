package Collections.arrays;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListMethods {

    public static void main(String[] args) {

        var placesToVisit = new LinkedList<String>();

//        Adding element
        placesToVisit.add("Kyiv");
        placesToVisit.addFirst("Lviv");
        placesToVisit.offer("Odessa");
        placesToVisit.push("Kharkiv");

//        Iterator
        Iterator<String> iterator = placesToVisit.iterator();
        while (iterator.hasNext()){
            String name = iterator.next();
            System.out.println("ALL here " + name);
        }

//        for each
        for(String place: placesToVisit){
            System.out.println("Some new here " + place);
        }

//        stream
        placesToVisit.stream().forEach(System.out ::println);

//        removing element
        String s1 = placesToVisit.removeFirst();
        System.out.println(s1 + " removed");

        String s2 = placesToVisit.remove();
        System.out.println(s2 + " removed");

        String s3 = placesToVisit.poll();
        System.out.println(s3 + " removed");

        String s4 = placesToVisit.pop();
        System.out.println(s4 + " removed");

        System.out.println(Arrays.toString(placesToVisit.toArray()));

        var placesToVisitAll = new LinkedList<String>();

        placesToVisitAll.add("Kyiv");
        placesToVisitAll.addFirst("Lviv");
        placesToVisitAll.offer("Odessa");
        placesToVisitAll.push("Kharkiv");

        System.out.println(placesToVisitAll.getFirst());
        ListIterator list = placesToVisitAll.listIterator();
        while (list.hasNext()) {
            System.out.println("List iterator " + list.next());
        }
    }

}
