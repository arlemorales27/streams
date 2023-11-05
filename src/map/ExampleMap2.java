package map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ExampleMap2 {
    public static void main(String[] args) {
        List<Integer> lista = Arrays.asList(2, 5, 8, 9);

        List<Integer> doble = lista.stream()
                .map(x -> x * x)
                .collect(Collectors.toList());

        System.out.println(doble);
    }
}
