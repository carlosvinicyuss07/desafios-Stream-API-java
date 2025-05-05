package desafios;

import java.util.Arrays;
import java.util.List;

public class Desafio08 {

    // Desafio 8 - Somar os dígitos de todos os números da lista:

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int somaDigitos = numeros.stream()
                .flatMapToInt(num -> String.valueOf(num).chars())
                .map(Character::getNumericValue)
                .sum();

        System.out.println("Soma dos dígitos: " + somaDigitos);

    }
}
