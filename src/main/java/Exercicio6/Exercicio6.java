package Exercicio6;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.ArrayList;
import java.util.List;

public class Exercicio6 {
    public static void main(String[] args) {
        Queue<Integer> fila = new LinkedList<>();
        Stack<Integer> pilha = new Stack<>();
        List<Integer> numeros = new ArrayList<>();

        for (int i = 1; i <= 1000; i++) {
            numeros.add(i);
            numeros.add(-i);
        }

        Collections.shuffle(numeros);
        fila.addAll(numeros);

        while (!fila.isEmpty()) {
            int numero = fila.poll();

            if (numero > 0) {
                pilha.push(numero);
            } else {
                if (!pilha.isEmpty()) {
                    int desempilhado = pilha.pop();
                    System.out.println("Número negativo no início (" + numero + "). Desempilhado: " + desempilhado);
                }
            }
        }
    }
}