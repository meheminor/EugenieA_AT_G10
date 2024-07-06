package src.assignments.asgn6.premade;

public class Sand implements MainHashCodeGen{

    private int age;
    private String name;

    public Sand(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String toString(Object obj) {
        return obj.toString();
    }

    @Override
    public int hashCodeGen() {
        int fullHashCode = this.name.hashCode();
        return 5 * fullHashCode + toString(this.age).hashCode();
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
