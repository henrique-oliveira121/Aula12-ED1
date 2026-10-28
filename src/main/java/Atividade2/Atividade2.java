/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividade2;
import java.util.Stack;
/**
 *
 * @author lazar
 */
public class Atividade2 {
    
    
    public static void removerItem(Stack<Integer> pilha, int chave) {
        Stack<Integer> pilhaAuxiliar = new Stack<>();

        
        while (!pilha.isEmpty()) {
            int topo = pilha.pop();
            if (topo != chave) {
                pilhaAuxiliar.push(topo);
            }
        }

        while (!pilhaAuxiliar.isEmpty()) {
            pilha.push(pilhaAuxiliar.pop());
        }
    }

    public static void main(String[] args) {
        Stack<Integer> pilha = new Stack<>();
        pilha.push(10);
        pilha.push(20);
        pilha.push(30);
        pilha.push(20);
        pilha.push(40);

        System.out.println("Pilha original " + pilha);
        
        int chaveRemover = 20;
        removerItem(pilha, chaveRemover);

        System.out.println("Pilha apos remover " + chaveRemover + "  " + pilha);
    }
}
