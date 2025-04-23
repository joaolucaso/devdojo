package Mcolecoes.test;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTeste01 {
    public static void main(String[] args) {
// Criando uma fila com prioridade (menor valor tem mais prioridade)
        Queue<Integer> fila = new PriorityQueue<>();

        // Adicionando elementos
        fila.add(30);
        fila.add(10);
        fila.add(20);

        // Mostrando a fila
        System.out.println("Fila: " + fila);

        // Espiando o primeiro da fila (sem remover)
        System.out.println("Primeiro da fila (peek): " + fila.peek());

        // Removendo elementos (sempre o de maior prioridade — menor valor)
        System.out.println("Removendo: " + fila.poll());
        System.out.println("Removendo: " + fila.poll());

        // Fila após remoções
        System.out.println("Fila agora: " + fila);




    }
}
