package src.hm1.base;

public class TrainMethodsObjects {
    public static void main(String[] args) {
        Mouse mouse =  new Mouse("Chappi",(int) 1.5);
        mouse.printMouseDetails();
        System.out.println(mouse.getAge());
        mouse.setAge(5);
        System.out.println(mouse.getAge());
        mouse.printMouseDetails();

    }
}
