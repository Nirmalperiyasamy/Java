package Generic;

public class IntegerPrinter {
    public static void main(String[] args) {
        Printer<Integer> printing=new Printer<>(46,56);
        printing.print();
        Printer<Double> doublePrinter=new Printer<>(8.999, 56.9);
        doublePrinter.print();
    }
}
