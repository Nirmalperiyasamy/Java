package workout;

import java.util.InputMismatchException;
import java.util.Scanner;
public class workout {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            while (true) {
                System.out.print("Enter an integer: ");
                try {
                    int intValue = scanner.nextInt();
                    System.out.println("You entered: " + intValue);
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input. Please enter an integer.");
                    scanner.nextLine();
                }
              //  System.out.println("mingks");
            }
            System.out.println("fhg");
        }
    }


