package Classes.hard;

import java.util.Arrays;

public class Library {
    private final Book[] books;

    public Library(int size) {
        this.books = new Book[size];
    }

    public Book[] getBooks() {
        return books;
    }

    public boolean addBook(Book newBook) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = newBook;
                return true;
            }
        }
        return false;
    }

    public void print(Book book) {
        System.out.println(book.getTitle() + " by " + book.getAuthor().getFirstName() + " " +
                book.getAuthor().getLastName() + " was published in " + book.getYearOfPublication());

    }

    public void printBook(Book[] books) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null) {
                print(books[i]);
            }
        }
    }

    public void changePublishingYear(String bookName, int year) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null && books[i].getTitle().equals(bookName)) {
                books[i].setYearOfPublication(year);
            }
        }
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Library library = (Library) o;
        return Arrays.equals(books, library.books);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(books);
    }
}
