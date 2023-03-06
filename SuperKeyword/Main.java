package SuperKeyword;

class Shape {
    int x, y;

    Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void display() {
        System.out.println("x: " + x + " y: " + y);
    }
}

class Rectangle extends Shape {
    int width, height;

    Rectangle(int x, int y, int width, int height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }

    void display() {
        super.display();
        System.out.println("width: " + width + " height: " + height);
    }
}

class Square extends Rectangle {
    Square(int x, int y, int side) {
        super(x, y, side, side);
    }

    void display() {
        super.display();
        System.out.println("I am a square");
    }
}

public class Main {
    public static void main(String[] args) {
        Square square = new Square(10, 20, 30);
        square.display();
        Rectangle rectangle =new Rectangle(4,5,40,50);
        rectangle.display();
    }
}



