package sorted;

import filter.Empleado;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Ejemplo3 {
    public static void main(String[] args) {
        List<Empleado> lista3 = Arrays.asList(
                new Empleado(3, "Jose", 5200, "Desarrollador"),
                new Empleado(5, "Zharith", 4800, "Diseñador"),
                new Empleado(6, "Ana", 4000, "Desarrollador"),
                new Empleado(6, "Luis", 3000, "Desarrollador")
        );

        List<Empleado> eSalarios = lista3.stream()
                .filter(e -> e.getSalario() > 3500 && e.getCargo().equals("Desarrollador"))
                .sorted(Comparator.comparing(Empleado::getNombre))
                .toList();
        eSalarios.forEach(p -> System.out.println(p.getNombre() + " " + p.getSalario()));

    }
}

