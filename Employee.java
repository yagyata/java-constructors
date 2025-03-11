// Parent class EmployeeBase
class EmployeeBase {
    public int employeeID;
    protected String department;
    private double salary;

    // Constructor
    public EmployeeBase(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    // Getter for salary
    public double getSalary() {
        return salary;
    }

    // Setter for salary (Ensuring salary is not negative)
    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        } else {
            System.out.println("Invalid salary! Cannot be negative.");
        }
    }

    // Display employee details
    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: $" + salary);
    }
}

// Subclass Manager extends EmployeeBase
class Manager extends EmployeeBase {
    private String teamName; // Additional property for Manager

    // Constructor
    public Manager(int employeeID, String department, double salary, String teamName) {
        super(employeeID, department, salary);
        this.teamName = teamName;
    }

    // Display manager details
    public void displayManagerDetails() {
        System.out.println("Manager Details:");
        System.out.println("Employee ID: " + employeeID);  // Accessible (public)
        System.out.println("Department: " + department);   // Accessible (protected)
        System.out.println("Salary: $" + getSalary());     // Accessed via getter
        System.out.println("Team: " + teamName);
    }
}

public class Employee {
    public static void main(String[] args) {
        EmployeeBase emp1 = new EmployeeBase(101, "Engineering", 75000.0);
        System.out.println("Employee Details:");
        emp1.displayEmployeeDetails();

        emp1.setSalary(80000.0);
        System.out.println("Updated Salary: $" + emp1.getSalary());

        System.out.println();

        Manager mgr1 = new Manager(201, "IT", 95000.0, "Software Development");
        mgr1.displayManagerDetails();
    }
}

/*
Employee Details:
Employee ID: 101
Department: Engineering
Salary: $75000.0
Updated Salary: $80000.0

Manager Details:
Employee ID: 201
Department: IT
Salary: $95000.0
Team: Software Development

 */
