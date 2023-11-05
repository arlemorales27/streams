package map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ExampleMap {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Jhon", "Juan Camilo", "Valeria");

// Convert all the names to uppercase.
        List<String> uppercaseNames = names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

// Print the uppercase names.
        System.out.println(uppercaseNames);
    }
}
