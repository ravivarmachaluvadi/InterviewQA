package perf;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class PerfTest {
//700000000
    public static void main(String[] args) {
        long l1,l2;
        List<Integer> list= new ArrayList(10000000);

        System.out.println(Integer.MAX_VALUE);

        System.out.println(Runtime.getRuntime().freeMemory());

        System.out.println(Runtime.getRuntime().availableProcessors());

        l1 = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            list.add(i);
        }
        l2 = System.currentTimeMillis();
        System.out.println(" for i loop add "+(l2-l1));

        l1 = System.currentTimeMillis();
        for (int i = 0; i < list.size(); i++) {
           int i2= list.get(i);
        }
        l2 = System.currentTimeMillis();
        System.out.println(" for i loop read "+(l2-l1));

        l1 = System.currentTimeMillis();
        for (int i : list) {
            int i2= list.get(i);
        }
        l2 = System.currentTimeMillis();

        System.out.println(" enhanced for loop read "+(l2-l1));

        l1 = System.currentTimeMillis();
        list.stream().forEach(integer -> {int i2= list.get(integer);});
        l2 = System.currentTimeMillis();
        System.out.println(" stream foreach read "+(l2-l1));

        l1 = System.currentTimeMillis();
        list.forEach(integer -> {int i2= list.get(integer);});
        l2 = System.currentTimeMillis();
        System.out.println(" foreach read "+(l2-l1));

        l1 = System.currentTimeMillis();
        list.parallelStream().forEach(integer -> {int i2= list.get(integer);});
        l2 = System.currentTimeMillis();
        System.out.println(" parallelStream foreach read "+(l2-l1));

    }


    /*
 for i loop add 2173
 for i loop read 18
 enhanced for loop read 31
 stream foreach read 66
 foreach read 26
 parallelStream foreach read 64
     */

}
