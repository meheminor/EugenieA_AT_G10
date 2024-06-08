package hm1.prebase;

public class MultiplicationTable {
    public static void main(String[] args) {

        MultiplicationTable multTable = new MultiplicationTable();
        multTable.multTable();
    }

    public void multTable() {
        int[] table = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < table.length; i++) {
//         System.out.println(table[i] + " multiplied by 5 = " + table[i]*5);
            System.out.println(table[i] + " 5 " + table[i] * 5);
        }
    }
}

