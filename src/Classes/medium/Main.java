package Classes.medium;

public class Main {


    public static boolean addBook(Book[] book, Book newBook) {
        for (int i = 0; i < book.length; i++) {
            if (book[i] == null) {
                book[i] = newBook;
                return true;
            }
        }
        return false;
    }

    public static void print(Book book) {
        System.out.println(book.getAuthor().getFirstName() + " " + book.getAuthor().getLastName() + ": " +
                book.getTitle() + ": " + book.getYearOfPublication());

    }

    public static void printBook(Book[] books) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null) {
                print(books[i]);
            }
        }
    }


    public static void main(String[] args) {
        Book[] books = new Book[5];
        addBook(books, new Book(new Author("Eckhart", "Tolle"), "A New Earth",
                2005));
        addBook(books, new Book(new Author("Джозеф", "Кэмпбелл"), "Тысячеликий герой",
                2018));

        printBook(books);


    }


}