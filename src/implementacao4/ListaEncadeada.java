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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void insert(int element) {
        head = new ListaEncadeadaNode(element, this.head);
    }

    @Override
    public void remove(int element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
