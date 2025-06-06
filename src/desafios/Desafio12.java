package desafios;

import java.util.Arrays;
import java.util.List;

public class Desafio12 {

    // Desafio 12 - Encontre o produto de todos os números da lista:

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int produtoDosNumeros = numeros.stream()
                .reduce(1, (n1, n2) -> n1 * n2);

        System.out.println("Produto dos números: " + produtoDosNumeros);

    }
}
