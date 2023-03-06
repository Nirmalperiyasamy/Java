package Generic;

public class Example {
    public static void main(String[] args) {
        name("Nirmal");
        name(55);
        name(95.8);
    }

    private static <T> void name(T validName) {
        System.out.println(validName);
    }
}
