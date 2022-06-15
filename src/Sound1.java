import java.util.Scanner;

public class Sound1 {
    public static void main(String[] args) {
        double time;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter time");
        while (!input.hasNextDouble()) {
            String in = input.next();
            System.out.println("Invalid: " + in);
            System.out.print("Number: ");
        }
        time = input.nextDouble();
        System.out.println(time);
    }
}
