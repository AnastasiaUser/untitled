package Q;

import java.util.Scanner;

public class ExceptionDemo {
    public static void main(String[] args) {
        int nums[] = new int[4];
        System.out.println("enter index");

        Scanner in = new Scanner(System.in);
        int userInput = in.nextInt();

        try{
            System.out.println("Before generating exception ");
            nums[5] = 10;
            System.out.println("This should be printed");
        }
        catch (ArrayIndexOutOfBoundsException exc){
            System.out.println("You are out of the bound of the array");
        }
        System.out.println("after catch");

//        nums[userInput] = 10;
//        System.out.println("after no catch");


    }
}
