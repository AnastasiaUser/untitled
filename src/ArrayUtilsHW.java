import java.util.Random;
import java.util.Scanner;

public class ArrayUtilsHW {

    int[] array;
    int preferableLength;
    int max;
    int min;

    int[] setValues (int[] array, int max) {
        Random rnd = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(max);
        }
        return array;
    }
    int[] setValues (int[] array, int min,int max){
        for (int i =0; i < array.length; i++) {
            array[i] = (int) ((Math.random() * (max - min)) + min);
        }
        return array;
    }

    void show(int[] array) {
        for (int el: array) {
            System.out.println(el + " ");
        }
        System.out.println();
    }
    void show(double[] array) {
        for (double el: array) {
            System.out.println(el + " ");
        }
        System.out.println();
    }
      int[] orderArray() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter length: ");
        this.preferableLength = in.nextInt();
        int[] arr = new int[preferableLength];
         System.out.println("Enter range from: ");
         min = in.nextInt();
         System.out.println("Enter range to: ");
         max = in.nextInt();
         return setValues(arr, min, max);
    }
    static double[] decreasedArr(int[] arr, int percent) {
        double[] decreasedArr = new double[arr.length];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("current arr[i]: " + arr[i]);
            decreasedArr[i] = arr[i] * 0.75;
        }
        return decreasedArr;
    }

}
