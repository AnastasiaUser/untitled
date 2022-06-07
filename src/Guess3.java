import java.io.IOException;

public class Guess3 {

        public static void main(String[] args) throws IOException {

            char ch, answer = 'S';

            System.out.println("задумана буква из диапозона A-Z. ");
            System.out.println("Попытайтесь её угадать. ");

            ch = (char) System.in.read();

            if (ch == answer)  System.out.println(" Правильно! ");
            else  {
                System.out.println(" Извините, нужная буква находится ближе к ");
                if (ch < answer) System.out.println(" К концу алфивита ");
                else System.out.println(" К началу алфавита ");
            }

        }
    }


