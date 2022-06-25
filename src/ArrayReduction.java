import java.util.Arrays;

public class ArrayReduction {
    public static void main(String[] args) {

        int [] array = {1,2,3,4,5,6,7};
        Arrays.stream(array).skip(3).forEach(System.out::println);

    }
}


//        int arr[] = new int[]{12,34,21,33,22,55};
//        for(int a: arr) {
//            System.out.print(a+" ");
//        }
//        int arr2[] = new int[10];
//        for (int i = 0; i < arr.length; i++) {
//            arr2[i] = arr[i];
//        }
//        System.out.println();
//        for(int a: arr2) {
//            System.out.print(a+" ");
//        }
//    }
//}








