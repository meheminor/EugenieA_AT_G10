package src.assignments.asgn1.base;

public class Sauce {

    private String name;
    private String color;

    public Sauce(String color, String name) {
        this.color = color;
        this.name = name;
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

    public void printSauceDetails() {
        System.out.print("Это соус " + name + " " + color + " цвета.");
    }
}
