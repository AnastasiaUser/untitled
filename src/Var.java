import java.util.Scanner;

public class Var {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number: ");
        int y = scan.nextInt();
        boolean isEven = y % 2 == 0;
        String x = (isEven) ? "even" : "odd";
        System.out.println("Your number is " + x);
    }
}
