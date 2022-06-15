import java.util.Scanner;

public class Language {
    public static void main(String[] args) {
        String English = "eng";
        String Russian = "ru";
        String Romanian = "ro";
        String Spanish = "esp";
        Scanner scan = new Scanner(System.in);

        System.out.println("Choose language (eng,ru,ro,esp): ");
        if (scan.hasNext("eng")) {
            System.out.println("Hello! ");
        }
        if (scan.hasNext("ru")) {
            System.out.println("Привет! ");
        }
        if (scan.hasNext("ro")) {
            System.out.println("Bună! ");
        }
        if (scan.hasNext("esp")) {
            System.out.println("Hola! ");
        }

        else{
                System.out.println("Выбраный язык отсутствует");

        }
        }
    }







