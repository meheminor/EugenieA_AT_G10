package src.classwork.lesson8;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayFill {

    public void arrayFill() {
        List<String> myList1 = new ArrayList<>();
        List<String> myList2 = new LinkedList<>();
        long t0 = System.currentTimeMillis();


        for (int i = 0; i < 10000000; i++) {
            myList1.add("string"+i);
        }
        System.out.println("First time "+ (System.currentTimeMillis() - t0));
        t0 = System.currentTimeMillis();

        for (int i = 0; i < 10000000; i++) {
            myList2.add("string"+i);
        }
        System.out.println("Second time "+ (System.currentTimeMillis() - t0));

        t0 = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            myList1.get(i);
        }
        System.out.println("Third time "+ (System.currentTimeMillis() - t0));

        t0 = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            myList2.get(i);
        }
        System.out.println("Last time "+ (System.currentTimeMillis() - t0));



    }
}
