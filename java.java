// Write a Java program to create a class called Animal with a method called makeSound().
//Create a subclass called Cat that overrides the makeSound() method to bark.
class Animal {
    // Method to make sound
    void makeSound() {
        System.out.println("The animal makes a sound.");
    }
}

// Define the Cat class that inherits from Animal
class Cat extends Animal {
    // Override the makeSound method to produce a meow
    @Override
    void makeSound() {
        System.out.println("The cat meows.");
    }
}

// Main class to test the functionality
public class Main {
    public static void main(String[] args) {
        // Create an instance of Animal
        Animal myAnimal = new Animal();
        myAnimal.makeSound(); // Should print: The animal makes a sound.
        
        // Create an instance of Cat
        Cat myCat = new Cat();
        myCat.makeSound(); // Should print: The cat meows.
    }
}
