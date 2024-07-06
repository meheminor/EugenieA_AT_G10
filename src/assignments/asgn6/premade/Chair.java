package src.assignments.asgn6.premade;

public class Chair implements MainHashCodeGen{

    private int height;
    private int width;

    public Chair(int height, int width) {
        this.height = height;
        this.width = width;

    }
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public int getWidth() {
        return width;
    }
    public void setWidth(int width) {
        this.width = width;
    }
    public String toString(Object obj) {
        return obj.toString();
    }

    @Override
    public int hashCodeGen() {
        int fullHashCode = toString(this.width).hashCode();
        return 5 * fullHashCode + toString(this.height).hashCode();
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
