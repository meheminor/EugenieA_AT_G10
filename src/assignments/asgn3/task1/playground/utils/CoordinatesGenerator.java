package src.assignments.asgn3.task1.playground.utils;

public class CoordinatesGenerator {

    public static int generateCoordinate() {
        int minNumber = 1;
        int maxNumber = 80;
        int randomNumber = (int) (Math.random() * (maxNumber - minNumber) + minNumber);

        System.out.println("CoordinatesGenerator: I have generated point with value: " + randomNumber + ".");
        return randomNumber;
    }
}
