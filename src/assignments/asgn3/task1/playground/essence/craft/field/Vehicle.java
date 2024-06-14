package src.assignments.asgn3.task1.playground.essence.craft.field;

import src.assignments.asgn3.task1.playground.essence.Matter;
import src.assignments.asgn3.task1.playground.essence.craft.Rideable;
import src.assignments.asgn3.task1.playground.essence.craft.Transportable;

public abstract class Vehicle extends Matter implements Transportable, Rideable {

    protected String name;

    public Vehicle(int mass, String name) {
        super(mass);
        this.name = name;
    }

    public int move(int pointA, int pointB) {
        String message = String.format("I am %s, my name is %s and I am moving from point %s to point %s.", this.getClass().getSimpleName(), name, pointA, pointB);
        System.out.println(message);
        return pointB - pointA;

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


}
