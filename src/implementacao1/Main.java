/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementacao1;

/**
 *
 * @author Super i3
 */
public class Main {

    public static void main(String[] args) {
        Busca busca = new Busca();

        int[] vetor1 = new int[100];
        int[] vetor2 = new int[1000];
        int[] vetor3 = new int[10000];

        int[][] vetores = {vetor1, vetor2, vetor3};
        int cont = 0;

        System.out.println("Busca Linear");
        for (int[] vetor : vetores) {
            cont++;
            long tempo1 = System.nanoTime();
            busca.linear(vetor, -1);
            long tempo2 = System.nanoTime();
            System.out.println("Vetor" + cont + "[" + vetor.length + " elementos] Tempo total: " + (tempo2 - tempo1));
        }

        cont = 0;
        System.out.println("\nBusca Binária");
        for (int[] vetor : vetores) {
            cont++;
            long tempo1 = System.nanoTime();
            busca.binaria(vetor, -1);
            long tempo2 = System.nanoTime();
            System.out.println("Vetor" + cont + "[" + vetor.length + " elementos] Tempo total: " + (tempo2 - tempo1));
        }

    }
}
