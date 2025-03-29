import java.util.List;

public class Storage {
    List <Book> books;

    public Storage(List<Book> books) {
        this.books = books;
    }

    public List<Book> getBooks() {
        return books;
    }


    @Override
    public String toString() {
        return "Storage{" +
                "books=" + books +
                '}';
    }
}
