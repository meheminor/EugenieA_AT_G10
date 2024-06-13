package src.assignments.asgn3.task1.playground.essence.craft.field;

import src.assignments.asgn3.task1.playground.essence.Matter;

public abstract class Vehicle extends Matter {

    protected String name;

    public Vehicle(int mass, String name) {
        super(mass);
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
