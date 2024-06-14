package src.assignments.asgn3.task1.playground.processors;

import src.assignments.asgn3.task1.playground.essence.craft.Transportable;
import src.assignments.asgn3.task1.playground.utils.CoordinatesGenerator;

public class TransportableProcessor {

    public void runTransportable(Transportable transportable, int pointA, int pointB) {

        System.out.println("Transportable " + transportable.getClass().getSimpleName() + " was moved to " + transportable.move(pointA, pointB) + " points.");
    }

    public void runTransportable(Transportable transportable) {
        System.out.println("Transportable " + transportable.getClass().getSimpleName() + " was moved to " + transportable.move(CoordinatesGenerator.generateCoordinate(), CoordinatesGenerator.generateCoordinate()) + " points.");
    }

}
