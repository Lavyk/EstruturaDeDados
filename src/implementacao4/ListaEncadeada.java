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
        head = new ListaEncadeadaNode();
    }

    @Override
    public boolean isEmpty() {
        if (head.isNIL()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int size() {
        int cont = 0;
        ListaEncadeadaNode aux = head;
        
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
        head = new ListaEncadeadaNode(element, head);
    }

    @Override
    public void remove(int element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int[] toArray() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
