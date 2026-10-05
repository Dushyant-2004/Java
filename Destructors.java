class Student {

    // Data members
    String name;
    int age;

    // Constructor
    // This is automatically called when an object is created
    Student(String name, int age) {

        this.name = name;
        this.age = age;

        System.out.println("Constructor called");
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
    }

    // Method to display student information
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    // Destructor-like method
    // Java does not have a real destructor.
    // finalize() was traditionally used before an object was removed
    // by the Garbage Collector.
    @Override
    protected void finalize() throws Throwable {

        System.out.println("Destructor-like method called");
        System.out.println("Object is being removed from memory");

        super.finalize();
    }

    public static void main(String[] args) {

        // Creating the first object
        Student s1 = new Student("Dushyant", 21);

        // Displaying information
        s1.display();

        System.out.println();

        // Creating the second object
        Student s2 = new Student("Rahul", 20);

        // Displaying information
        s2.display();

        System.out.println();

        // Making objects eligible for Garbage Collection
        s1 = null;
        s2 = null;

        // Requesting the Garbage Collector to run
        System.gc();

        System.out.println("End of program");
    }
}