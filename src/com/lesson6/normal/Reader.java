package com.lesson6.normal;

public class Reader {

    public Reader(String name, int libaryCard, String faculty, int bornDate, long phoneNumber) {
        this.name = name;
        this.libaryCard = libaryCard;
        this.faculty = faculty;
        this.bornDate = bornDate;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLibaryCard() {
        return libaryCard;
    }

    public void setLibaryCard(int libaryCard) {
        this.libaryCard = libaryCard;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getBornDate() {
        return bornDate;
    }

    public void setBornDate(int bornDate) {
        this.bornDate = bornDate;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    private String name;
    private int libaryCard;
    private String faculty;
    private int bornDate;
    private long phoneNumber;

    public void takeBook(int books) {
        System.out.println(name + " взял " + books + " книги");
    }

    public void takeBook(String bookName) {
        System.out.println(name + " взял книгу" + bookName);
    }

    public void takeBook(Book book){
        System.out.println(name + " взял книгу " + book.getBookName() +   " автор - " + book.getBookAuthor());
    }

}
