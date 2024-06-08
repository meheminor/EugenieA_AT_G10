package src.assignments.asgn1.prebase;

public class IncrementDecrementExample {

    public static void main(String[] args) {
        IncrementDecrementExample incrementDecrementExample = new IncrementDecrementExample();
        incrementDecrementExample.incrementDecrement();
    }

    public void incrementDecrement() {
        int ab = 99;
        ab += 1;
        System.out.println(ab);
        ab -= 99;
        System.out.println(ab);

    }
}
