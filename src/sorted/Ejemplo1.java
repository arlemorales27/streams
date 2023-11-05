package sorted;

import java.util.Arrays;
import java.util.List;

public class Ejemplo1 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 5, 3, 2, 4);

// Sort the numbers in ascending order.
        List<Integer> sortedNumbers = numbers.stream()
                .sorted()
                .toList();

// Print the sorted numbers.
        System.out.println(sortedNumbers);
    }
}
