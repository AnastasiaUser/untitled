import java.util.Scanner;

public class StringOperation {

    public static void main (String[] args) {

     Scanner myLittleScanner = new Scanner(System.in);

            int number1;
            int number2;

            System.out.println("Enter first integer: ");//просим пользователя ввести значения
            number1 = myLittleScanner.nextInt();//вкладываем это значение в переменную number1 целостного числа

        System.out.println("Enter second integer: ");//просим пользователя ввести значения
        number2 = myLittleScanner.nextInt();//вкладываем это значение в переменную number1 целостного числа

        if (number1 == number2)
        System.out.printf("%d == %d%n", number1, number2 );
        if (number1 != number2)
            System.out.printf("%d != %d%n", number1, number2 );
        if (number1 < number2)
            System.out.printf("%d < %d%n", number1, number2 );
        if (number1 > number2)
            System.out.printf("%d > %d%n", number1, number2 );
        if (number1 <= number2)
            System.out.printf("%d <= %d%n", number1, number2 );
        if (number1 >= number2)
            System.out.printf("%d >= %d%n", number1, number2 );


    }

}
