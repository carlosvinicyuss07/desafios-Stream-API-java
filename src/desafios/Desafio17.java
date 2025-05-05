package desafios;

import java.util.Arrays;
import java.util.List;

public class Desafio17 {

    public static void main(String[] args) {

        // Desafio 17 - Filtrar os números primos da lista:

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> numerosPrimos =  numeros.stream()
                .filter(Desafio17::isPrimo)
                .toList();

        System.out.println("Números primos: " + numerosPrimos);
    }

    public static boolean isPrimo(int n) {
        return Desafio14.isPrimo(n);
    }
}
