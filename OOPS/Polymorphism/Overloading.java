package OOPS.Polymorphism;
class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }
}

public class Overloading {
    public static void main(String[] args) {
       Calculator calculate =new Calculator();
        System.out.println(calculate.add(7,8));
        System.out.println(calculate.add(5.5,8.8));


    }
}
