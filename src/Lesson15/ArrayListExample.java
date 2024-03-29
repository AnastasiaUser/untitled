package Lesson15;

import java.util.*;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Book> library = new ArrayList<>();

        Book a = new Book("Walter Scott", "Ivanhoe",(short) 1900);
        Book b = new Book("Charles Dickens", "Oliver Twist",(short) 1987);
        Book c = new Book("Arthur Conan Doyle", "Sherlock Holmes",(short) 1930);
        Book d = new Book("Edgar Allan Poe", "Golden bug",(short) 1879);
        Book e = new Book("Lev Tolstoy", "War and peace",(short) 1900);
        Book e1 = new Book("Lev Tolstoy", "War and peace",(short) 2012);
        Book f = new Book("Defo", "Gulliver's voyage");

        List<Book> list = Arrays.asList(a,b,c,d,e,f);
        Book[] bookArr = new Book[]{b, c, d, e, f};

        library.addAll(list);
        library.add(b);
        System.out.println("What is on the 1st place in the library(index 0)? " + library.get(0));
        System.out.println("What is on the size of the library?" + library.size());
        library.remove(0);
        library.remove(b);

        System.out.println("Does library contain object a of type Book? " + library.contains(a));
        System.out.println("Does library contain object list of type List?" + library.contains(list));
        System.out.println("What is on the size of the library?" + library.size());

        System.out.println("Before sorting");
        System.out.println(library);

//        Comparator <Book> authorComparator = Comparator.comparing(Book::getAuthor);
//        library.sort(authorComparator);
//
//        Comparator <Book> nameComparator = Comparator.comparing(Book::getName);
//        library.sort(nameComparator);
//
//        Comparator <Book> ageComparator = Comparator.comparing(Book::getAge);
//        library.sort(ageComparator);
//
//        Collections.sort(library, Comparator.comparingInt(Book::getAge).reversed());
//
//        System.out.println("After sorting");
//        System.out.println(library);
//
//        System.out.println(e.equals(e1));

        Iterator<Book> it = library.iterator();
        Iterator<Book> it1 = library.iterator();
        Iterator<Book> it2 = library.iterator();

        while (it.hasNext()){
            it.next().setNumPages(100);
            System.out.println(it.next());
        }
//        while (it1.hasNext()){
//            System.out.println(it1.next());
//        }
//
        library.add(a);
        library.add(b);

        System.out.println("added books");
        System.out.println(library);

//        while (it2.hasNext()){
//            Book i = it2.next();
//            if (i.getNumPages() < 10){
//                it2.remove();
//            }
//        } throws exception!!

        for (Iterator<Book> i = library.iterator(); it.hasNext();){
            Book book = i.next();
            if (book.getNumPages() < 10){
                i.remove();
            }
        }
        System.out.println("removed books with pages less than 10");
        System.out.println();

    }
}
