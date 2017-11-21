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

    public ListaEncadeadaNode getProximoNode() {
        try {
            return proximoNode;
        } catch (Exception e) {
            return null;
        }

    }

    public void setProximoNode(ListaEncadeadaNode proximoNode) {
        this.proximoNode = proximoNode;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public boolean isNIL() {
        if (this.data == null) {
            return true;
        } else {
            return false;
        }
    }
}
