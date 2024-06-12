package src.assignments.asgn1.base;

public class Bee {

    private String gender;
    private int weight;

    public Bee(String gender, int weight) {
        this.gender = gender;
        this.weight = weight;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void printBeeDetails() {
        int newWeight = 500 / weight;
        if (newWeight >= 2) {
            System.out.println(String.format("Я легче лося в %d раз", newWeight));
        } else {
            System.out.println("Я слишком тяжелая");
        }
    }
}
