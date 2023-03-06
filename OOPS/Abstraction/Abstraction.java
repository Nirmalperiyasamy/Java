package OOPS.Abstraction;
abstract class Shape {
    abstract void draw();
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing Circle");
    }
}

public class Abstraction {

    public static void main(String[] args) {
        Circle person =new Circle();
        person.draw();
    }
}
