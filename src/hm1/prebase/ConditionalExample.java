package hm1.prebase;

public class ConditionalExample {
    public static void main(String[] args) {
        ConditionalExample example = new ConditionalExample();
        example.conditionalExample(34);

    }

    public void conditionalExample(int f) {
        if (f<10) {
            System.out.println(f + " is less than 10.");}
            else {
                System.out.println(f + " is greater than 10.");
            }


    }
}
