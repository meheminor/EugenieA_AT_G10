package src.assignments.asgn3.task1.playground.essence.creatures;

import src.assignments.asgn3.task1.playground.essence.Flyable;
import src.assignments.asgn3.task1.playground.essence.craft.air.Aircraft;

public class Fly extends Insect implements Flyable {

    public Fly(int mass, String name) {
        super(mass, name);
    }

    @Override
    public void fly(String direction) {
        String message = String.format("I am %s, my name is %s and I'm flying to %s.", Fly.class.getSimpleName(), name, direction);
        System.out.println(message);

    }
}
