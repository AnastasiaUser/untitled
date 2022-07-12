package Q;

import java.util.Scanner;

public class ExceptionTest {
    static void generateException(){
        int nums[] = new int[4];
        System.out.println("enter index");

        Scanner in = new Scanner(System.in);
        int userInput = in.nextInt();
            System.out.println("This should not be printed");
        }

    public static void main(String[] args) {
        try {
            ExceptionTest.generateException();
    }
        catch (ArrayIndexOutOfBoundsException exc){
            System.out.println("You are out of the bound of the array");
        }
        System.out.println("after catch");
    }
}
