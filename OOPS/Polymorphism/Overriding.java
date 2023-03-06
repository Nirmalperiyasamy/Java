package OOPS.Polymorphism;
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
public class Overriding {
    public static void main(String[] args) {
        Animal sound =new Dog();
        sound.makeSound(); // output =>Dog barks
        Dog bark=new Dog();
        bark.makeSound();  // output =>Dog barks
    }
}
