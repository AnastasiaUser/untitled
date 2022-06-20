public class ArrayUtils {
    int i;
            ArrayUtils(int i) {
        this.i = i;
    }
    void demonstrateArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Element [" + i + "]:" + arr[i]);
        }
        System.out.println("this was array of integers");
    }

    void demonstrateArr(Vehicle[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Element [" + i + "]:" + arr[i]);
        }
        System.out.println("this was array of strings");
    }
    void divisionSmth (int a, int b) {
        if (b==0) return;
        else System.out.println(a/b);
    }

    void sumSmth(int a, int b) {
        System.out.println(a+b);
    }
    int sumSmth2(int a, int b) {return a+b;}
}
