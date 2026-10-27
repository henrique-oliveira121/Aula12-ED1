package Exercicio9;

import java.util.Arrays;
import java.util.List;

public class Exercicio9 {

    public static int somarLista(List<Integer> lista, int indice) {
        if (indice == lista.size()) {
            return 0;
        }
        return lista.get(indice) + somarLista(lista, indice + 1);
    }

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4);
        int resultado = somarLista(numeros, 0);
        System.out.println("A soma dos elementos é: " + resultado);
    }
}