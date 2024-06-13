package src.assignments.asgn3.task1.playground.essence;

public abstract class Matter {
    protected String weight;
    protected int mass;

    public Matter(int mass) {
        this.mass = mass;
    }

    public int getMass() {
        return mass;
    }

    public void setMass(int mass) {
        this.mass = mass;
    }
}
