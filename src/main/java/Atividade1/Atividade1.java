/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividade1;
        import java.util.Scanner;
        import java.util.Stack;
/**
 *
 * @author lazar
 */
public class Atividade1 {
        
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite seu texto: ");
        String texto = scanner.nextLine();

        Stack<Character> pilha = new Stack<>();

        for (int i = 0; i < texto.length(); i++) {
            pilha.push(texto.charAt(i));
        }

 
        System.out.print(" Texto invertido: ");
        Stack<Character> pilhaAuxiliar = (Stack<Character>) pilha.clone();
        while (!pilhaAuxiliar.isEmpty()) {
            System.out.print(pilhaAuxiliar.pop());
        }
        System.out.println();

        String textoL = texto.replaceAll("[\\s.]", "").toLowerCase();
        
        Stack<Character> pilhaPalindromo = new Stack<>();
        for (int i = 0; i < textoL.length(); i++) {
            pilhaPalindromo.push(textoL.charAt(i));
        }

        boolean Palindromo = true;
        for (int i = 0; i < textoL.length(); i++) {
            if (textoL.charAt(i) != pilhaPalindromo.pop()) {
                Palindromo = false;
                break;
            }
        }

        if (Palindromo) {
            System.out.println("O texto e um palindromo");
        } else {
            System.out.println("O texto NAO e um palindromo");
        }
        
        scanner.close();
    }
}
 
