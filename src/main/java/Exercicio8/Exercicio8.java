package Exercicio8;

import java.util.Random;

public class Exercicio8 {
    public static void main(String[] args) {
        TestaPilha gerenciadorPilhas = new TestaPilha();
        Random random = new Random();

        for (int i = 0; i < 1000; i++) {
            int numero = random.nextInt(201) - 100;

            gerenciadorPilhas.processarNumero(numero);
        }

        System.out.println("\nFim das operações.");
        System.out.println("Elementos restantes na Pilha P: " + gerenciadorPilhas.tamanhoP());
        System.out.println("Elementos restantes na Pilha N: " + gerenciadorPilhas.tamanhoN());
    }
}