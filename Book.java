public class Book {
    private String title;
    private String author;
    private double price;

    //Default Constructor
    public Book(){
        this.title = "Book's Title";
        this.author = "Author's Name";
        this.price = 0.0;
    }

    //Parameterized constructor
    public Book(String title, String author, double price){
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void displayBookInfo(){
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        Book book1 = new Book("Harry Potter","JK Rowlings", 1500);
        book1.displayBookInfo();
    }
}
