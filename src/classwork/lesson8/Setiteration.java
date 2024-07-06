package src.classwork.lesson8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Setiteration {

    public void iterate() {

        Set<String> mySet = new HashSet<>(Arrays.asList("mama myla ramu".split(" ")));

        for (String s : mySet) {
            System.out.println(s);
        }

        Iterator<String> iterator = mySet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
