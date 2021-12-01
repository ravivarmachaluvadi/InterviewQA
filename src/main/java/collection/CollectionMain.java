package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class CollectionMain {
    public static void main(String[] args) {
        List list = Collections.synchronizedList(new ArrayList());

        list.add("Ravi");
        list.add("Chaluvadi");
        list.add("Varma");
        ListIterator iterator = list.listIterator();

        list.add("Kotla");

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("===================================");

        ListIterator listIterator = list.listIterator();

        while (listIterator.hasNext()){
            System.out.println(listIterator.next());
        }
    }

}
