package src.assignments.asgn3.task1.playground.essence.creatures;

import src.assignments.asgn3.task1.playground.essence.Flyable;

public class Mosquito extends Insect implements Flyable {

    public Mosquito(int mass, String name) {
        super(mass, name);

    }

    @Override
    public void fly(String direction) {
        String message = String.format("I am %s, my name is %s and I'm flying to %s.", Mosquito.class.getSimpleName(), name, direction);
        System.out.println(message);

    }

}


