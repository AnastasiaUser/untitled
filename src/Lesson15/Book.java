package Lesson15;

import java.time.Year;
import java.util.Objects;

public class Book {
   private int numPages;
    private String author;
    private String name;
    private short yearOfPublication;
    private String publishingHouse;
    private boolean isTranslated;

    enum Genre{
        DETECTIVE,
        SCIENCE,
        FANTASTIC,
        ROMANCE,
        HORROR,
        CLASSIC,
        HISTORICAL
    };
    Book(String name){
        this. name = name;
    }
    Book(String author,String name) {
        this.author = author;
        this.name = name;
    }
    Book(String author,String name,short yearOfPublication) {
        this.author = author;
        this.name = name;
        this.yearOfPublication = yearOfPublication;
    }
    public int getAge(){
        return (Year.now().getValue() - (int)yearOfPublication);
    }

    public int getNumPages() {
        return numPages;
    }

    public void setNumPages(int numPages) {
        this.numPages = numPages;
    }

    public short getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(short yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    public boolean isTranslated() {
        return isTranslated;
    }

    public void setTranslated(boolean translated) {
        isTranslated = translated;
    }
    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return Objects.equals(author, book.author) && name.equals(book.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, name);
    }

    @Override
    public String toString() {
        return "Book{" +
                "numPages=" + numPages +
                ", author='" + author + '\'' +
                ", name='" + name + '\'' +
                ", yearOfPublication=" + yearOfPublication +
                ", publishingHouse='" + publishingHouse + '\'' +
                ", isTranslated=" + isTranslated +
                '}' + "\n";
    }

}
