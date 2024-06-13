package src.assignments.asgn3.task1.playground.essence.creatures;

public abstract class Verterbrata extends Animal {

    public Verterbrata(String name, int mass) {
        super(mass, name);
    }

    public void eat(Insect food) {
        String message = String.format("I am %s and I am eating %s", name, food);
        System.out.println(message);
    }

}
