public class VariableNumberOfArguments {
    static void varNumArgTest(int ... v) {
        System.out.println("Number of arguments: " + v.length);
        System.out.println("Values: ");

        for (int i = 0; i < v.length; i++) {
            System.out.println("arg " + i + ": " + v[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        varNumArgTest(10);
        varNumArgTest(10, 20, 30);
        varNumArgTest();

    }
}
