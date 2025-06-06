package desafios;

import java.util.Arrays;
import java.util.List;

public class Desafio09 {

    // Desafio 9 - Verificar se todos os números da lista são distintos (não se repetem):

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        boolean todosDistintos = numeros.stream()
                .distinct()
                .count() == numeros.size();

        if (todosDistintos) {
            System.out.println("Todos os números são distintos");
        } else {
            System.out.println("Existem números duplicados na lista");
        }

    }
}
