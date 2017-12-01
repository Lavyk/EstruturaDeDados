/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementacao4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
        } else {
            insertAux(root, element);
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
        } else if (element > (int) node.getData()) {
            if (node.getRight() == null) {
                node.setRight(new BSTNode(element));
                node.getRight().setParent(node);
            } else {
                insertAux(node.getRight(), element);
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
        List<Integer> listPreOrder = new ArrayList<>();

        preOrderAux(root, listPreOrder);

        int[] arr = new int[listPreOrder.size()];
        for (int i = 0; i < listPreOrder.size(); i++) {
            if (listPreOrder.get(i) != null) {
                arr[i] = listPreOrder.get(i);
            }
        }
        return arr;
    }

    private void preOrderAux(BSTNode node, List a) {
        if (node == null) {
            return;
        }
        a.add((int) node.getData());
        preOrderAux(node.getLeft(), a);
        preOrderAux(node.getRight(), a);
    }

    @Override
    public int[] order() {
        List<Integer> listOrder = new ArrayList<>();
        preOrderAux(root, listOrder);

        int[] arr = new int[listOrder.size()];
        for (int i = 0; i < listOrder.size(); i++) {
            if (listOrder.get(i) != null) {
                arr[i] = listOrder.get(i);
            }
        }
        return arr;

    }

    private void inOrderAux(BSTNode node, List a) {
        if (node == null) {
            return;
        }

        inOrderAux(node.getLeft(), a);
        a.add((int) node.getData());
        inOrderAux(node.getRight(), a);
    }

    @Override
    public int[] postOrder() {
        List<Integer> listPostOrder = new ArrayList<>();
        preOrderAux(root, listPostOrder);

        int[] arr = new int[listPostOrder.size()];
        for (int i = 0; i < listPostOrder.size(); i++) {
            if (listPostOrder.get(i) != null) {
                arr[i] = listPostOrder.get(i);
            }
        }
        return arr;
    }

    private void postOrderAux(BSTNode node, List a) {
        if (node == null) {
            return;
        }
        postOrderAux(node.getLeft(), a);
        postOrderAux(node.getRight(), a);
        a.add((int) node.getData());
    }

    @Override
    public boolean isComplete() {
        return isCompleteAux(this.root, 0, totalNodes(this.root));

    }

    private boolean isCompleteAux(BSTNode root, int index, int numNodes) {
        if (root == null) {
            return true;
        }

        if (index >= numNodes) {
            return false;
        }

        return (isCompleteAux(root.getLeft(), 2 * index + 1, numNodes) && isCompleteAux(root.getRight(), 2 * index + 2, numNodes));
    }

    private int totalNodes(BSTNode root) {
        if (root == null) {
            return (0);
        }
        return (1 + totalNodes(root.getLeft()) + totalNodes(root.getRight()));
    }

}
