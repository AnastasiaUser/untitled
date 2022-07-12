package PackInterface.separate;

import PackInterface.Book;
import PackInterface.Journal;

public class UseBook {
    public static void main(String[] args) {
        Book book[] = new Journal[5];


        book[0] = new Journal("Story of my life", "London", 1930);
        book[1] = new Book("Story of my war", "The", 1940);
        book[2] = new Book("Story of my peace", "Paris", 1960);
        book[3] = new Book("Not my life", "ABC", 1111);
        book[4] = new Book("Story of my little pony", "Switzerland", 5555);

        System.out.println(book[0].number1 + "it is public and it is access");
        System.out.println();





    }
}
