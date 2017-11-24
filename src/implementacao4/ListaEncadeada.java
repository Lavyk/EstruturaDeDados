/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementacao4;

/**
 *
 * @author usuario
 */
public class ListaEncadeada implements ListaEncadeada_IF {

    private ListaEncadeadaNode head;

    public ListaEncadeada() {
        this.head = new ListaEncadeadaNode();
    }

    @Override
    public boolean isEmpty() {
        if (this.head.isNIL()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int size() {
        int cont = 0;
        ListaEncadeadaNode aux = this.head;

        while (aux.getProximoNode() != null) {
            aux = aux.getProximoNode();
            cont += 1;
        }
        return cont;
    }

    @Override
    public int search(int element) throws Exception {
        ListaEncadeadaNode aux = this.head;
        try {
            while (!aux.isNIL() && (int) aux.getData() != element) {
                aux = aux.getProximoNode();
            }
            return (int) aux.getData();
        } catch (Exception e) {
            System.err.println(e);
            return -1;
        }
    }

    @Override
    public void insert(int element) {
        this.head = new ListaEncadeadaNode(element, this.head);
    }

    @Override
    public void remove(int element) {
        if((int) this.head.getData() == element){
            this.head = this.head.getProximoNode();
        } else {
            ListaEncadeadaNode aux = this.head;
            ListaEncadeadaNode previous = new ListaEncadeadaNode();
            while(!aux.isNIL() && (int) aux.getData() != element){
                previous = aux;
                aux = aux.getProximoNode();
            }
            if(!aux.isNIL()){
                previous.setProximoNode(aux.getProximoNode());
            }
        }
    }

    @Override
    public int[] toArray() {
        int[] array = new int[this.size()];
        ListaEncadeadaNode aux = this.head;
        for (int i = 0; i <= this.size() - 1; i++) {
            int a = Integer.parseInt(aux.getData().toString());
            array[i] = a;
            aux = aux.getProximoNode();
        }

        return array;
    }

}
