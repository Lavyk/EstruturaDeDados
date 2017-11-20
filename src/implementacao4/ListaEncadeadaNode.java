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
public class ListaEncadeadaNode {

    private ListaEncadeadaNode proximoNode;
    private Object data;

    public ListaEncadeadaNode() {

    }

    public ListaEncadeadaNode(Object data, ListaEncadeadaNode proximoNode) {
        this.data = data;
        this.proximoNode = proximoNode;
    }

}
