package Throws;
//                Throw	                                  Throws
//   Used within a method (or constructor)	   Used with method (or constructor) signature
//   Used to throw an exception explicitly	   Used to declare exceptions
//   Can only throw a single exception	       Can declare multiple exceptions
//   Followed by a throwable instance	       Followed by an exception class name
//   Cannot be used to propagate checked        Can be used to propagate checked exceptions by itself
//   exceptions by itself
public class Throws {
    static void checkAge(int age) throws ArithmeticException {
        if (age < 18) {
            throw new ArithmeticException("Access denied - You must be at least 18 years old.");
        } else {
            System.out.println("Access granted - You are old enough.");
        }
    }

    public static void main(String[] args) {
        try {
            checkAge(14);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e);
        }
    }

}