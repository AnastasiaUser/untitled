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
        num[6] = 98775;
        num[7] = 930;
        num[8] = 1;
        num[9] = 32;

        int num2[] = { 1, 2, -56, 0, 8, 4, 2, 78, 32, 25};

        min = max = num2[0];

        for (int i = 1; i < 10; i++) {
            if (num2 [i] < min) min = num2[i];
            if (num2 [i] > max) max = num2[i];
        }
        System.out.println("min & max are " + min + " " + max);

    }
}
