package Classes.easy;

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
        return "Book{" +
                "title='" + title + '\'' +
                ", authorName=" + authorName +
                ", yearOfPublication=" + yearOfPublication +
                '}';
    }


}
