package Generic;

public class GenericMethodTest {
    public static <E> void printArray(E[] input) {
        for (E element : input) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4};
        Character[] charArray = {'H', 'E', 'L', 'L', 'O'};

        System.out.println("Array integerArray contains:");
        printArray(intArray);

        System.out.println("Array doubleArray contains:");
        printArray(doubleArray);

        System.out.println("Array characterArray contains:");
        printArray(charArray);
    }
}
