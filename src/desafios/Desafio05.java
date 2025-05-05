package desafios;

import java.util.Arrays;
import java.util.List;
import java.util.function.ToIntFunction;

public class Desafio05 {

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        numeros.stream()
                .filter(n -> n> 5)
                .mapToInt(Integer::intValue)
                .average().
                ifPresent(System.out::println);

    }
}
