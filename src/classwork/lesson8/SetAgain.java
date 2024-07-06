package src.classwork.lesson8;

import com.sun.source.tree.Tree;

import java.util.*;

public class SetAgain {

    public void setiterate() {

        Set<String> mySet = new HashSet<>();
        Set<String> mySet2 = new TreeSet<>();
        long t0 = System.currentTimeMillis();


        for (int i = 0; i < 10000000; i++) {
            mySet.add("string" + i);

        }

        System.out.println("First time " + (System.currentTimeMillis() - t0));
        t0 = System.currentTimeMillis();

        for (int i = 0; i < 10000000; i++) {
            mySet2.add("string" + i);

        }
        System.out.println("Second time " + (System.currentTimeMillis() - t0));

        t0 = System.currentTimeMillis();
        for (String s : mySet) {
        }

        System.out.println("Third time " + (System.currentTimeMillis() - t0));

        t0 = System.currentTimeMillis();
        for (String s : mySet2) {
        }
        ;

        System.out.println("Last time " + (System.currentTimeMillis() - t0));
    }
}
