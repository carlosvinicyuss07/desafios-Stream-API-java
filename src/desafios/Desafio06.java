package desafios;

import java.util.Arrays;
import java.util.List;

public class Desafio06 {

    // Desafio 6 - Verificar se a lista contém algum número maior que 10:

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        if (numeros.stream().anyMatch(n -> n > 10)) {
            System.out.println("A lista contém pelo menos 1 número maior que 10");
        } else {
            System.out.println("Não há nenhum número maior que 10 na lista");
        }

    }
}
