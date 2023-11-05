package filter;

import java.util.Arrays;
import java.util.List;

public class ExampleFilter4 {
    public static void main(String[] args) {
        List<Empleado> lista = Arrays.asList(
                new Empleado(1, "Jose", 5200, "Desarrollador"),
                new Empleado(2, "Zharith", 4800, "Diseñador"),
                new Empleado(3, "Jose", 4000, "Desarrollador")
        );

        List<Empleado> eSalarios = lista.stream()
                .filter(e -> e.getSalario() > 4500)
                .toList();
        eSalarios.forEach(p -> System.out.println(p.getNombre() + " " + p.getSalario()));

    }
}
