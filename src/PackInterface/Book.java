package PackInterface;

import java.util.Scanner;

public class Book {
    private String title;
    private String author;
    private int pubDate;

    public int number1;
    int number2;
    protected int number3;
    int number4;

    public Book(String t, String a, int pD){
        title = t;
        author = a;
        pubDate = pD;

        number1 = 1;
        number1 = 2;
        number1 = 3;
        number1 = 4;

    }

    public void showPublic(){
        System.out.println(title);
        System.out.println(author);
        System.out.println(pubDate);
        System.out.println();
    }
    public void showDefault(){
        System.out.println(title);
        System.out.println(author);
        System.out.println(pubDate);
        System.out.println();
    }
    public void showProtected(){
        System.out.println(title);
        System.out.println(author);
        System.out.println(pubDate);
        System.out.println();
        showPrivate();
    }
    public void showPrivate(){
        System.out.println(title);
        System.out.println(author);
        System.out.println(pubDate);
        System.out.println();
    }
}
