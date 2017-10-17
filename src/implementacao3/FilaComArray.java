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
class FilaComArray implements Fila_IF {

    private int[] fila;
    private int head, tail;

    public FilaComArray() {
        this.fila = new int[10];
        this.head = -1;
        this.tail = -1;
    }

    @Override
    public void enqueue(int element) throws Exception {
        if (isFull()) {
            throw new Exception("A fila está cheia.");
        } else if (isEmpty()) {
            this.head++;
            this.tail++;
            this.fila[this.tail] = element;
        } else {
            if (this.tail == this.fila.length - 1) {
                this.tail = 0;
            } else {
                this.tail++;
            }

            this.fila[this.tail] = element;
        }
    }

    @Override
    public int dequeue() throws Exception {
        int element;
        if (isEmpty()) {
            throw new Exception("A fila está vazia.");
        } else if (this.head == this.tail) {
            element = this.fila[head];
            this.head = -1;
            this.tail = -1;

        } else {
            element = this.fila[this.head];
            if (this.head == this.fila.length - 1) {
                this.head = 0;
            } else {
                this.head++;
            }

        }
        return element;
    }

    @Override
    public int head() throws Exception {
        if (!isEmpty()) {
            return this.fila[this.head];
        }
        throw new Exception("A fila está vazia.");
    }

    @Override
    public boolean isEmpty() {
        return (this.head == -1 && this.tail == -1);
    }

    @Override
    public boolean isFull() {
        if (this.tail == this.head + 1) {
            return true;
        }
        return false;
    }

}
