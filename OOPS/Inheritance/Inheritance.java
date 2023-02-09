package OOPS.Inheritance;
class Animal {
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    public void makeSound() {
        System.out.println("Dog barks");
    }

}
public class Inheritance {
        public static void main(String[] args) {
            Animal animal = new Animal();
            animal.makeSound();  // outputs "Animal makes a sound"

            Dog dog = new Dog();
            dog.makeSound();  // outputs "Dog barks"

            Animal dogAsAnimal = new Dog();
            dogAsAnimal.makeSound();  // outputs "Dog barks"
        }
    }

