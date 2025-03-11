class LibraryBook {
    public String ISBN;
    protected String title;
    private String author;

    // Constructor
    public LibraryBook(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    // Getter for author (public method to access private member)
    public String getAuthor() {
        return author;
    }

    // Setter for author (public method to modify private member)
    public void setAuthor(String author) {
        this.author = author;
    }

    // Display book details
    public void displayBook() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

// Subclass EBook extends Book
class EBook extends LibraryBook {
    private double fileSize; // Size in MB

    // Constructor
    public EBook(String ISBN, String title, String author, double fileSize) {
        super(ISBN, title, author);
        this.fileSize = fileSize;
    }

    // Display eBook details
    public void displayEBook() {
        System.out.println("EBook Details:");
        System.out.println("ISBN: " + ISBN);    // Accessible (public)
        System.out.println("Title: " + title);  // Accessible (protected)
        // Author is private in Book, so we use getAuthor()
        System.out.println("Author: " + getAuthor());
        System.out.println("File Size: " + fileSize + " MB");
    }
}

// Main class
public class Book {
    public static void main(String[] args) {
        // Creating Book object
        LibraryBook book1 = new LibraryBook("978-0135166307", "Effective Java", "Joshua Bloch");
        System.out.println("Book Details:");
        book1.displayBook();

        // Updating author name using setter
        book1.setAuthor("J. Bloch");
        System.out.println("Updated Author: " + book1.getAuthor());

        System.out.println();

        // Creating EBook object
        EBook ebook1 = new EBook("978-0135166307", "Effective Java", "Joshua Bloch", 5.2);
        ebook1.displayEBook();
    }
}

/*
Book Details:
ISBN: 978-0135166307
Title: Effective Java
Author: Joshua Bloch
Updated Author: J. Bloch

EBook Details:
ISBN: 978-0135166307
Title: Effective Java
Author: Joshua Bloch
 */
