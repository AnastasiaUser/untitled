import java.io.IOException;

public class Break2 {
    public static void main(String[] args) throws IOException {
        char ch;

        for (int i = 0; i < 3; i++) {
            System.out.println("Outer loop counter: " + i);
            System.out.println("Inner loop counter: ");
            int t = 0;
            while (t<100) {
                if (t == 10) break;
                System.out.println(t + " ");
                t++;
            }
            System.out.println();
        }
        System.out.println("loops are completed");

//        char ch1 = (char) System.in.read();
//        char ch2 = (char) System.in.read();
//        char ch3 = (char) System.in.read();
//        char ch4 = (char) System.in.read();
//        char ch5 = (char) System.in.read();
//
//        System.out.println("ch1 " + ch1);
//        System.out.println("ch2 " + ch2);
//        System.out.println("ch3 " + ch3);
//        System.out.println("ch4 " + ch4);
//        System.out.println("ch5 " + ch5);

    }
}
