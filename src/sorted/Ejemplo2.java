package sorted;

import java.util.Arrays;
import java.util.List;

public class Ejemplo2 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 5, 3, 2, 4, 8, 25, 12);

// Sort the numbers in ascending order.
        List<Integer> sortedNumbers = numbers.stream()
                .filter(n -> n > 10)
                .sorted()
                .toList();
// Print the sorted numbers.
        System.out.println(sortedNumbers);
    }
}
