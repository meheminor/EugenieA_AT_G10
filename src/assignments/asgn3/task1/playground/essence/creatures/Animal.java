package src.assignments.asgn3.task1.playground.essence.creatures;

import src.assignments.asgn3.task1.playground.essence.Matter;

public abstract class Animal extends Matter {

    protected String name;

    public Animal(int mass, String name) {
        super(mass);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void eat(Plant food) {
        String message = String.format("I am %s and I am eating %s", name, food);
        System.out.println(message);
    }
}
