package src.classwork.lesson8;

import java.util.ArrayList;
import java.util.List;

public class MyArrayList {

    public void myList() {

        List<String> list = new ArrayList<>();
        String[] array = "mama myla ramu".split(" ");

        for (String a : array) {
            list.add(a);
            System.out.println(a);
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }

}
