package src.assignments.asgn1.base;

public class TrainMethodsReturn {

    public int returnNewInt(int i) {
        return i * 3;
    }

    public long returnNewLong(long l) {
        return l - 4;
    }

    public String returnNewChar(char c) {

        return "" + c + c;
    }

    public float returnNewFloat(float f) {
        return f / 2;
    }

    public double returnNewDouble(double d) {
        return d + 8;
    }

    public short returnNewShort(short s) {
        return (short) (s - 1);
    }

    public int returnNewByte(byte b) {
        String methodName = "returnNewByte";
        return b * 2;
    }

    public boolean returnNewBoolean(boolean bool) {
        String methodName = "returnNewBoolean";
        bool = !bool;
        return bool;
    }


}
