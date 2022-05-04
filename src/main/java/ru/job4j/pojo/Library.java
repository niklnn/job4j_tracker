package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book geography = new Book("Geography", 200);
        Book biology = new Book("Biology", 300);
        Book cleanCode = new Book("Clean code", 350);
        Book chemistry = new Book("Chemistry", 250);
        Book[] books = new Book[4];
        books[0] = geography;
        books[1] = biology;
        books[2] = cleanCode;
        books[3] = chemistry;
        System.out.println("Book list:");
        for (int i = 0; i < books.length; i++) {
            Book book = books[i];
            System.out.println("Position : " + i + ", name: " + book.getName() + ", pages: " + book.getCount());
        }
        System.out.println("Change book position 0 to book position 3");
        Book temp = books[0];
        books[0] = books[3];
        books[3] = temp;
        for (int i = 0; i < books.length; i++) {
            Book book = books[i];
            System.out.println("Position : " + i + ", name: " + book.getName() + ", pages: " + book.getCount());
        }
        System.out.println("Book called Clean code");
        for (int i = 0; i < books.length; i++) {
            Book book = books[i];
            if (book.getName().equals("Clean code")) {
                System.out.println("Position : " + i + ", name: " + book.getName() + ", pages: " + book.getCount());
            }
        }
    }
}