package desafios;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Desafio14 {

    public static void main(String[] args) {

        // Desafio 14 - Encontre o maior número primo da lista:

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Optional<Integer> maiorPrimo = numeros.stream()
                .distinct()
                .filter(Desafio14::isPrimo)
                .max(Comparator.naturalOrder());

        maiorPrimo.ifPresentOrElse(
                n -> System.out.println("Maior número primo: " + n),
                () -> System.out.println("Nenhum número primo encontrado na lista")
        );
    }

    public static boolean isPrimo(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
