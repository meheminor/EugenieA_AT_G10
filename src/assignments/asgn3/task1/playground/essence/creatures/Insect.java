package src.assignments.asgn3.task1.playground.essence.creatures;

public abstract class Insect extends Animal {

    public Insect(int mass, String name) {
        super(mass, name);
    }

    public void nest(Carrot home) {
        if (mass < home.getMass()) {
            int d = home.getMass() % mass;
            String message = String.format("I am %s and I will nest there with %d my family members!", name, d);
        } else System.out.println("This carrot is too small for nesting :(");
    }

    ;
}
