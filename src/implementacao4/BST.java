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
class BST implements BST_IF {

    private BSTNode root;

    public BST() {
        this.root = new BSTNode();
    }

    @Override
    public void insert(int element) {
        if (this.root.isEmpty()) {
            this.root.setData(element);
            this.root.setParent(null);
        }
    }

    private void insertAux(BSTNode node, int element) {
        if (element < (int) node.getData()) {
            if (node.getLeft() == null) {
                node.setLeft(new BSTNode(element));
                node.getLeft().setParent(node);
            } else {
                insertAux(node.getLeft(), element);
            }
        } else if (element > node.key) {
            if (node.right == null) {
                node.right = new Node(element);
                node.right.parent = node;
            } else {
                insertHelper(node.right, element);
            }
        } else {
            return;
        }
    }

    @Override
    public int search(int element) throws Exception {
        try {
            BSTNode aux = root;

            if (!aux.isEmpty()) {
                while ((int) aux.getData() != (element)) {
                    if ((int) aux.getData() > element) {
                        aux = aux.getLeft();
                    } else {
                        aux = aux.getRight();
                    }
                }
            }
            return (int) aux.getData();
        } catch (Exception e) {
            System.err.println(e);
        }
        return -1;
    }

    @Override
    public int[] preOrder() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int[] order() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int[] postOrder() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isComplete() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
