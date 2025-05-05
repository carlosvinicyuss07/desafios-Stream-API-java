package desafios;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Desafio13 {

    public static void main(String[] args) {

        // Desafio 13 - Filtrar os números que estão dentro de um intervalo:

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        Scanner scan = new Scanner(System.in);

        System.out.println("*** LISTA DE NÚMEROS ***");
        System.out.println("[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3]");
        System.out.print("Digite o número em que o intervalo inicia: ");
        int inicio = scan.nextInt();
        System.out.print("Digite o número final do intervalo:");
        int fim = scan.nextInt();

        numeros.stream()
                .distinct()
                .filter(n -> (n >= inicio && n <= fim)).
                forEach(System.out::println);

    }
}
