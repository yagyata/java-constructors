public class Circle {
    private double radius;

    //Default constructor
    public Circle() {
        this(2.0); //Calls parameterized constructor with default radius 2.0
    }

    //Parameterized constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    //Getter for radius
    public double getRadius() {
        return radius;
    }

    //Setter for radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    //Calculate area
    public double calculateArea(){
        return Math.PI * radius * radius;
    }

    public void displayDetails(){
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + calculateArea());
    }

    public static void main(String[] args){
        //using default constructor
        Circle circle1 = new Circle();
        circle1.displayDetails();
        System.out.println();
        //using parameterized constructor
        Circle circle2 = new Circle(4.2);
        circle1.displayDetails();
    }
}

/*
Radius: 2.0
Area: 12.566370614359172

Radius: 2.0
Area: 12.566370614359172
*/