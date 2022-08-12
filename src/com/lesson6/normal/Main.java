package com.lesson6.normal;

public class Main {
    public static void main(String[] args) {
        Reader reader1 = new Reader("Ivan", 1234, "Java Enterprise", 1995, 123);
        Book book1 = new Book("Java developer", "SomeAuthor");

        reader1.takeBook(book1);
        reader1.takeBook(2);
    }
}
