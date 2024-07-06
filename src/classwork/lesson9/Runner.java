package src.classwork.lesson9;

public class Runner {

    public static void main(String[] args) {

//        MyClass mc =  new MyClass();
//        mc.justMethod(()-> 5666.666);

//        MyClass mc2 =  new MyClass();
//        mc2.justMethod()-> {
//             33.44;
//        }

        MyClass mc = new MyClass();
        mc.justMethod(System.out::println);

//        MyClass mc2 = new MyClass();
//        mc2.justMethod((string) -> {
//            System.out.println("string2");
//        });

    }
}
