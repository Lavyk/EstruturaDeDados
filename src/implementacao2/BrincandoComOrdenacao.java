/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementacao2;

import java.util.Random;

/**
 *
 * @author Super i3
 */
public class BrincandoComOrdenacao {

    public static void main(String[] args) {
        /*
                array1 elementos distintos ordenados de maneira crescente.
                array2 elementos distintos ordenados de maneira decrescente.
                array3 elementos aleatórios.
         */

        // salva os arrays aleatorios para reutilizar
        int[] arrayRandom = new int[20];
        int[] arrayRandom2 = new int[2000];

        int[] arrayVinteElementos1 = new int[20];
        int[] arrayVinteElementos2 = new int[20];
        int[] arrayVinteElementos3 = new int[20];

        int[] arrayDoisMilElementos1 = new int[2000];
        int[] arrayDoisMilElementos2 = new int[2000];
        int[] arrayDoisMilElementos3 = new int[2000];

        Random r = new Random();

        // preencher os arrays com valores aleatorios
        for (int i = 0; i < arrayRandom.length; i++) {
            arrayRandom[i] = r.nextInt(100);
        }
        for (int i = 0; i < arrayRandom2.length; i++) {
            arrayRandom2[i] = r.nextInt(5000);
        }

        // testa os array de 20 elementos
        testarElementos(arrayVinteElementos1, arrayVinteElementos2, arrayVinteElementos3, arrayRandom, arrayRandom2);

        System.out.println("");

        // testa os array de 2000 elementos
        testarElementos(arrayDoisMilElementos1, arrayDoisMilElementos2, arrayDoisMilElementos3, arrayRandom, arrayRandom2);
    }

    public static void preencherArrays(int[] array1, int[] array2, int[] array3, int[] b, int[] a) {

        int n = (array1.length) - 1;
        for (int i = 0; i < n; i++) {
            array1[i] = i;              // insere numeros crescente distintos
            array2[n - i] = i;         // insere numeros decrescente distintos
        }
        if (array3.length > 20) {
            for (int i = 0; i < array3.length; i++) {
                array3[i] = a[i];
            }
        } else {
            for (int i = 0; i < array3.length; i++) {
                array3[i] = b[i];
            }
        }
    }

    public static void testarElementos(int[] array1, int[] array2, int[] array3, int[] arrayRandom, int[] arrayRandom2) {
        preencherArrays(array1, array2, array3, arrayRandom, arrayRandom2);

        int[][] vetores = {array1, array2, array3};
        int cont = 0;

        System.out.println("Bubble Sort");
        for (int[] vetor : vetores) {
            cont++;
            long tempo1 = System.nanoTime();
            bubbleSort(vetor);
            long tempo2 = System.nanoTime();
            System.out.println("Array" + cont + "[" + vetor.length + " elementos] Tempo total: " + (tempo2 - tempo1));
        }
        cont = 0;
        System.out.println("");

        preencherArrays(array1, array2, array3, arrayRandom, arrayRandom2);

        System.out.println("\nSelection Sort");
        for (int[] vetor : vetores) {
            cont++;
            long tempo1 = System.nanoTime();
            selectionSort(vetor);
            long tempo2 = System.nanoTime();
            System.out.println("Array" + cont + "[" + vetor.length + " elementos] Tempo total: " + (tempo2 - tempo1));
        }
        cont = 0;
        System.out.println("");

        preencherArrays(array1, array2, array3, arrayRandom, arrayRandom2);

        System.out.println("\nInsertion Sort");
        for (int[] vetor : vetores) {
            cont++;
            long tempo1 = System.nanoTime();
            selectionSort(vetor);
            long tempo2 = System.nanoTime();
            System.out.println("Array" + cont + "[" + vetor.length + " elementos] Tempo total: " + (tempo2 - tempo1));
        }
        cont = 0;
        System.out.println("");

        preencherArrays(array1, array2, array3, arrayRandom, arrayRandom2);

        System.out.println("\nMerge Sort");
        for (int[] vetor : vetores) {
            cont++;
            long tempo1 = System.nanoTime();
            mergeSort(vetor);
            long tempo2 = System.nanoTime();
            System.out.println("Array" + cont + "[" + vetor.length + " elementos] Tempo total: " + (tempo2 - tempo1));
        }
        cont = 0;
        System.out.println("");

        preencherArrays(array1, array2, array3, arrayRandom, arrayRandom2);

        System.out.println("\nQuick Sort");
        for (int[] vetor : vetores) {
            cont++;
            long tempo1 = System.nanoTime();
            quickSort(vetor);
            long tempo2 = System.nanoTime();
            System.out.println("Array" + cont + "[" + vetor.length + " elementos] Tempo total: " + (tempo2 - tempo1));
        }
        cont = 0;
        System.out.println("");

        System.out.println("\nCounting Sort");
        for (int[] vetor : vetores) {
            cont++;
            long tempo1 = System.nanoTime();
            countingSort(vetor);
            long tempo2 = System.nanoTime();
            System.out.println("Array" + cont + "[" + vetor.length + " elementos] Tempo total: " + (tempo2 - tempo1));
        }
        cont = 0;
        System.out.println("");

        preencherArrays(array1, array2, array3, arrayRandom, arrayRandom2);

        System.out.println("\nRadix Sort");
        for (int[] vetor : vetores) {
            cont++;
            long tempo1 = System.nanoTime();
            radixSort(vetor);
            long tempo2 = System.nanoTime();
            System.out.println("Array" + cont + "[" + vetor.length + " elementos] Tempo total: " + (tempo2 - tempo1));
        }
        cont = 0;
        System.out.println("");

        preencherArrays(array1, array2, array3, arrayRandom, arrayRandom2);

        System.out.println("\nBucket Sort");
        for (int[] vetor : vetores) {
            cont++;
            long tempo1 = System.nanoTime();
            bucketSort(vetor);
            long tempo2 = System.nanoTime();
            System.out.println("Array" + cont + "[" + vetor.length + " elementos] Tempo total: " + (tempo2 - tempo1));
        }
        cont = 0;

        preencherArrays(array1, array2, array3, arrayRandom, arrayRandom2);
    }

