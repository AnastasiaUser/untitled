import java.util.Scanner;

public class SoundDn {
    public static void main(String[] args) {


    int i, j;
    boolean b1, b2;

    i = 10;
    j = 11;
    if (i < j) System.out.println("i < j");
    if (i <= j) System.out.println("i <= j");
    if (i != j) System.out.println("i != j");
    if (i == j) System.out.println("не будет выполнено");
    if (i >= j) System.out.println("не будет выполнено");
    if (i > j) System.out.println("не будет выполнено");

    b1 = true;
    b2 = false;
    if (b1 & b2) System.out.println("не будет выполнено");
    if (!(b1 & b2)) System.out.println("!(b1 & b2) : true");
    if (b1 | b2) System.out.println("b1 | b2 : true");
    if (b1 ^ b2) System.out.println("b1 ^ b2 : true");

//    Scanner input = new Scanner(System.in);
//    System.out.println("Enter birthday");
//    int birthday = input.nextInt();
//
//    System.out.println("Enter if promo is running");
//    boolean isPromo = input.nextBoolean();
//
//    int currentdate = 11;
//
//        if ((currentdate == birthday) & isPromo) System.out.println("не будет бонуса");
//        if ((currentdate == birthday) & isPromo) System.out.println("будет бонус");
//        if ((currentdate == birthday) & isPromo) System.out.println("сегодня не день рождения");
//        if ((currentdate == birthday) & isPromo) System.out.println("сегодня не день рождения, но за то у нас акция");

}
}