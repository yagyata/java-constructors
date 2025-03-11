class Course {
    // Instance variables
    private String courseName;
    private int duration;
    private double fee;

    // Class variable (shared among all instances)
    private static String instituteName = "Chandigarh University";

    // Constructor
    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    // Instance method to display course details
    public void displayCourseDetails() {
        System.out.println("Institute: " + instituteName);
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " months");
        System.out.println("Fee: " + fee);
        System.out.println();
    }

    // Class method to update the institute name
    public static void updateInstituteName(String newInstituteName) {
        instituteName = newInstituteName;
    }

    public static void main(String[] args) {
        Course c1 = new Course("Java Programming", 6, 500.0);
        Course c2 = new Course("Data Science", 12, 1200.0);

        // Display course details before updating institute name
        c1.displayCourseDetails();
        c2.displayCourseDetails();

        // Update institute name
        Course.updateInstituteName("Chitkara University");

        // Display course details after updating institute name
        c1.displayCourseDetails();
        c2.displayCourseDetails();
    }
}

/*
Institute: Chandigarh University
Course Name: Java Programming
Duration: 6 months
Fee: 500.0

Institute: Chandigarh University
Course Name: Data Science
Duration: 12 months
Fee: 1200.0

Institute: Chitkara University
Course Name: Java Programming
Duration: 6 months
Fee: 500.0

Institute: Chitkara University
Course Name: Data Science
Duration: 12 months
Fee: 1200.0
*/