package Exercicio8;

import java.util.Stack;

public class TestaPilha {
    private Stack<Integer> pilhaP;
    private Stack<Integer> pilhaN;

    public TestaPilha() {
        pilhaP = new Stack<>();
        pilhaN = new Stack<>();
    }

    public void processarNumero(int numero) {
        if (numero > 0) {
            pilhaP.push(numero);
        } else if (numero < 0) {
            pilhaN.push(numero);
        } else {
            System.out.print("Número sorteado: 0. ");

            if (!pilhaP.isEmpty()) {
                System.out.print("Retirado de P: " + pilhaP.pop() + " ");
            } else {
                System.out.print("Pilha P vazia. ");
            }

            if (!pilhaN.isEmpty()) {
                System.out.print("Retirado de N: " + pilhaN.pop());
            } else {
                System.out.print("Pilha N vazia.");
            }
            System.out.println();
        }
    }

    public int tamanhoP() {
        return pilhaP.size();
    }

    public int tamanhoN() {
        return pilhaN.size();
    }
}