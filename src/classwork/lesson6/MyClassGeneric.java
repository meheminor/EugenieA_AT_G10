package src.classwork.lesson6;

public class MyClassGeneric<T> {  //<T> - T name of variable. This is unknown variable type, сам по себе ссылочный типа данных

    T var;

    public T getVar() {
        return var;
    }
    public void setVar(T var) {
        this.var = var;
    }
}
