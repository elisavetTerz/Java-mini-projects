package gr.aueb.cf.ch16.marker;

public class Book implements Item {
    private int id;
    private String isbn;
    private String author;
    private String title;

    public Book() {

    }

    public Book(int id, String isbn, String author, String title) {
        this.id = id;
        this.isbn = isbn;
        this.author = author;
        this.title = title;
    }
}
