class Student {
    public int rollNumber;
    protected String name;
    private double CGPA;

    // Constructor
    public Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    public double getCGPA() {
        return CGPA;
    }

    public void setCGPA(double newCGPA) {
        if (newCGPA >= 0.0 && newCGPA <= 10.0) {
            CGPA = newCGPA;
        } else {
            System.out.println("Invalid CGPA! Must be between 0.0 and 10.0");
        }
    }

    // Display student details
    public void displayStudent() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + CGPA);
    }
}

class PostgraduateStudent extends Student {
    // Constructor
    public PostgraduateStudent(int rollNumber, String name, double CGPA) {
        super(rollNumber, name, CGPA);
    }

    // Display postgraduate student details
    public void displayPostgraduateStudent() {
        System.out.println("Postgraduate Student Details:");
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + getCGPA());
    }
}

public class UniStudent {
    public static void main(String[] args) {
        Student s1 = new Student(241, "Nathan", 7.6);
        System.out.println("Student Details: ");
        s1.displayStudent();

        s1.setCGPA(9.2);
        System.out.println("Updated CGPA: " + s1.getCGPA());

        // Creating a PostgraduateStudent object
        PostgraduateStudent pgS1 = new PostgraduateStudent(242, "Chloe", 8.9);
        System.out.println();
        pgS1.displayPostgraduateStudent();
    }
}

/*
Student Details:
Roll Number: 241
Name: Nathan
CGPA: 7.6
Updated CGPA: 9.2

Postgraduate Student Details:
Roll Number: 242
Name: Chloe
CGPA: 8.9
*/