package src.classwork.lesson6;

public class ConstClass {

    public static final int X = 7;
    public static final String S = "8";

    public static final User GUEST = new User("g", "123",1);
    public static final User ADMIN = new User("a", "1234",2);
    public static final User MEMBER = new User("u", "12345",3);

    public int getX() {
        return X;
    }

}
