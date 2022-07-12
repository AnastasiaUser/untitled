package hWPhone;

import java.util.Scanner;

public class Num extends Phone{

    static int getNum() {

        Scanner num = new Scanner(System.in);

        return num.nextInt();
    }
    static String getStr() {

        Scanner str = new Scanner(System.in);

        return str.nextLine();

    }
}
