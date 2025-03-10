public class LibraryBook {
    private String title;
    private String author;
    private int price;
    private boolean availability;

    public LibraryBook(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.availability = true; //By default
    }

    public void borrowBook(){
        if(availability){
            availability = false;
            System.out.println("You have successfully borrowed the book");
        } else {
            System.out.println("Sorry, this book is currently unavailable");
        }
    }
    // Method to display book details
    public void displayBookInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
        System.out.println("Availability: " + (availability ? "Is available" : "Not Available"));
    }

    public static void main(String[] args) {
        LibraryBook book1 = new LibraryBook("Pride and Prejudice", "Jane Austen", 600);
        book1.displayBookInfo();
        book1.borrowBook();

        System.out.println();

        book1.displayBookInfo();
        book1.borrowBook(); // Attempting to borrow again
    }

}

/*
Title: Pride and Prejudice
Author: Jane Austen
Price: $600
Availability: Is available
You have successfully borrowed the book

Title: Pride and Prejudice
Author: Jane Austen
Price: $600
Availability: Not Available
*/