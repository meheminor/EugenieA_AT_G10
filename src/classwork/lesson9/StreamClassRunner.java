package src.classwork.lesson9;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamClassRunner {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("mama", "myla", "ramu", "clean", "mama");


        int l = (int) list.stream().filter(x -> x.equals("mama")).count();

//        System.out.println(l);

        // list.stream().filter("mama"::equals).count()

        String s = list.stream().findFirst().orElse("mama");
        String firstMama = list.stream().filter("mama"::equals).findFirst().get();
        String fifthElement = list.stream().skip(4).findFirst().get();
        List<String> listOf2 =  list.stream().skip(2).limit(2).collect(Collectors.toList());
        List<String> listOfUnique = list.stream().filter(x -> x.contains("m")).distinct().collect(Collectors.toList());


        System.out.println(listOfUnique);

    }
}
