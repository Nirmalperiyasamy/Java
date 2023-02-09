package Stream;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


public class Stream {

            public static void main(String[] args) {
                int[] values = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
                Arrays.stream(values)
                        .filter(n -> n % 2 == 0)
                        .forEach(System.out::println);

                List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

                // Filter even numbers
                List<Integer> evenNumbers = numbers.stream()
                        .filter(n -> n % 2 == 0)
                        .collect(Collectors.toList());
                System.out.println("Even numbers: " + evenNumbers);

                // Map numbers to their squares
                List<Integer> squares = numbers.stream()
                        .map(n -> n * n)
                        .collect(Collectors.toList());
                System.out.println("Squared numbers: " + squares);

                // Find the sum of the squares of even numbers
                int sum = numbers.stream()
                        .filter(n -> n % 2 == 0)
                        .mapToInt(n -> n * n)
                        .sum();
                System.out.println("Sum of squares of even numbers: " + sum);

                // Find the max number
                Optional<Integer> max = numbers.stream().max(Integer::compareTo);
                System.out.println("Max number: " + max.orElse(0));

                // Count even numbers
                long count = numbers.stream()
                        .filter(n -> n % 2 == 0)
                        .count();
                System.out.println("Count of even numbers: " + count);

                // Check if all numbers are odd
                boolean allOdd = numbers.stream()
                        .allMatch(n -> n % 2 != 0);
                System.out.println("Are all numbers odd? " + allOdd);

                // Check if there is at least one even number
                boolean anyEven = numbers.stream()
                        .anyMatch(n -> n % 2 == 0);
                System.out.println("Is there at least one even number? " + anyEven);
            }
        }




