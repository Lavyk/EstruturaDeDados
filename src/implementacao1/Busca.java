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
public class Busca {

    public int binaria(int[] vetor, int elemento) {

        int menor = 0;
        int maior = vetor.length - 1;
        int meio;

        while (menor <= maior) {
            meio = (menor + maior) / 2;
            if (elemento == vetor[meio]) {
                return meio;
            } else if (elemento < vetor[meio]) {
                maior = meio - 1;
            } else {
                menor = meio + 1;
            }
        }
        return -1;
    }

    public int linear(int[] array, int elemento) {
        int pos = 0;
        for (int objArray : array) {
            if (objArray == elemento) {
                return pos;
            }
            pos++;
        }
        return -1;
    }
}
