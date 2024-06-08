package src.assignments.asgn1.prebase;

public class SimpleLoopExample {

    public static void main(String[] args) {
        SimpleLoopExample sloop = new SimpleLoopExample();
        sloop.sloop(9);
    }

    public void sloop(int f) {
        for (int i = 1; i < f; i++) {
            System.out.print(i);
        }
    }
}
