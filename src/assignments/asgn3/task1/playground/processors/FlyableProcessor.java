package src.assignments.asgn3.task1.playground.processors;

import src.assignments.asgn3.task1.playground.essence.Flyable;
import src.assignments.asgn3.task1.playground.utils.DirectionGenerator;

public class FlyableProcessor {

    public void runFlyable(Flyable flyable){
        flyable.fly(DirectionGenerator.generateDirection());

    }

}
