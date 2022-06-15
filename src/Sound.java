import java.util.Scanner;

public class Sound {

    public static void main(String[] args) {

        double speed = 343;
        double time;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the echo-time:");
         time = input.nextDouble();
        double distance = speed * time/2.0;

        System.out.println("Distance:" + distance);


        }

    }

