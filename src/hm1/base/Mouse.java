package src.hm1.base;

public class Mouse {
    private String name;
    private int age;

    public Mouse(String name, int age) {
        this.name= name;
        this.age = age;
    }

    public void printMouseDetails(){
        String message = String.format("Я мышь, меня зовут %s и мне %d лет.", name, age);
        System.out.println(message);
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }
}
