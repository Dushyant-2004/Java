public class Constructors {

    /*
     * CONSTRUCTOR:
     * A constructor is a special method in Java that is automatically
     * called when an object of a class is created.
     *
     * FEATURES:
     * 1. Constructor name must be same as class name.
     * 2. Constructor has no return type, not even void.
     * 3. Constructor is automatically called when an object is created.
     * 4. Constructor is mainly used to initialize objects.
     * 5. A class can have multiple constructors.
     *
     * TYPES:
     * 1. Default Constructor
     * 2. Parameterized Constructor
     * 3. Copy Constructor
     * 4. Constructor Overloading
     */

    String name;
    int age;
    String course;

    // 1. DEFAULT / NO-ARGUMENT CONSTRUCTOR
    // A constructor without parameters.
    // Used to initialize an object with default values.

    Constructors() {
        name = "Unknown";
        age = 0;
        course = "Not Assigned";
    }


    // 2. PARAMETERIZED CONSTRUCTOR
    // A constructor that accepts parameters.
    // Used to initialize objects with specific values.

    Constructors(String name, int age, String course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }


    // 3. COPY CONSTRUCTOR
    // Java does not provide a built-in copy constructor.
    // We create it manually to copy one object's values into another.

    Constructors(Constructors obj) {
        this.name = obj.name;
        this.age = obj.age;
        this.course = obj.course;
    }


    // METHOD TO DISPLAY OBJECT DATA

    void display() {
        System.out.println("Name   : " + name);
        System.out.println("Age    : " + age);
        System.out.println("Course : " + course);
        System.out.println();
    }


    // CONSTRUCTOR OVERLOADING
    // Multiple constructors with different parameter lists
    // are called constructor overloading.

    Constructors(String name) {
        this.name = name;
        this.age = 0;
        this.course = "Not Assigned";
    }

    Constructors(String name, int age) {
        this.name = name;
        this.age = age;
        this.course = "Not Assigned";
    }


    public static void main(String[] args) {

        // DEFAULT CONSTRUCTOR

        Constructors student1 = new Constructors();

        System.out.println("DEFAULT CONSTRUCTOR");
        student1.display();


        // PARAMETERIZED CONSTRUCTOR

        Constructors student2 =
                new Constructors("Dushyant", 21, "B.Tech");

        System.out.println("PARAMETERIZED CONSTRUCTOR");
        student2.display();


        // COPY CONSTRUCTOR

        Constructors student3 =
                new Constructors(student2);

        System.out.println("COPY CONSTRUCTOR");
        student3.display();


        // CONSTRUCTOR OVERLOADING

        Constructors student4 =
                new Constructors("Rahul");

        Constructors student5 =
                new Constructors("Aman", 22);

        System.out.println("CONSTRUCTOR OVERLOADING");

        student4.display();
        student5.display();


        // THIS KEYWORD IN CONSTRUCTOR
        // this.name refers to the instance variable.
        // name refers to the constructor parameter.

        Constructors student6 =
                new Constructors("Manish", 23, "BCA");

        System.out.println("USING THIS KEYWORD");
        student6.display();
    }
}