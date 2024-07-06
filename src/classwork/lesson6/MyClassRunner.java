package src.classwork.lesson6;

public class MyClassRunner {

    public static void main(String[] args) {
        MyClassString ob = new MyClassString();
        ob.setVar("new val");

        MyClassInt ob2 = new MyClassInt();
        ob2.setVar(233);

        MyClassObject ob3 = new MyClassObject();
        ob3.setVar("new val");
        ob3.setVar(233);
        ob3.setVar(new MyClassString());

        if (ob3.getVar() instanceof String) {

            String s = (String) ob3.getVar();
        }

        if (ob3.getVar() instanceof Integer) {

            int s = (int) ob3.getVar();
        }

        MyClassGeneric<String> ob4 = new MyClassGeneric<>();
        MyClassGeneric<Integer> ob5 = new MyClassGeneric<>();
        MyClassGeneric<MyClassString> ob6 = new MyClassGeneric<>();

        ob4.setVar("new val");
        ob5.setVar(233);
        ob6.setVar(new MyClassString());

        MyClassGeneric2<String, MyClassGeneric<MyClassString>> ob8 = new MyClassGeneric2<>();
    }

    int x = ConstClass.X;

    User user = ConstClass.MEMBER;

    User user2 = new User("", "0", 5);


    static void methodIf(User x) {
        if (x.equals(ConstClass.MEMBER)) {
            System.out.println(1);
        } else if (x.equals(ConstClass.ADMIN)) {
            System.out.println(2);
        } else if (x.equals(ConstClass.GUEST)) {
            System.out.println(3);

        }
    }

    User user3 = ConstClass.MEMBER;
    String login = UserE.MEMBER.LOGIN;

//    static void method(User x) {
//        switch (x) {
//            case 1:
//                System.out.println(1);
//                break;
//            case 2:
//                System.out.println(2);
//                break;
//            case 3:
//                System.out.println(3);
//                break;
//        }
//    }
}
