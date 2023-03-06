package Objects_Methods.easy;

import java.util.Objects;

public class Book {
    final private String title;
    final private Author authorName;
    private int yearOfPublication;

    public Book(String title, Author authorName, int yearOfPublication) {
        this.title = title;
        this.authorName = authorName;
        this.yearOfPublication = yearOfPublication;
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthorName() {
        return authorName;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    @Override
    public String toString() {
        return "Book " +
                "title= " + title + '\'' +
                ", authorName=" + authorName +
                ", yearOfPublication=" + yearOfPublication +
                '}';
    }

    //toString книги не должен дублировать код из toString автора, а должен делегировать (вызывать) его версию метода
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearOfPublication == book.yearOfPublication && Objects.equals(title, book.title) && Objects.equals(authorName, book.authorName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, authorName, yearOfPublication);
    }
}
