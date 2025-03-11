class Product {
    // Instance variables
    private String productName;
    private double price;

    // Class variable
    private static int totalProducts = 0;

    // Constructor
    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++; // Increment total products count when a new product is created
    }

    // Instance method to display product details
    public void displayProductDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + price);
    }

    // Class method to display total number of products created
    public static void displayTotalProducts() {
        System.out.println("Total Products Created: " + totalProducts);
    }

    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 50000.0);
        Product p2 = new Product("Smartphone", 7999.99);

        p1.displayProductDetails();
        System.out.println();
        p2.displayProductDetails();
        System.out.println();

        Product.displayTotalProducts();
    }
}

/*
Product Name: Laptop
Price: 50000.0

Product Name: Smartphone
Price: 7999.99

Total Products Created: 2
*/
