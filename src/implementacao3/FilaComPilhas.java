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
class FilaComPilhas implements Fila_IF {

    private PilhaComArray pilha1, pilha2;

    public FilaComPilhas() {
        pilha1 = new PilhaComArray();
        pilha2 = new PilhaComArray();
    }

    @Override
    public void enqueue(int element) throws Exception {
        if (this.pilha1.isFull()) {
            throw new Exception("A Fila está cheia.");
        } else {
            this.pilha1.push(element);
        }
    }

    @Override
    public int dequeue() throws Exception {
        int element;
        if (this.pilha1.isEmpty()) {
            throw new Exception("A fila está vazia, não pode tirar nada.");
        } else if (this.pilha2.isEmpty()) {
            while (!this.pilha1.isEmpty()) {
                this.pilha2.push(this.pilha1.pop());
            }
        }

        element = this.pilha2.pop();

        if (this.pilha1.isEmpty()) {
            while (!this.pilha2.isEmpty()) {
                this.pilha1.push(this.pilha2.pop());
            }
        }

        return element;
    }

    @Override
    public int head() throws Exception {
        int element;
        if (this.pilha1.isEmpty()) {
            throw new Exception("A fila está vazia.");
        } else if (this.pilha2.isEmpty()) {
            while (!this.pilha1.isEmpty()) {
                this.pilha2.push(this.pilha1.pop());
            }
        }

        element = this.pilha2.top();

        if (this.pilha1.isEmpty()) {
            while (!this.pilha2.isEmpty()) {
                this.pilha1.push(this.pilha2.pop());
            }
        }

        return element;
    }

    @Override
    public boolean isEmpty() {
        return this.pilha1.isEmpty();
    }

    @Override
    public boolean isFull() {
        return this.pilha1.isFull();
    }

}
