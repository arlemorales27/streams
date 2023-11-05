package filter;

import java.util.Arrays;
import java.util.List;

public class exampleFilter3 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Maria Teresa", "Arle", "Robert", "Lian", "Ana");

        List<String> longNames = names.stream()
                .filter(n -> n.length() > 5)
                .toList();

      longNames.forEach(System.out::println);
    }
}
