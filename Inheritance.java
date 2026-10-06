// Parent class
class Animal {

    // Parent class method
    void eat() {
        System.out.println("Animal is eating");
    }

    void sleep() {
        System.out.println("Animal is sleeping");
    }
}

// Child class inherits Animal
class Dog extends Animal {

    // Child class method
    void bark() {
        System.out.println("Dog is barking");
    }
}

// Main class
public class Inheritance {

    public static void main(String[] args) {

        // Creating object of Dog class
        Dog d = new Dog();

        // Calling method of Parent class
        d.eat();

        // Calling another Parent class method
        d.sleep();

        // Calling method of Child class
        d.bark();
    }
}