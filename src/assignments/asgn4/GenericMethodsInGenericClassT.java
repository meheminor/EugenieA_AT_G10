package src.assignments.asgn4;

public class GenericMethodsInGenericClassT<T, S> {

    T var;
    S var2;

    public T getVar() {
        return var;
    }

    public void setVar(T var) {
        this.var = var;
    }

    public S getVar2() {
        return var2;
    }

    public void setVar2(S var2) {
        this.var2 = var2;
    }

    public void genericMethodOneGenArg(T var) {
        String message = String.format("I am an object of %s class", var.getClass().getSimpleName());
        System.out.println(message);

    }

    public String genericMethodTwoGenArgs(T var, S var2) {
        return String.format("We are objects of %s class and %s class", var.getClass().getSimpleName(), var2.getClass().getSimpleName());
    }

    public void genericMethodHalfGenArgs(String var, S var2){

        String message = String.format("I got an object of %s class and string with %s characters", var2.getClass().getSimpleName(), var.length());
        System.out.println(message);
    }


}
