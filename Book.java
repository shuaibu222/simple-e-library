public class Book implements LibraryInterface {

    String id;
    String name;
    String author;

    Book(String id, String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;
    }

    public void getId(){
        System.out.println("Book ID: " + id);
    }

    public void getName(){
        System.out.println("Book name: " + name);
    };

}
