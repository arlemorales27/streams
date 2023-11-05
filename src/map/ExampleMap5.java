package map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ExampleMap5 {
    public static void main(String[] args) {
        List<Person> lista = Arrays.asList(new Person(3, "David", 2000.0), new Person(2, "Ana", 5000.0));
        List<Person>  listatransform = lista.stream()
                .map(person -> {
                        person.setId(person.getId());
                        person.setName(person.getName().toUpperCase());
                        person.setSalary(person.getSalary()*2);
                        return  person;
                        }
                        )
                .collect(Collectors.toList());
        listatransform.forEach(person -> System.out.println(person.getId() + " "
                + person.getName() + " " + person.getSalary()));

    }
    }

