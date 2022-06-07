public class Ladder {
    public static void main(String[] args) {
        int x;

        for (x = 0; x<6; x++) {
            if (x == 1)
                System.out.println(" x равно единицы ");
            else if (x == 2)
                System.out.println(" x равно двум");
            else if (x == 3)
                System.out.println(" x равно трём");
            else if (x == 4)
                System.out.println(" x равно четырём");
            else System.out.println("Значение вне диапазона 1-4");

        }
    }
}
