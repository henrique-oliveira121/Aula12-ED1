/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividade4;

/**
 *
 * @author lazar
 */
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.Random;

public class Atividade4 {
    public static Queue<Integer> inverterFila(Queue<Integer> f1) {
        Stack<Integer> pilhaAuxiliar = new Stack<>();
        Queue<Integer> f2 = new LinkedList<>();

        while (!f1.isEmpty()) {
            pilhaAuxiliar.push(f1.poll());
        }

        while (!pilhaAuxiliar.isEmpty()) {
            f2.offer(pilhaAuxiliar.pop());
        }

        return f2;
    }

    public static void main(String[] args) {
        Queue<Integer> f1 = new LinkedList<>();
        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            f1.offer(random.nextInt(1000));
        }

        System.out.println("Fila f1 original (tamanho " + f1.size() + ")");
        System.out.println(f1);

        Queue<Integer> f2 = inverterFila(f1);

        System.out.println("\nFila f2 invertida (tamanho " + f2.size() + "):");
        System.out.println(f2);
    }
    
}


