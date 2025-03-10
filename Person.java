public class Person {
    private String name;
    private int age;

    //parameterized constructor
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    //copy constructor
    public Person(Person copyPerson){
        this.name = copyPerson.name;
        this.age = copyPerson.age;
    }

    public void displayDetails(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        Person person1 = new Person("Yagyata", 21);
        Person person2 = new Person(person1); //Creating a copy

        person1.displayDetails();
        System.out.println();
        person2.displayDetails();
    }
}
