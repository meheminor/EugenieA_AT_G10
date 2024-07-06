package src.classwork.lesson11;

import static java.lang.Math.atan;
import static java.lang.Math.tan;

public class First {

    public static void heavyMethod() {
        long t0 = System.currentTimeMillis();
        for (int i = 0; i < 1_00_000_000; i++) {
            double d = tan(atan(123456789.123456789));
        }
        System.out.printf("I am %s, and I have finished in %s millis \r\n", Thread.currentThread().getName(), (System.currentTimeMillis() - t0));

    }

    public static void main(String[] args) throws InterruptedException {
//        for(int i = 0; i < 5; i++) {
//            heavyMethod();
//        } //12,4millis

//        for (int i = 0; i < 5; i++) {
//            new Thread(() -> heavyMethod()).start();
//        } // 3millis

//        Thread t1 = new Thread(() -> heavyMethod());
//        Thread t2 = new Thread(First::heavyMethod);
//        Thread t3 = new Thread(() -> heavyMethod());
//        t1.start();
//        t1.join();
//        t2.start();
//        t2.join();
//        t3.start();
//        t3.join();

//        Thread t1 = new Thread(First::heavyMethod);
//        Thread t2 = new Thread(First::heavyMethod);
//        Thread  t3 = new Thread(() -> {
//            try{
//                t2.join();
//            }catch (InterruptedException e){
//                e.printStackTrace();
//            }
//            heavyMethod();
//        });
//
//        t1.start();
//        t2.start();
//        t3.start();




    }
}