    public static void bubbleSort(int[] vetor) {
        int n = vetor.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    int temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                }
            }
        }
    }

    public static void selectionSort(int[] vetor) {
        int n = vetor.length;
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (vetor[j] < vetor[min]) {
                    min = j;
                }
            }
            int temp = vetor[min];
            vetor[min] = vetor[i];
            vetor[i] = temp;
        }

    }

    public static void insertionSort(int[] vetor) {
        for (int i = 1; i < vetor.length; i++) {
            int key = vetor[i];
            int j = i;
            while ((j > 0) && (vetor[j - 1] > key)) {
                vetor[j] = vetor[j - 1];
                j -= 1;
            }
            vetor[j] = key;
        }

    }

    public static void mergeSort(int vetor[]) {
        int n = vetor.length;
        int min = 0;
        int max = n - 1;
        int[] temp = new int[n];
        ordenaMerge(vetor, temp, min, max);
    }

    private static void ordenaMerge(int[] vetor, int[] temp, int min, int max) {
        if (min < max) {
            int middle = min + (max - min) / 2;
            ordenaMerge(vetor, temp, min, middle);
            ordenaMerge(vetor, temp, middle + 1, max);
            mergeParts(vetor, temp, min, middle, max);
        }
    }

    private static void mergeParts(int[] vetor, int[] temp, int min, int middle, int max) {
        for (int i = min; i <= max; i++) {
            temp[i] = vetor[i];
        }
        int i = min;
        int j = middle + 1;
        int k = min;
        while (i <= middle && j <= max) {
            if (temp[i] <= temp[j]) {
                vetor[k] = temp[i];
                i++;
            } else {
                vetor[k] = temp[j];
                j++;
            }
            k++;
        }
        while (i <= middle) {
            vetor[k] = temp[i];
            k++;
            i++;
        }

    }

    public static void quickSort(int[] vetor) {

        if (vetor == null || vetor.length == 0) {
            return;
        }
        int n = vetor.length;
        quickSortAux(vetor, 0, n - 1);
    }

    private static void quickSortAux(int[] vetor, int min, int max) {

        int i = min;
        int j = max;
        int pivot = vetor[min + (max - min) / 2];
        while (i <= j) {
            while (vetor[i] < pivot) {
                i++;
            }
            while (vetor[j] > pivot) {
                j--;
            }
            if (i <= j) {
                trocaQuick(vetor, i, j);
                i++;
                j--;
            }
        }
        if (min < j) {
            quickSortAux(vetor, min, j);
        }
        if (i < max) {
            quickSortAux(vetor, i, max);
        }
    }

    private static void trocaQuick(int[] vetor, int i, int j) {
        int temp = vetor[i];
        vetor[i] = vetor[j];
        vetor[j] = temp;
    }

    public static void countingSort(int[] vetor) {

        int max = getMax(vetor);
        int numCounts[] = new int[max + 1];

        // populate numCounts
        for (int num : vetor) {
            numCounts[num]++;
        }

        // populate the final sorted array
        int[] sortedArray = new int[vetor.length];
        int currentSortedIndex = 0;

        // for each num in numCounts
        for (int num = 0; num < numCounts.length; num++) {
            int count = numCounts[num];

            // for the number of times the item occurs
            for (int i = 0; i < count; i++) {

                // add it to the sorted array
                sortedArray[currentSortedIndex] = num;
                currentSortedIndex++;
            }
        }
    }

    public static void radixSort(int[] vetor) {
        int m = getMax(vetor);
        for (int i = 1; m / i > 0; i++) {
            countingSort(vetor);
        }
    }

    static int getMax(int[] vetor) {
        int max = vetor[0];
        int n = vetor.length;
        for (int i = 1; i < n; i++) {
            if (vetor[i] > max) {
                max = vetor[i];
            }
        }
        return max;
    }

    public static void bucketSort(int[] vetor) {

        int max = getMax(vetor);
        int[] bucket = new int[max + 1];

        for (int i = 0; i < bucket.length; i++) {
            bucket[i] = 0;
        }

        for (int i = 0; i < vetor.length; i++) {
            bucket[vetor[i]]++;
        }

        int pos = 0;
        for (int i = 0; i < bucket.length; i++) {
            for (int j = 0; j < bucket[i]; j++) {
                vetor[pos++] = i;
            }
        }
    }

}
