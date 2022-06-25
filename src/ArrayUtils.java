public class ArrayUtils {
    public static void main(String[] args) {
        ArrayUtilsHW helper = new ArrayUtilsHW();

        int[] arr = helper.orderArray();
        helper.show(arr);

        double[] darr = new double[]{1, 2, 4, 7, 8, 9};

        for (int i = 0; i < darr.length; i++) {
            darr[i] = darr[i] * 0.75;
        }

        double[] resultOfDecreaseOfArr = ArrayUtilsHW.decreasedArr(arr, 25);
        helper.show(resultOfDecreaseOfArr);
    }

}



