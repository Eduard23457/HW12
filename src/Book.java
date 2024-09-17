import java.util.Objects;

public class Book {

    private String bookName;
    private Author author;
    private int bookAge;

    public Book(String bookName, Author author, int bookAge) {
        this.bookName = bookName;
        this.author = author;
        this.bookAge = bookAge;
    }

    public String getBookName() {
        return bookName;
    }

    public int getBookAge() {
        return bookAge;
    }

    public Author getAuthor() {
        return author;
    }

    public void setBookAge(int bookAge) {
        this.bookAge = bookAge;
    }
}
