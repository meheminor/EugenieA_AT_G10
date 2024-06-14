package src.assignments.asgn3.task1.playground.runners;

import src.assignments.asgn3.task1.playground.essence.Flyable;
import src.assignments.asgn3.task1.playground.essence.craft.air.Aircraft;
import src.assignments.asgn3.task1.playground.essence.craft.air.Airplane;
import src.assignments.asgn3.task1.playground.essence.craft.air.Helicopter;
import src.assignments.asgn3.task1.playground.essence.craft.air.Rocket;
import src.assignments.asgn3.task1.playground.essence.creatures.Fly;
import src.assignments.asgn3.task1.playground.essence.creatures.Insect;
import src.assignments.asgn3.task1.playground.essence.creatures.Mosquito;
import src.assignments.asgn3.task1.playground.processors.FlyableProcessor;

public class FlyableProcessorRunner {

    public static void main(String[] args) {
        FlyableProcessor flyableProcessor = new FlyableProcessor();
        Flyable flyableCopter = new Helicopter("Mi8 Flyable", 223);
        Flyable flyablePlane = new Airplane("Boeing 837 Flyable", 3452);
        Flyable flyableRocket = new Rocket("Super Heavy Flyable", 7623);
        Flyable flyableFly = new Fly(23, "Domestica Flyable");
        Flyable flyableMosquito = new Mosquito(12, "Vulgaris Flyable");
        Aircraft aircraftCopter = new Helicopter("Mi8 Aircraft", 223);
        Aircraft aircraftPlane = new Airplane("Boeing 837 Aircraft",3452);
        Aircraft aircraftRocket = new Rocket("Super Heavy Aircraft", 7623);
        Insect insectFly = new Fly(23, "Domestica Insect");
        Insect insectMosquito = new Mosquito(12, "Vulgaris Insect");
        Helicopter aCopter = new Helicopter("Mi8 Copter", 223);
        Airplane aPlane = new Airplane("Boeing 837 Plane",3452);
        Rocket aRocket = new Rocket("Super Heavy Rocket",7623);
        Fly aFly = new Fly(23, "Domestica Fly");
        Mosquito aMosquito = new Mosquito(12, "Vulgaris Mosquito");

        flyableProcessor.runFlyable(flyableCopter);
        flyableProcessor.runFlyable(flyablePlane);
        flyableProcessor.runFlyable(flyableRocket);
        flyableProcessor.runFlyable(flyableFly);
        flyableProcessor.runFlyable(flyableMosquito);
        flyableProcessor.runFlyable(aircraftCopter);
        flyableProcessor.runFlyable(aircraftPlane);
        flyableProcessor.runFlyable(aircraftRocket);
//        flyableProcessor.runFlyable(insectFly); //insect class does not implement Flyable interface
//        flyableProcessor.runFlyable(insectMosquito); //insect class does not implement Flyable interface
        flyableProcessor.runFlyable(aCopter);
        flyableProcessor.runFlyable(aPlane);
        flyableProcessor.runFlyable(aRocket);
        flyableProcessor.runFlyable(aFly);
        flyableProcessor.runFlyable(aMosquito);

        flyableFly.fly("nowhere");
        aircraftRocket.fly("everywhere");

    }
}
