package src.assignments.asgn4;

public class GenericMethodsInGenericClassTwoParams<X,Y> {

    X var;
    Y var2;

    public String genericMethodGenArgs(X var){
        return String.format("I received 1 argument of type: %s class", var.getClass().getSimpleName());
    }
    public String genericMethodGenArgs(X var, Y var2){
        return String.format("I received 2 arguments of type: %s class, %s class", var.getClass().getSimpleName(), var2.getClass().getSimpleName());
    }

    public void genericMethodHalfGenArgs(X var, String str){
         String message = String.format("I got an object of %s class and string with %s characters", var.getClass().getSimpleName(), str.length());
         System.out.println(message);
    }
    public void genericMethodHalfGenArgs(X var, Y var2, String str){
        String message = String.format("I got an object of %s class and %s class and string with %s characters", var.getClass().getSimpleName(), var2.getClass().getSimpleName(),  str.length());
        System.out.println(message);
    }

}
