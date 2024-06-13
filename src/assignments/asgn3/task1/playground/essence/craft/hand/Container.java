package src.assignments.asgn3.task1.playground.essence.craft.hand;
import src.assignments.asgn3.task1.playground.essence.Matter;

public abstract class Container extends Matter {

    protected String name;
    public Container(int mass, String name) {
        super(mass);
        this.name = name;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
}
