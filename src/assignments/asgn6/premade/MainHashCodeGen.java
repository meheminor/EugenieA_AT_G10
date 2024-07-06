package src.assignments.asgn6.premade;

public interface MainHashCodeGen {


     default int hashCodeGen() {
        int fullHashCode = this.getClass().getName().hashCode();
        return 5 * fullHashCode + this.getClass().getName().hashCode();
    }
}
