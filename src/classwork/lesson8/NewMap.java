package src.classwork.lesson8;

import java.util.HashMap;
import java.util.Map;

public class NewMap {
    public void newMap(){
        Map<Integer, String> words = new HashMap<>();
        String[] array = "mama myla ramu".split(" ");

        for (int i = 0; i < array.length; i++) {
            words.put(i, array[i]);
        }

        for (String word : words.values()) {

            System.out.println(word);
        }

        for (int word : words.keySet()) {
            System.out.println(word);
        }



    }
}
