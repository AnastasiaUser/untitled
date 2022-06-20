public class Min {
    public static void main(String[] args) {
        int[] num = new int[10];

        int min = 0;

        num[0] = 9;
        num[1] = -10;
        num[2] = 1;
        num[3] = -333;
        num[4] = 35;
        num[5] = 20;
        num[6] = 96775;
        num[7] = 930;
        num[8] = 15;
        num[9] = 41;


        for (int i = 1; i < 10; i++) {
            if (num [i] < min) min = num[i];
        }
        System.out.println("min " + min + " " );

}

}
