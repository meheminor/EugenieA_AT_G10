package src.assignments.asgn1.base;

public class TrainMethodsObjects {

    public static void main(String[] args) {
        Mouse mouse = new Mouse("Chappi", (int) 1.5);
        mouse.printMouseDetails();
        System.out.println(mouse.getAge());
        mouse.setAge(5);
        System.out.println(mouse.getAge());
        mouse.printMouseDetails();

        Sauce sauce = new Sauce("red", "bolognese");
        sauce.printSauceDetails();

        Bee bee = new Bee("female", 20);
        bee.printBeeDetails();
        System.out.println(bee.getWeight());

        Obstacle obstacle = new Obstacle("В ручке закончились чернила", "важно");
        obstacle.printObstacleDetails();

        Pineapple pineapple = new Pineapple("idk", 223);
        pineapple.printPineappleDetails();
    }

}
