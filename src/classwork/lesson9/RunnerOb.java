package src.classwork.lesson9;

public class RunnerOb {
    public static void main(String[] args) {

        MyObClass mc = new MyObClass();
        mc.justMethod(ClassX::new);
    }
}
