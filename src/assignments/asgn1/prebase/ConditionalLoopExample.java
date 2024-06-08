package src.assignments.asgn1.prebase;

public class ConditionalLoopExample {

    public static void main(String[] args) {
        ConditionalLoopExample loop = new ConditionalLoopExample();
        loop.loop();

    }

    public void loop() {
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }

        }
    }
}
