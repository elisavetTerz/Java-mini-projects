package gr.aueb.cf.ch17;

public class Book {
    private final long id;
    private final String isbn;
    private final String author;
    private final String title;

    public static class Builder {

        // Required Parameters
        private final long id;
        private final String isbn;

        // Optional parameters - initialized to default values
        private String author = "";
        private String title = "";


        /**
         * Builder Constructor populates the required fields:
         * @param id , book's {Book}
         * @param isbn, {Book}
         */
        public Builder (long id, String isbn) {
            this.id = id;
            this.isbn = isbn;
        }
        // three special setters which return this
        public Builder author(String author) {
            this.author = author;
            return this;
        }

        public Builder title(String title) {
            this.title = title;
            return this;
        }

        public Book build() {
            return new Book(this);
        }
    }
    // Book's Constructor takes as parameter the builder instance
    private Book(Builder builder) {
        this.id = builder.id;
        this.isbn = builder.isbn;
        this.author = builder.author;
        this.title = builder.title;
    }

    public long getId() {
        return id;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", isbn='" + isbn + '\'' +
                ", author='" + author + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
