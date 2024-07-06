package src.classwork.lesson6;

public enum UserE {

    GUEST("q", "123", 1),
    MEMBER("m","123", 3),
    ADMIN("g","123",3);

    public final String LOGIN, PASSWORD;
    public final int ID;

    UserE(String login, String password, int id) {
        this.LOGIN = login;
        this.PASSWORD = password;
        this.ID = id;
    }

}
