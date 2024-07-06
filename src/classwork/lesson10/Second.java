package src.classwork.lesson10;

import java.util.Arrays;
import java.util.List;

public class Second {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("mama", "myla", "ramu", "clean", "aa", "mama");


        boolean mama = list.stream().anyMatch(word -> word.equals("mama"));
        boolean m = list.stream().allMatch(word -> word.contains("m"));
        List<String> updated = list.stream().map(word -> word.concat("m")).toList();
        List<String> updated2 = list.stream().flatMap(word -> Arrays.stream(word.split("a"))).filter(word -> !word.isEmpty()).toList();


        System.out.println(updated);
        System.out.println(updated2);
        System.out.println(mama);
        System.out.println(m);
    }
}
