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
class PilhaComFilas implements Pilha_IF {

    FilaComArray fila1, fila2;

    public PilhaComFilas() {
        this.fila1 = new FilaComArray();
        this.fila2 = new FilaComArray();
    }

    @Override
    public void push(int element) throws Exception {
        if (!fila1.isFull()) {
            fila2.enqueue(element);
            while (!fila1.isEmpty()) {
                fila2.enqueue(fila1.dequeue());
            }

            while (!fila2.isEmpty()) {
                fila1.enqueue(fila2.dequeue());
            }

        } else {
            throw new Exception("A Pilha está cheia.");
        }
    }

    @Override
    public int pop() throws Exception {
        if (!fila1.isEmpty()) {
            return fila1.dequeue();
        } else {
            throw new Exception("A Pilha está vazia.");
        }
    }

    @Override
    public int top() throws Exception {
        int element;
        if (!fila1.isEmpty()) {
            while (!fila1.isEmpty()) {
                fila2.enqueue(fila1.dequeue());
            }

            element = fila2.head();

            while (!fila2.isEmpty()) {
                fila1.enqueue(fila2.dequeue());
            }
            return element;
        } else {
            throw new Exception("A Pilha está vazia.");
        }
        
    }

    @Override
    public boolean isEmpty() {
        if (fila1.isEmpty()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean isFull() {
        if (fila1.isFull()) {
            return true;
        }
        return false;
    }

}
