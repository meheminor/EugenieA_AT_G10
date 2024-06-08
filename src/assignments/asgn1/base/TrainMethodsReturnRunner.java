package src.assignments.asgn1.base;


//public class TrainMethodsReturnRunner {
//    public static void main(String[] args) {
//        TrainMethodsReturn trainMethodsReturn = new TrainMethodsReturn();
//        StringBuilder sb = new StringBuilder();
//        sb.append("метод ");
//        boolean value = trainMethodsReturn.returnNewBoolean(true, sb);
//        sb.append( " вернул ");
//        sb.append(value);
//        System.out.println( sb.toString() );
//    }
//}
public class TrainMethodsReturnRunner {

    public static void main(String[] args) {
        TrainMethodsReturn trainMethodsReturn = new TrainMethodsReturn();
        System.out.println("method returnNewBoolean returned: " + trainMethodsReturn.returnNewBoolean(true));
        System.out.println("Method returnNewByte returned: " + trainMethodsReturn.returnNewByte((byte) 45));
        System.out.println("Method returnNewChar returned: " + trainMethodsReturn.returnNewChar('V'));
        System.out.println("Method returnNewDouble returned: " + trainMethodsReturn.returnNewDouble(25458.455545654));
        System.out.println("Method returnNewLong returned: " + trainMethodsReturn.returnNewLong(5000345265822L));
        System.out.println("Method returnNewInt returned: " + trainMethodsReturn.returnNewInt(59525));
        System.out.println("Method returnNewFloat returned: " + trainMethodsReturn.returnNewFloat(2.999F));
        System.out.println("Method returnNewShort returned: " + trainMethodsReturn.returnNewShort((short) 1999));

    }
}