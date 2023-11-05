package map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class exampleMap3 {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(new Person(1, "Maria", 2000.0), new Person(2, "Juan", 1200.0));
        List<String> names = people.stream()
                .map(person -> person.getName().toUpperCase())
                .collect(Collectors.toList());
        System.out.println(names);
    }
}
