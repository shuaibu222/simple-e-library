import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Library implements LibraryInterface {
    String id;
    String name;
    List<Book> libraryDB = new ArrayList<>(); // Database

    Library(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public void getId(){
        System.out.println("Library ID: " + id);
    }

    public void getName(){
        System.out.println("Library name: " + name);
    };

    public Book addBook(String name, String author){

        //  create a new book instance
        Book book = new Book(UUID.randomUUID().toString(), name, author);

        // hashMap to store book in key/value pairs
        Map<String, String> bookMap = new HashMap<>();

        bookMap.put("ID", book.id);
        bookMap.put("name", name);
        bookMap.put(" author", author);

        // storing in the library DB
        libraryDB.add(book);

        return book;
    }

    public List<Book> getLibrary() {
        return libraryDB;
    }

}
