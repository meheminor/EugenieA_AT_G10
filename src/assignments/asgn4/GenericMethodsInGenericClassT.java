package src.assignments.asgn4;

public class GenericMethodsInGenericClassT<T> {
//
//    public T getVar() {
//        return var;
//    }
//
//    public void setVar(T var) {
//        this.var = var;
//    }

    public void genericMethodOneGenArg(T var) {
        String message = String.format("I am an object of %s class", var.getClass().getSimpleName());
        System.out.println(message);

    }

    public String genericMethodTwoGenArgs(T var, T var2) {
        return String.format("We are objects of %s class and %s class", var.getClass().getSimpleName(), var2.getClass().getSimpleName());
    }

    public void genericMethodHalfGenArgs(String str, T var) {

        String message = String.format("I got an object of %s class and string with %s characters", var.getClass().getSimpleName(), str.length());
        System.out.println(message);
    }


}
