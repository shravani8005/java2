// Parent class
class Animal {
    Animal() {
        System.out.println("Animal constructor called");
    }
}

// Child class
class Dog extends Animal {
    Dog() {
        super(); // Calls the constructor of Animal
        System.out.println("Dog constructor called");
    }
}

// Main class to run the program


public class InheritanceDemo {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
    }
}