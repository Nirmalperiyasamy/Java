package OOPS.Abstraction.Interface;

public interface Student {
    void draw();
}

class Circle implements Student {
    public void draw() {
        System.out.println("Drawing Circle");
    }
}

