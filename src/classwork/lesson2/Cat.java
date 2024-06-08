package lesson2;

public class Cat {

    private int age;
    private String name;
    private String color;
    private boolean isFluffy;
    private boolean isSleeping;

    public Cat(int age, String name, String color, boolean isFluffy, boolean isSleeping) {
        this.age = age;
        this.name = name;
        this.color = color;
        this.isFluffy = isFluffy;
        this.isSleeping = isSleeping;

    }

    public int getAge(){
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFluffy() {
        return isFluffy;
    }

    public void setFluffy(boolean fluffy) {
        isFluffy = fluffy;
    }

    public boolean isSleeping() {
        return isSleeping;
    }

    public void setSleeping(boolean sleeping) {
        isSleeping = sleeping;
    }
}
