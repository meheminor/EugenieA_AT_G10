package src.assignments.asgn3.task1.playground.runners;

import src.assignments.asgn3.task1.playground.essence.Flyable;
import src.assignments.asgn3.task1.playground.essence.craft.Rideable;
import src.assignments.asgn3.task1.playground.essence.craft.Transportable;
import src.assignments.asgn3.task1.playground.essence.craft.air.Aircraft;
import src.assignments.asgn3.task1.playground.essence.craft.air.Airplane;
import src.assignments.asgn3.task1.playground.essence.craft.air.Helicopter;
import src.assignments.asgn3.task1.playground.essence.craft.air.Rocket;
import src.assignments.asgn3.task1.playground.essence.craft.field.Car;
import src.assignments.asgn3.task1.playground.essence.craft.field.Moped;
import src.assignments.asgn3.task1.playground.essence.craft.field.Motorbike;
import src.assignments.asgn3.task1.playground.essence.craft.field.Vehicle;
import src.assignments.asgn3.task1.playground.processors.TransportableProcessor;

public class TransportableProcessorRunner {

    public static void main(String[] args) {

        TransportableProcessor transportableProcessor = new TransportableProcessor();

        Transportable transportableCopter = new Helicopter("AW109 Transportable", 223);
        Transportable transportablePlane = new Airplane("Airbus a380 Transportable", 3452);
        Transportable transportableRocket = new Rocket("Soyuz-FG Transportable", 7623);
        Transportable transportableCar = new Car(23, "Tesla X Transportable");
        Transportable transportableMoped = new Moped(12, "Honda EM1 Transportable");
        Transportable transportableMotorbike = new Motorbike(12, "Suzuki GSX-R1000 Transportable");
        Aircraft aircraftCopter = new Helicopter("AW109 Aircraft", 223);
        Aircraft aircraftPlane = new Airplane("Airbus a380 Aircraft", 3452);
        Aircraft aircraftRocket = new Rocket("Soyuz-FG Aircraft", 7623);
        Vehicle vehicleCar = new Car(23, "Tesla X Vehicle");
        Vehicle vehicleMoped = new Moped(12, "Honda EM1 Vehicle");
        Vehicle vehicleMotorbike = new Motorbike(12, "Suzuki GSX-R1000 Vehicle");
        Flyable flyableCopter = new Helicopter("AW109 Flyable", 223);
        Flyable flyablePlane = new Airplane("Airbus a380 Flyable", 3452);
        Flyable flyableRocket = new Rocket("Soyuz-FG Flyable", 7623);
        Rideable rideableCar = new Car(23, "Tesla X Rideable");
        Rideable rideableMoped = new Moped(12, "Honda EM1 Rideable");
        Rideable rideableMotorbike = new Motorbike(12, "Suzuki GSX-R1000 Rideable");
        Helicopter aCopter = new Helicopter("AW109 Copter", 223);
        Airplane aPlane = new Airplane("Airbus a380 Plane", 3452);
        Rocket aRocket = new Rocket("Soyuz-FG Rocket", 7623);
        Car aCar = new Car(23, "Tesla X Car");
        Moped aMoped = new Moped(12, "Honda EM1 Moped");
        Motorbike aMotorbike = new Motorbike(12, "Suzuki GSX-R1000 Motorbike");

        transportableProcessor.runTransportable(transportableCopter);
        transportableProcessor.runTransportable(transportablePlane);
        transportableProcessor.runTransportable(transportableRocket);
        transportableProcessor.runTransportable(transportableCar);
        transportableProcessor.runTransportable(transportableMoped);
        transportableProcessor.runTransportable(transportableMotorbike);
        transportableProcessor.runTransportable(aircraftCopter);
        transportableProcessor.runTransportable(aircraftPlane);
        transportableProcessor.runTransportable(aircraftRocket);
        transportableProcessor.runTransportable(aRocket);
        transportableProcessor.runTransportable(aCar);
        transportableProcessor.runTransportable(aMoped);
        transportableProcessor.runTransportable(aCopter);
        transportableProcessor.runTransportable(aPlane);
        transportableProcessor.runTransportable(aMotorbike);
        transportableProcessor.runTransportable(vehicleCar);
        transportableProcessor.runTransportable(vehicleMoped);
        transportableProcessor.runTransportable(vehicleMotorbike);
//        transportableProcessor.runTransportable(flyableCopter); //Flyable is an in interface that doesnt extend Transportable interface
//        transportableProcessor.runTransportable(flyableRocket);
//        transportableProcessor.runTransportable(flyablePlane);
//        transportableProcessor.runTransportable(rideableMoped);
//        transportableProcessor.runTransportable(rideableCar);
//        transportableProcessor.runTransportable(rideableMotorbike); //Rideable is an in interface that doesnt extend Transportable interface
//
        transportableProcessor.runTransportable(aircraftPlane, 23, 242);
        transportableProcessor.runTransportable(vehicleMotorbike, 93, 7);

    }
}
