/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementacao4;

import java.util.Objects;

/**
 *
 * @author usuario
 */
public class BSTNode {

    private Object data;
    private BSTNode left;
    private BSTNode right;
    private BSTNode parent;
    
    public BSTNode (){
        
    }
    
    public BSTNode(int element) {
        this.data = element;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public BSTNode getLeft() {
        return left;
    }

    public void setLeft(BSTNode left) {
        this.left = left;
    }

    public BSTNode getRight() {
        return right;
    }

    public void setRight(BSTNode right) {
        this.right = right;
    }

    public BSTNode getParent() {
        return parent;
    }

    public void setParent(BSTNode parent) {
        this.parent = parent;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public String toString() {
        return "BSTNode{" + "data=" + data + ", left=" + left + ", right=" + right + ", parent=" + parent + '}';
    }

    public boolean isEmpty() {
        return this.data == null;
    }
}
