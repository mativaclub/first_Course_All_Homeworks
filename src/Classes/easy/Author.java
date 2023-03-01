package Classes.easy;

public class Author {

    final private String authorName;
    final private String authorSurname;

    public Author(String authorName, String authorSurname) {
        this.authorName = authorName;
        this.authorSurname = authorSurname;
    }

    public String getAuthorName() {
        return authorName;
    }

    public String getAuthorSurname() {
        return authorSurname;
    }

    @Override
    public String toString() {
        return "Author name is: " + authorName + " " +
                ", author surname is: " + authorSurname;
    }


}
