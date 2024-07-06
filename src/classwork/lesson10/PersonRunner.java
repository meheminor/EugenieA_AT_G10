package src.classwork.lesson10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PersonRunner {

    public static void main(String[] args) {

        ArrayList<Person> people = new ArrayList<Person>(Arrays.asList(new Person("Вася", 13, Person.Sex.MAN),
                new Person("Катя", 28, Person.Sex.WOMEN),
                new Person("Вова", 24, Person.Sex.MAN),
                new Person("Маша", 38, Person.Sex.WOMEN),
                new Person("Роман Петрович", 72, Person.Sex.MAN)));


        int counter = 0;
        for (Person person : people) {
            if ((person.getSex() == Person.Sex.MAN && person.getAge() > 18 && person.getAge() <= 60) ||
                    (person.getSex() == Person.Sex.WOMEN && person.getAge() > 18 && person.getAge() <= 55)) {
                counter++;
            }
        }

        System.out.println(counter);

        int workingPeople = (int) people.stream().filter(person -> {
            return (person.getAge() >= 18&&person.getAge()<=55) ||
                    (person.getSex() == Person.Sex.MAN && person.getAge() > 18 && person.getAge() <60);
        }).count();
        System.out.println(workingPeople);


    }
}
