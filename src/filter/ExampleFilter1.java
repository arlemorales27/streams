package filter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ExampleFilter1 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Mary", "Alice", "Andrea");

// Filter the names to only include those that start with the letter "A".
        List<String> filteredNames = names.stream()
                .filter(name -> name.startsWith("A"))
                .collect(Collectors.toList());

// Print the filtered names.
        System.out.println(filteredNames);
    }
}
