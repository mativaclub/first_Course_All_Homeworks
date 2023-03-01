package Classes.hard;

public class Main {

    public static void main(String[] args) {
        Library library = new Library(5);
        library.addBook(new Book(new Author("Eckhart", "Tolle"), "A New Earth",
                2005));
        library.addBook(new Book(new Author("Джозеф", "Кэмпбелл"), "Тысячеликий герой",
                2018));

        library.printBook(library.getBooks());


    }


}