package src.assignments.asgn4;

import src.assignments.asgn3.task1.playground.essence.craft.air.Airplane;
import src.assignments.asgn3.task1.playground.essence.craft.air.Helicopter;
import src.assignments.asgn3.task1.playground.essence.craft.air.Rocket;
import src.assignments.asgn3.task1.playground.essence.craft.field.Car;
import src.assignments.asgn3.task1.playground.essence.craft.field.Motorbike;
import src.assignments.asgn3.task1.playground.essence.craft.field.Moped;
import src.assignments.asgn3.task1.playground.essence.creatures.Beetle;
import src.assignments.asgn3.task1.playground.essence.creatures.Fly;
import src.assignments.asgn3.task1.playground.essence.creatures.Raven;

public class GenericMethodsInGenericClassTRunner {
    public static void main(String[] args) {

        GenericMethodsInGenericClassT genericMethodAirplane = new GenericMethodsInGenericClassT<Airplane>();
        GenericMethodsInGenericClassT genericMethodMotorbike = new GenericMethodsInGenericClassT<Motorbike>();
        GenericMethodsInGenericClassT genericMethodHelicopter = new GenericMethodsInGenericClassT<Helicopter>();
        GenericMethodsInGenericClassT genericMethodRocket = new GenericMethodsInGenericClassT<Rocket>();
        GenericMethodsInGenericClassT genericMethodCar = new GenericMethodsInGenericClassT<Car>();
        GenericMethodsInGenericClassT genericMethodMoped = new GenericMethodsInGenericClassT<Moped>();
        GenericMethodsInGenericClassT genericMethodBeetle = new GenericMethodsInGenericClassT<Beetle>();
        GenericMethodsInGenericClassT genericMethodFly = new GenericMethodsInGenericClassT<Fly>();
        GenericMethodsInGenericClassT genericMethodRaven = new GenericMethodsInGenericClassT<Raven>();
        Airplane airplane = new Airplane("Boeing", 3444);
        Rocket rocket = new Rocket("Rocket", 2345);
        Raven raven = new Raven("Raven", 18);
        Beetle beetle = new Beetle("Beetle", 1);
        Fly fly = new Fly(1, "Fly");
        Moped moped = new Moped(189, "Moped");
        Car car = new Car(190, "car");
        Helicopter helicopter = new Helicopter("Helicopter", 1899);
        Motorbike motorbike = new Motorbike(367, "motorbike");

        genericMethodAirplane.genericMethodHalfGenArgs("Today is running" ,airplane);
        genericMethodMoped.genericMethodHalfGenArgs("blabla",moped );
        genericMethodHelicopter.genericMethodHalfGenArgs("no", helicopter);
        genericMethodRocket.genericMethodHalfGenArgs("", rocket);
        genericMethodCar.genericMethodHalfGenArgs(" . ", car);
        genericMethodMotorbike.genericMethodHalfGenArgs("motorbike", motorbike);
        genericMethodFly.genericMethodHalfGenArgs("I'm bored", fly);
        genericMethodRaven.genericMethodHalfGenArgs("wtf", raven);
        System.out.println(genericMethodBeetle.genericMethodTwoGenArgs(beetle, rocket));




        //genericMethod1.genericMethodHalfGenArgs("December is the first month of the Year.", 23);

    }
}
