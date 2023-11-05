package map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ExampleMap4 {
    public static void main(String[] args) {
        List<Person> lista = Arrays.asList(new Person(1, "Maria", 2000.0), new Person(2, "Juan", 1200.0));
        List<Double> incremento = lista.stream()
                .map(person -> person.getSalary() +(person.getSalary() * 0.02))
                .collect(Collectors.toList());
        System.out.println(incremento);
    }
}
