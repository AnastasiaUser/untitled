import java.util.Scanner;

public class LongestWorld {
    public static void main(String[] args) {

        System.out.println("Enter a sentence:");
        Scanner in = new Scanner(System.in);
        String sentence = in.nextLine();

        String[] words = sentence.split("^A-Za-z0-9");


        String longestWords = "";

        for (String word : words) {
            if (longestWords.length() < word.length()) longestWords = word;
        }

//        for (int i = 0; i < words.length; i++) {
//            if (longestWords.length() < (words[i].length())
//                longestWord = words[i];
//        }

        System.out.println("The longest word is: " + "longestWord");
    }
}
