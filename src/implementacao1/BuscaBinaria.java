/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementacao1;

/**
 *
 * @author usuario
 */
public class BuscaBinaria {
    
    public int BuscaBinaria(int[] vetor, int elemento){
        
        int menor = 0;
        int maior = vetor.length - 1;
        int meio;
        
        while(menor <= maior){
            meio = (menor + maior)/2;
            if(elemento == vetor[meio]){
                return meio;
            } else if(elemento < vetor[meio]) {
                maior = meio - 1;
            } else {
                menor = meio + 1;
            }
        }
        return -1;
    }

    
    public static void main(String[] args) {
        int[] vetor1 = new int[100];
        int[] vetor2 = new int[1000];
        int[] vetor3 = new int[10000];
        
        BuscaBinaria busca = new BuscaBinaria();
        double tempoInicial = System.nanoTime();
        System.out.println(busca.BuscaBinaria(vetor1, -1));
        double tempoDecorrido = System.nanoTime();
        double tempoFinal = tempoDecorrido - tempoInicial;
        System.out.println(tempoFinal);
    }
    
}
