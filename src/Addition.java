import java.util.Scanner;

public class Addition {
    public static void main(String[] args){

        Scanner myLittleScanner = new Scanner(System.in);

        int number1 = 2;
        int number2 = 3;
        int sum;

        System.out.println("Enter first integer: ");//просим пользователя ввести значения
        number1 = myLittleScanner.nextInt();//вкладываем это значение в переменную number1 целостного числа

        System.out.println("Enter second integer: ");//просим пользователя ввести значения
        number2 = myLittleScanner.nextInt();//вкладываем это значение в переменную number1 целостного числа

        sum = number1 + number2;

        System.out.println("This is a sum" + sum);
        System.out.printf("Sum is: %d", sum);

    }
}
