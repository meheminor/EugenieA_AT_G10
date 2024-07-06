package src.classwork.lesson10;

public class Person {
    public String name;
    public int age;
    public Sex sex;

    public Person(String name, int age, Sex sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public Sex getSex() {
        return sex;
    }
    public String getName() {
        return name;
    }

    public enum Sex {MAN, WOMEN}
}
