/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividade5;

/**
 *
 * @author lazar
 */

    import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.Random;
    public class Atividade5 {
    public static void main(String[] args) {
        Queue<Integer> filaF = new LinkedList<>();
        Stack<Integer> pilhaP = new Stack<>();
        Random random = new Random();

        for (int i = 0; i < 1000; i++) {
            int numeroSorteado = random.nextInt(5000); 

            if (filaF.contains(numeroSorteado)) {
                pilhaP.push(numeroSorteado);
            } else {
                filaF.offer(numeroSorteado);
            }
        }

        System.out.println("Fila f (Tamanho: " + filaF.size() + ")");
        System.out.println(filaF);

        System.out.println("pilja p (Tamanho: " + pilhaP.size() + ")");
        System.out.println(pilhaP);
    }
}
    

