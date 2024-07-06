package src.classwork.lesson10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThirdTask {


    public static void main(String[] args) {
        List<String> list = Arrays.asList("mama", "myla", "ramu", "clean", "aa", "mama");
        ArrayList<Person> people = new ArrayList<Person>(Arrays.asList(
                new Person("Вася", 13, Person.Sex.MAN),
                new Person("Катя", 28, Person.Sex.WOMEN),
                new Person("Вова", 24, Person.Sex.MAN),
                new Person("Маша", 38, Person.Sex.WOMEN),
                new Person("Роман Петрович", 72, Person.Sex.MAN)));


        List<String> alphabetSorted = list.stream().sorted().toList();
        List<String> alphabetReversed = list.stream().sorted((a, b) -> -a.compareTo(b)).filter(String::isEmpty).toList();
        List<Person> peopleByGender = people.stream().sorted((a, b) -> {
            if (a.getSex().compareTo(b.getSex()) == 0) {
                return a.getAge() - (b.getAge());
            } else {
                return a.getSex().compareTo(b.getSex());
            }
        }).peek(e -> System.out.println(e.getName())).toList();


        System.out.println(alphabetSorted);

    }
}
