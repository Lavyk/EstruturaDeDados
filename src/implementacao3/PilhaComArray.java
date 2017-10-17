/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementacao3;

/**
 *
 * @author Super i3
 */
class PilhaComArray implements Pilha_IF {

    private int[] pilha;
    private int pos;

    public PilhaComArray() {
        this.pilha = new int[10];
        this.pos = -1;
    }

    @Override
    public void push(int element) throws Exception {
        if (this.pos < this.pilha.length - 1) {
            pos++;
            this.pilha[pos] = element;
        } else {
            throw new Exception("A pilha já está cheia");
        }

    }

    @Override
    public int pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("A pilha está vazia");
        }
        return this.pilha[this.pos--];
    }

    @Override
    public int top() throws Exception {
        if (isEmpty()) {
            throw new Exception("A pilha está vazia");
        }
        return this.pilha[this.pos];
    }

    @Override
    public boolean isEmpty() {
        if (this.pos == -1) {
            return true;
        }
        return false;
    }

    @Override
    public boolean isFull() {
        if (this.pos == this.pilha.length) {
            return true;
        }
        return false;
    }
}
