import java.util.Scanner;
import java.util.UUID;

public class Main {
    public static void main(String[] args){
        // variables
        Scanner scanner = new Scanner(System.in);
        Library library = null;



        // library scanner
        System.out.println("\nWelcome to Personal Library App!");
        System.out.println("\n");
        System.out.print("Create your new personal library[y/n]: ");
        String yesOrNoLibraryScanner = scanner.next();
        if (yesOrNoLibraryScanner.equals("y")) {

            // logic for creating new instance of a library 

            System.out.print("Enter library name: ");
            String libName = scanner.next();
            
            // new instance of library 
            library = new Library(UUID.randomUUID().toString(), libName);
            System.out.printf( "\n%s's library is created!", library.name);

        } else {
            System.out.println("\nBye, Thanks for using our app!");
        }
        System.out.println("\n-------------------------------------\n");


        // book scanner
            System.out.print("Do you want to add new book to your Library? [y/n]: ");
            String yesOrNoBookScanner = scanner.next();
        if (yesOrNoBookScanner.equals("y")) {

            // logic for creating new instance of a book and adding it to the Library
            System.out.print("Book name: ");
            String bookName = scanner.next();
            System.out.print("Book author: ");
            String bookAuthor = scanner.next();

            //  add the book to the Library
            Book bookInShelf = library.addBook(bookName, bookAuthor);
            // Design the book with cover information
            System.out.println("\n#######################");
            System.out.println("#                     #");
            System.out.println("#                     #");
            System.out.println("#" + bookInShelf.name.toUpperCase() + "#");
            System.out.println("#                     #");
            System.out.println("#                     #");
            System.out.println("#                     #");
            System.out.println("#                     #");
            System.out.println("#                     #");
            System.out.println("#                     #");
            System.out.println("#" + bookInShelf.author + "#");
            System.out.println("#                     #");
            System.out.println("#                     #");
            System.out.println("#######################");
            System.out.printf( "\n%s book Added! to your Library\n", bookInShelf.name);

            System.out.println("\n########################\n");
            System.out.println(library.getLibrary().toString());
            System.out.println("\n########################");

        } else {
            System.out.println("\nBye, Thanks for using our app!");
        }
        
        System.out.println("\n-------------------------------------\n");

        scanner.close();
    }
}