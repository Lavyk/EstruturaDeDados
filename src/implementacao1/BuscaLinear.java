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
public class BuscaLinear {
    public int buscaLinear(int[] array, int elemento){
        int pos = 0;
        for(int objArray : array){
            if(objArray == elemento){
                return pos;
            }
            pos++;
        }
        return -1;
    }
    
    //Exemplo
    
        public static void main(String[] args) {
        int[] vetor1 = new int[100];
        int[] vetor2 = new int[1000];
        int[] vetor3 = new int[10000];
        
        BuscaLinear busca = new BuscaLinear();
        double tempoInicial = System.nanoTime();
        System.out.println(busca.buscaLinear(vetor1, -1));
        double tempoDecorrido = System.nanoTime();
        double tempoFinal = tempoDecorrido - tempoInicial;
        System.out.println(tempoFinal);
                
    }
    
}
