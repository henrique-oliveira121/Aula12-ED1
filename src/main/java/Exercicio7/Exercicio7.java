package Exercicio7;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Exercicio7 {
    public static void main(String[] args) {
        Queue<Integer> fila = new LinkedList<>();
        Stack<Integer> pilhaAuxiliar = new Stack<>();

        for (int i = 1; i <= 20; i++) {
            fila.add(i);
        }

        System.out.println("Fila original: " + fila);

        while (!fila.isEmpty()) {
            pilhaAuxiliar.push(fila.poll());
        }

        while (!pilhaAuxiliar.isEmpty()) {
            fila.add(pilhaAuxiliar.pop());
        }

        System.out.println("Fila invertida: " + fila);
    }
}
