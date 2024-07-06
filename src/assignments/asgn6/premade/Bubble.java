package src.assignments.asgn6.premade;

public class Bubble implements MainHashCodeGen{
    private int volume;
    private String name;

    public Bubble(int volume, String name) {
        this.volume = volume;
        this.name = name;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String toString(Object obj) {
        return obj.toString();
    }

    public int hashVolume() {
        return toString(this.volume).hashCode();

    }

    public int hashName() {
        return this.name.hashCode();
    }

    public int hashCodeGen(){
        int fullHashCode = this.name.hashCode();
        return 5 * fullHashCode + toString(this.volume).hashCode();
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }else{
            return false;}

//        return volume == bubble.volume && name.equals(bubble.name);
    }


    }


