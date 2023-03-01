package Classes.easy;

public class Main {
    public static void main(String[] args) {

        Book book1 = new Book("A NEW EARTH", new Author("ECKHART", "TOLLE"),
                2005);

        Book book2 = new Book("Тысячеликий герой", new Author("Джозеф", "Кэмпбелл"),
                2018);

        System.out.println("Year of publication is " + book1.getYearOfPublication());

        book1.setYearOfPublication(2008);

        System.out.println("Book title is: " + book1.getTitle() + ", " +
                book1.getAuthorName() + " , year of publication is " + book1.getYearOfPublication());
        System.out.println("Book title is: " + book2.getTitle() + ", " +
                book2.getAuthorName() + " , year of publication is " + book2.getYearOfPublication());


    }
}