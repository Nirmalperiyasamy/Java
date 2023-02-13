package OptionalExample;

import java.util.Optional;

public class OptioanlExample {
    public static void main(String[] args) {
        String value = null;
        Optional<String> optionalName1 = Optional.ofNullable(value);
        System.out.println("Name: " + optionalName1.orElse("Unknown"));

        Optional<String> optionalName = Optional.of("Nirmal");

        // 1. get method
        System.out.println("Name (get method): " + optionalName.get());

        // 2. orElse method
        String defaultName = "NirmalPeriyasamy";
        System.out.println("Name (orElse method): " + optionalName.orElse(defaultName));
        //System.out.println("Name (orElseGet method): " + optionalName.orElseGet(() -> defaultName));
        // 3. orElseGet method
        Optional<String> emptyOptional = Optional.empty();
        System.out.println("Name (orElseGet method): " + emptyOptional.orElseGet(() -> defaultName));

        // 4. orElseThrow method
        try {
            System.out.println("Name (orElseThrow method): " + emptyOptional.orElseThrow(IllegalArgumentException::new));
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e.getMessage());
        }

        // 5. isPresent method
        System.out.println("Is name present (isPresent method): " + optionalName.isPresent());
        System.out.println("Is name present (isPresent method): " + emptyOptional.isPresent());

        // 6. ifPresent method
        optionalName.ifPresent(name -> System.out.println("Name (ifPresent method): " + name));

        // 7. map method
        Optional<String> upperCaseName = optionalName.map(String::toUpperCase);
        System.out.println("Name (map method): " + upperCaseName.orElse(""));

        // 8. flatMap method
        Optional<String> flatMappedOptional = optionalName.flatMap(name -> Optional.of(name.toUpperCase()));
        System.out.println("Name (flatMap method): " + flatMappedOptional.orElse(""));

        // 9. filter method
        Optional<String> filteredOptional = optionalName.filter(name -> name.length() > 5);
        System.out.println("Name (filter method): " + filteredOptional.orElse("lesser length"));
    }
}


