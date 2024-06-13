package src.assignments.asgn3.task1.playground.essence.creatures;
import src.assignments.asgn3.task1.playground.essence.Matter;


public abstract class Plant extends Matter {

    protected String name;

    public Plant(String name, int mass) {
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
