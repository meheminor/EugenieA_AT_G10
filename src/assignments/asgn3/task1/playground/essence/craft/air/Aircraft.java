package src.assignments.asgn3.task1.playground.essence.craft.air;

import src.assignments.asgn3.task1.playground.essence.Flyable;
import src.assignments.asgn3.task1.playground.essence.Matter;
import src.assignments.asgn3.task1.playground.essence.craft.Transportable;


public abstract class Aircraft extends Matter implements Transportable, Flyable {

    protected String name;

    public Aircraft(int mass, String name) {
        super(mass);
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void fly(String direction) {
        String message = String.format("I am %s, my name is %s and I'm flying to %s.", this.getClass().getSimpleName(), name, direction);
        System.out.println(message);

    }
}
