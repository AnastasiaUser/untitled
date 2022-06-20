public class TwoD {
    public static void main(String[] args) {

        int i, t;

        int table[][] = new int[4][5];
        int [][]table2 = new int[4][5];


        Vehicle v1 =new Vehicle("car1", 4, 5);
        Vehicle v2 =new Vehicle("car2", 4, 5);
        Vehicle v3 =new Vehicle("car3", 4, 5);

        Vehicle[] stringArray = {v1, v2, v3};

        for (t = 0; t < 4; ++t) {
            for (i = 0; i < 5; ++i) {
                table[t][i] = (t * 5) + i + 1;
                System.out.print(table[t][i] + "\t");
            }
            System.out.println();
        }
        for (i = 0; i < stringArray.length; i++) {
            System.out.println(stringArray.length);
        }
        int k = 0;
        ArrayUtils helper = new ArrayUtils(k);

        helper.sumSmth(2, 5);

        int result = helper.sumSmth2(2, 5);
        helper.demonstrateArr(stringArray);
    }
}