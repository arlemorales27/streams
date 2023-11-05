package filter;

import java.util.Arrays;
import java.util.List;

public class ExampleFilter5 {
    public static void main(String[] args) {
        List<Empleado> lista2 = Arrays.asList(
                new Empleado(3, "Jose", 5200, "Diseñador"),
                new Empleado(5, "Zharith", 4800, "Diseñador"),
                new Empleado(6, "Julian", 4000, "Desarrollador")
        );

        List<Empleado> eSalarios = lista2.stream()
                .filter(e -> e.getSalario() > 4500 && e.getNombre().startsWith("J"))
                .toList();
        eSalarios.forEach(p -> System.out.println(p.getNombre() + " " + p.getSalario()));
    }
}
