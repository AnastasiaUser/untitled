public class MinMax {
    public static void main(String[] args) {
        int num[] = new int[10];

        int min, max;

        num[0] = 99;
        num[1] = -10;
        num[2] = 1;
        num[3] = -333;
        num[4] = 45;
        num[5] = 20;
        num[6] = 9877;
        num[7] = 930;
        num[8] = 1;
        num[9] = 32;

        min = max = num[0];
        for (int i = 1; i < 10; i++) {
            if (num [i] < min) min = num[i];
            if (num [i] < max) max = num[i];
        }
        System.out.println("min & max are " + min + " " + max);

    }
}
