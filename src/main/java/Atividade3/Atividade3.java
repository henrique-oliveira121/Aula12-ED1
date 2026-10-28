/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividade3;

/**
 *
 * @author lazar
 */

    import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Aviao {
    String nome;
    int identificador;

    public Aviao(String nome, int identificador) {
        this.nome = nome;
        this.identificador = identificador;
    }

    @Override
    public String toString() {
        return "Avião [Nome: " + nome + ", ID " + identificador + "]";
    }
}
        public class Atividade3 {
    public static void main(String[] args) {
        Queue<Aviao> filaDecolagem = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("CONTROLE DE PISTA DE DECOLAGEM");
            System.out.println("1 Listar numero de avioes");
            System.out.println("2 Autorizar decolagem do aviao");
            System.out.println("3 Adicionar um aviao");
            System.out.println("4 Listar todos os aviaes");
            System.out.println("5 Mostrar caracteristicas do primeiro aviao");
            System.out.println("0 Sair");
            System.out.print("Escolha uma opcao ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Avioes aguardando " + filaDecolagem.size());
                    break;
                case 2:
                    if (filaDecolagem.isEmpty()) {
                        System.out.println("Nao ha avioes na fila");
                    } else {
                        Aviao decolando = filaDecolagem.poll();
                        System.out.println("Decolagem autorizada para: " + decolando);
                    }
                    break;
                case 3:
                    System.out.print("Digite o nome do aviao: ");
                    String nome = scanner.nextLine();
                    System.out.print("Digite o identificador do aviao ");
                    int id = scanner.nextInt();
                    filaDecolagem.offer(new Aviao(nome, id));
                    System.out.println("Aviao adicionado à fila");
                    break;
                case 4:
                    if (filaDecolagem.isEmpty()) {
                        System.out.println("A fila esta vazia.");
                    } else {
                        System.out.println(" Fila de Espera ");
                        for (Aviao a : filaDecolagem) {
                            System.out.println(a);
                        }
                    }
                    break;
                case 5:
                    if (filaDecolagem.isEmpty()) {
                        System.out.println("A fila esta vazia.");
                    } else {
                        System.out.println("Proximo a decolar: " + filaDecolagem.peek());
                    }
                    break;
                case 0:
                    System.out.println("Encerrando o sistema");
                    break;
                default:
                    System.out.println("Opção invalida!");
            }
        } while (opcao != 0);

        scanner.close();
    }
}
   
