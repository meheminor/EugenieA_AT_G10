package src.classwork.lesson6;

public class User {

    String login, password;
    int id;

    public User(String login, String password, int id) {
        this.login = login;
        this.password = password;
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public int getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }
}


//admin, member,guest

