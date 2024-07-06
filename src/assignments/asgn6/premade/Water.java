package src.assignments.asgn6.premade;

public class Water implements MainHashCodeGen {

    private String color;
    private String smell;

    public Water(String color, String smell) {
        this.color = color;
        this.smell = smell;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSmell() {
        return smell;
    }

    public void setSmell(String smell) {
        this.smell = smell;
    }

    public String toString(Object obj) {
        return obj.toString();
    }

    public int hashCodeColor() {
        return this.color.hashCode();
    }

    public int hashCodeSmell() {
        return this.smell.hashCode();
    }

    public int hashCodeGen() {
        int fullHashCode = this.color.hashCode();
        return 5 * fullHashCode + this.smell.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else {
            return false;
        }
    }
}
